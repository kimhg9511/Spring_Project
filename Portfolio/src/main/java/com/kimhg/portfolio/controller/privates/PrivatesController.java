package com.kimhg.portfolio.controller.privates;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kimhg.portfolio.domain.Criteria;
import com.kimhg.portfolio.domain.PageMaker;
import com.kimhg.portfolio.domain.WalletVO;
import com.kimhg.portfolio.service.WalletService;


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
}