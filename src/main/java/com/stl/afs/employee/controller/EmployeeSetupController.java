package com.stl.afs.employee.controller;

import com.stl.afs.employee.service.IEmployeeSetupService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ARNAB on 1/11/2015.
 */
@Controller
@RequestMapping("/employee")
public class EmployeeSetupController {
    public IEmployeeSetupService employeeSetupService;

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap model){
        model.addAttribute("employeeList", employeeSetupService.getAllEmployee());
        return "employee/index";
    }

    public void setEmployeeSetupService(IEmployeeSetupService employeeSetupService) {
        this.employeeSetupService = employeeSetupService;
    }
}
