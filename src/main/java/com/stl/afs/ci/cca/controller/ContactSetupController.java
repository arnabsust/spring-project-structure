package com.stl.afs.ci.cca.controller;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/contactsetup")
public class ContactSetupController {
	private static final Logger logger = LoggerFactory.getLogger(ContactSetupController.class);

	public ContactSetupController() {
		System.out.println("-----Contact Setup Controller-----");
	}

	private ContactSetupDao contactSetupDao;
	public void setContactSetupDao(ContactSetupDao contactSetupDao) {
		this.contactSetupDao = contactSetupDao;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap model) {
		contactSetupDao.showDepedency();

		model.addAttribute("message", "Hello world! Nice to see you in the planet");
		return "ci/contactsetup/index";
	}
}