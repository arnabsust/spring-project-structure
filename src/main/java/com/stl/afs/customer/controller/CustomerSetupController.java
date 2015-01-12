package com.stl.afs.customer.controller;

import com.stl.afs.customer.service.ICustomerSetupService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ARNAB on 1/10/2015.
 */
@Controller
@RequestMapping("/customer")
public class CustomerSetupController {

    private ICustomerSetupService customerSetupService;

    public CustomerSetupController() {
        System.out.println("----Customer Setup Controller----");
    }

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap model){
        model.addAttribute("customerList", customerSetupService.getAllCustomer());
        return "customer/index";
    }

    public void setCustomerSetupService(ICustomerSetupService customerSetupService) {
        this.customerSetupService = customerSetupService;
    }
}
