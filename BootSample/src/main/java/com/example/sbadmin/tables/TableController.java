package com.example.sbadmin.tables;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("/tables")
public class TableController {
	@RequestMapping(value="tables")
	public ModelAndView TableView(ModelAndView mv) throws Exception{
		mv.setViewName("tables/tables");
		return mv;
	}
}