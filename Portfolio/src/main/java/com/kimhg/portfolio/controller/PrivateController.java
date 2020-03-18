package com.kimhg.portfolio.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("/private/*")
@RequestMapping(value="/private/*", method = RequestMethod.GET)
public class PrivateController {
	private static final Logger logger = LoggerFactory.getLogger(PrivateController.class);
	@RequestMapping(value="profile", method = RequestMethod.GET)
	public String ProfileView() throws Exception{
		logger.info("profile call");
		return "private/profile.tiles";
	}
}
