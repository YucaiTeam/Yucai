package com.hyg.yucai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hyg.yucai.model.TStar;
import com.hyg.yucai.model.TStarExample;
import com.hyg.yucai.model.TVideo;
import com.hyg.yucai.model.TVideoExample;
import com.hyg.yucai.service.TStarService;
import com.hyg.yucai.service.TVideoService;

@Controller
public class HomeController {
	@Autowired
	TStarService tStarService;
	@Autowired
	TVideoService tVideoService;

	// 获取明星学员，跳转到首页
	@RequestMapping("/index")
	public ModelAndView showHomePage() {
		ModelAndView mav = new ModelAndView();
		TStarExample example = new TStarExample();
		List<TStar> stars = tStarService.getStars(example);
		TVideoExample example2 = new TVideoExample();
		List<TVideo> videos = tVideoService.getVideos(example2);
		mav.addObject("stars", stars);
		mav.addObject("videos", videos);
		mav.setViewName("index");
		return mav;
	}
}
