package com.example.sbadmin.pages.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("/login")
public class LoginController {
	@RequestMapping(value="login")
	public ModelAndView LoginView(ModelAndView mv) throws Exception{
		mv.setViewName("pages/login");
		return mv;
	}
}