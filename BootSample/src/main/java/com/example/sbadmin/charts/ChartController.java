package com.example.sbadmin.charts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("/charts")
public class ChartController {
	@RequestMapping(value="charts")
	public ModelAndView ChartView(ModelAndView mv) throws Exception{
		mv.setViewName("charts/charts");
		return mv;
	}
}