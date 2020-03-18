package com.kimhg.portfolio.profiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("profiles/*")
public class ProfilesController {
	
	@RequestMapping(value="/profile")
	public ModelAndView ProfileView(ModelAndView mv) throws Exception{
		
		mv.setViewName("profiles/profile.tiles");
		return mv;
	}
}