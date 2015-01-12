package com.stl.afs.dep.dao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ARNAB on 1/9/2015.
 */
@Controller
@RequestMapping("/depositaccountopening")
public class DepositAccountOpeningController {
    public DepositAccountOpeningController() {
        System.out.println("-----Deposit Account Opening Controller-----");
    }

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("message", "Hello world! Nice to see you in the planet");
        return "ci/contactsetup/index";
    }
}
