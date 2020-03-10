package com.example.sbadmin.otherPages.BlankPages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("/blank")
public class BlankPagesController {
	@RequestMapping(value="blank")
	public ModelAndView BlankPagesView(ModelAndView mv) throws Exception{
		mv.setViewName("pages/blank");
		return mv;
	}
}