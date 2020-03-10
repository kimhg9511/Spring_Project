package com.example.sbadmin.pages.register;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("/register")
public class RegisterController {
	@RequestMapping(value="register")
	public ModelAndView RegisterView(ModelAndView mv) throws Exception{
		mv.setViewName("pages/register");
		return mv;
	}
}