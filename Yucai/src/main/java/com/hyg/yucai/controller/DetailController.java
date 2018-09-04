package com.hyg.yucai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hyg.yucai.model.TCourse;
import com.hyg.yucai.model.TDetail;
import com.hyg.yucai.model.TDetailExample;
import com.hyg.yucai.service.TCourseAndSeriesService;
import com.hyg.yucai.service.TDetailService;

@Controller
@RequestMapping("/details")
public class DetailController {

	@Autowired
	private TDetailService tDetailService;
	@Autowired
	private TCourseAndSeriesService tCourseAndSeriesService;

	// 显示课程详情页面
	@RequestMapping("/getdetail")
	public ModelAndView showDetail(int courseid) {
		System.out.println("课程id+" + courseid);
		TDetailExample example = new TDetailExample();
		example.createCriteria().andCourseidEqualTo(courseid);
		List<TDetail> list = tDetailService.getDetailByCourseId(example);
		TCourse list2 = tCourseAndSeriesService.findCourseById(courseid);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("details", list);
		System.out.println(list);
		modelAndView.addObject("course", list2);
		modelAndView.setViewName("course_detail");
		System.out.println("课程编号为:" + courseid);
		return modelAndView;
	}

}
