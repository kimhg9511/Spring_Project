package com.kimhg.portfolio.controller.privates;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("privates/*") // higher url
public class PrivatesController {
	private static final Logger logger = LoggerFactory.getLogger(PrivatesController.class);
	
	@RequestMapping(value="/profile") // lower url
	public ModelAndView ProfileView(ModelAndView mv) throws Exception{
		logger.info("Profile Call..."); // get info log
		mv.setViewName("privates/profile.tiles"); // set url(ModelAndView)
		return mv;
	}
	@RequestMapping(value="/wallet") // lower url
	public ModelAndView WalletView(ModelAndView mv) throws Exception{
		logger.info("Wallet Call..."); // get info log
		mv.setViewName("privates/wallet.tiles"); // set url(ModelAndView)
		return mv;
	}
	
}