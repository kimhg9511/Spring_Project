package com.example.sbadmin.dashBoard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("/")
public class DashBoardController {
	
	@RequestMapping(value="/")
	public ModelAndView DashBoardView(ModelAndView mv) throws Exception{
		mv.setViewName("dashBoard/dashBoard.tiles");
		return mv;
	}
}
