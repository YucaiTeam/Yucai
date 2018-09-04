package com.hyg.yucai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hyg.yucai.model.TCouresAndSeries;
import com.hyg.yucai.service.TCourseAndSeriesService;

@Controller
public class CourseAndSeriesController {

	@Autowired
	private TCourseAndSeriesService tCourseAndSeriesService;

	// 课程页面
	@RequestMapping("/showcourse")
	public ModelAndView showTable() {

		ModelAndView modelAndView = new ModelAndView();

		List<TCouresAndSeries> list = tCourseAndSeriesService.findCourseAndSeries();

		modelAndView.addObject("courseAndSeries", list);

		modelAndView.setViewName("class_list");

		return modelAndView;
	}
}
