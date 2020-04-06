package com.kimhg.portfolio.controller.portfolios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/portfolios/authenticaion/*") // higher url
public class AuthenticationController {
	private static final Logger logger = LoggerFactory.getLogger(PortfoliosController.class);
	
	
	@RequestMapping(value="login") // lower url
	public ModelAndView LoginView(ModelAndView mv) throws Exception{
		logger.info("Login Call..."); // get info log
		mv.setViewName("portfolios/authentication/login"); // set url(ModelAndView)
		return mv;
	}
	
	@RequestMapping(value="register", method = RequestMethod.GET) // lower url
	public ModelAndView RegisterView(ModelAndView mv) throws Exception{
		logger.info("Register Call..."); // get info log
		mv.setViewName("portfolios/authentication/register"); // set url(ModelAndView)
		return mv;
	}
	
	@RequestMapping(value="forgot-password") // lower url
	public ModelAndView ForgotPasswordView(ModelAndView mv) throws Exception{
		logger.info("Forgot-Password Call..."); // get info log
		mv.setViewName("portfolios/authentication/forgot-password"); // set url(ModelAndView)
		return mv;
	}
}