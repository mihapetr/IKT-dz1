package com.infobip.pmf.course;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Service {

    Map<String, String> params;

    @GetMapping("/versions/max")
    public String processMax(
            @RequestParam Map<String,String> params
    ) {

        this.params = params;
        checkParamNames_max();

        return params.toString();
    }

    /**
     * Check if there are ONLY two parameters given and if their names are <i>v1</i> and <i>v2</i>.
     * @return true if condition is met
     */
    private boolean checkParamNames_max() {

        return true;
    }

    @GetMapping("/versions/next")
    public String processNext(
            @RequestParam Map<String,String> params
    ) {

        checkParamNames_next();

        return params.toString();
    }

    /**
     * Check if there are ONLY two parameters given and if their names are <i>v</i> and <i>type</i>.
     * @return true if condition is met
     */
    private boolean checkParamNames_next() {

        return true;
    }
}
