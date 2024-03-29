package com.infobip.pmf.course;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static java.lang.Integer.max;

@RestController
public class Service {

    Map<String, String> params;
    SemVerValidator validator = new SemVerValidator();
    SemVerValidator validator2 = new SemVerValidator();
    String message;

    @GetMapping("/versions/max")
    public String processMax(
            @RequestParam Map<String,String> params
    ) {

        this.params = params;
        if(!checkParamNames_max()) return "Bad input! Check parameter names. :(";

        String v1 = params.get("v1");
        String v2 = params.get("v2");
        if (!checkForm(v1, validator)) return "Invalid SemVer expression: " + message;
        if (!checkForm(v2, validator2)) return "Invalid SemVer expression: " + message;

        // compares values fetched by validators
        int cmp = compareSemVers(validator, validator2);

        return cmp <= 0 ? v2 : v1;
    }

    private int compareSemVers(SemVerValidator v1, SemVerValidator v2) {

        if (v1.major.compareTo(v2.major) < 0) return -1;
        if (v1.major.compareTo(v2.major) > 0) return 1;

        // major is the same

        if (v1.minor.compareTo(v2.minor) < 0) return -1;
        if (v1.minor.compareTo(v2.minor) > 0) return 1;

        // minor is the same

        if (v1.patch.compareTo(v2.patch) < 0) return -1;
        if (v1.patch.compareTo(v2.patch) > 0) return 1;

        // core version is the same

        if(v1.pre.isEmpty()) {

            if(!v2.pre.isEmpty()) return 1; // v2 is pre and v1 is not

            return 0;   // core the same and neither is prerelease
        }

        // v1 is prerelease

        if(v2.pre.isEmpty()) return -1; // v1 is pre and v2 is not

        // both are prerelease -> compare pre_release_id

        int M = max(v1.pre.size(), v2.pre.size());

        for (int i = 0; i < M; i++) {

            int i1, i2, aux;
            String s1, s2;

            try {
                s1 = v1.pre.get(i);
            } catch (IndexOutOfBoundsException e) {
                try {
                    s2 = v2.pre.get(i);
                } catch (IndexOutOfBoundsException f) {
                    // they are the same at this point
                    return 0;
                }
                // s1 smaller set of fields
                return -1;
            }

            try {
                s2 = v2.pre.get(i);
            } catch (IndexOutOfBoundsException e) {
                // s2 smaller set of fields
                return 1;
            }

            // normal iteration flow ... number compare -> lex compare

            if (0 <= (i1 = isNum(s1))) {
                if (0 <= (i2 = isNum(s2))) {
                    // they are both numbers
                    aux = Integer.compare(i1, i2);
                    if(aux == 0) continue;
                    return aux;
                }
            }

            // s1 is not a number
            if (0 <= (i2 = isNum(s2))) {
                return 1;   // s2 is a number
            }

            // they are both not numbers
            aux =  s1.compareTo(s2);
            if(aux == 0) continue;
            return aux;
        }

        return 0;
    }

    /**
     * Assumption is that we are working with positive integers.
     * Hence the -1 as exception.
     * @param s parsed string
     * @return parsed integer from string if possible
     */
    int isNum(String s) {

        try{
            return Integer.parseInt(s);
        }
        catch (Exception e) {
            return -1;
        }
    }

    /**
     * Check if there are ONLY two parameters given and if their names are <i>v1</i> and <i>v2</i>.
     * @return true if condition is met
     */
    private boolean checkParamNames_max() {

        return params.size() == 2 && params.get("v1") != null && params.get("v2") != null;
    }

    @GetMapping("/versions/next")
    public String processNext(
            @RequestParam Map<String,String> params
    ) {

        this.params = params;
        if (!checkParamNames_next()) return "Bad input! Check parameter names. :(";

        String type = params.get("type");
        String v = params.get("v");
        if (!checkForm(v, validator)) return "Invalid SemVer expression: " + message;

        switch (type) {
            case "MAJOR" -> {
                validator.major = "" + (Integer.parseInt(validator.major) + 1);
                validator.minor = "0";
                validator.patch = "0";
            }
            case "MINOR" -> {
                validator.minor = "" + (Integer.parseInt(validator.minor) + 1);
                validator.patch = "0";
            }
            case "PATCH" -> {
                validator.patch = "" + (Integer.parseInt(validator.patch) + 1);
            }
            default -> {
                return "Unsupported type. Expecting {MAJOR, MINOR, PATCH}";
            }
        }

        return validator.major + '.' + validator.minor + '.' + validator.patch;
    }

    private boolean checkForm(String v, SemVerValidator validator) {

        message = validator.validate(v);
        return message == null;
    }

    /**
     * Check if there are ONLY two parameters given and if their names are <i>v</i> and <i>type</i>.
     * @return true if condition is met
     */
    private boolean checkParamNames_next() {

        return params.size() == 2 && params.get("v") != null && params.get("type") != null;
    }
}
