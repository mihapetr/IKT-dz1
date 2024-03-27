package com.infobip.pmf.course;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

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

        return "" + cmp;
    }

    private int compareSemVers(SemVerValidator v1, SemVerValidator v2) {

        if (v1.major.compareTo(v2.major) < 0) return -1;
        if (v1.major.compareTo(v2.major) > 0) return 1;

        if (v1.minor.compareTo(v2.minor) < 0) return -1;
        if (v1.minor.compareTo(v2.minor) > 0) return 1;

        if (v1.patch.compareTo(v2.patch) < 0) return -1;
        if (v1.patch.compareTo(v2.patch) > 0) return 1;

        // core version is the same

        if (v1.pre != null && v2.pre == null) return -1;
        if (v1.pre == null && v2.pre != null) return 1;

        // they are both prerelease -> compare lex

        // todo

        return 0;
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
            }
            case "MINOR" -> {
                validator.minor = "" + (Integer.parseInt(validator.minor) + 1);
            }
            case "PATCH" -> {
                validator.patch = "" + (Integer.parseInt(validator.patch) + 1);
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
