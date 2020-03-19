package com.kimhg.portfolio.profiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("profiles/*")
@RequestMapping("profiles/*")
public class ProfilesController {
	private static final Logger logger = LoggerFactory.getLogger(ProfilesController.class);
	
	@RequestMapping(value="/profile")
	public ModelAndView ProfileView(ModelAndView mv) throws Exception{
		logger.info("Profile Call...");
		mv.setViewName("profiles/profile.tiles");
		return mv;
	}
}