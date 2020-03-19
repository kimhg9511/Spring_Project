package com.kimhg.portfolio.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("/")
public class DashBoardController {
	private static final Logger logger = LoggerFactory.getLogger(DashBoardController.class);
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView DashBoardView(ModelAndView mv) {
		mv.setViewName("dashboard.tiles");
		logger.info("DashBoard Home!");
		return mv;
	}
}
