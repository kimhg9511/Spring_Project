package com.example.sbadmin.otherPages.notFoundPages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("/404")
public class NotFoundPagesController {
	@RequestMapping(value="404")
	public ModelAndView NotFoundPagesView(ModelAndView mv) throws Exception{
		mv.setViewName("pages/404");
		return mv;
	}
}