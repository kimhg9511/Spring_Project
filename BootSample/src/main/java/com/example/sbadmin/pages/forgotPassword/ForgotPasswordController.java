package com.example.sbadmin.pages.forgotPassword;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("/forgot-password")
public class ForgotPasswordController {
	@RequestMapping(value="forgot-password")
	public ModelAndView ForgotPasswordView(ModelAndView mv) throws Exception{
		mv.setViewName("pages/forgot-password");
		return mv;
	}
}