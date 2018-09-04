package com.hyg.yucai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hyg.yucai.model.TArea;
import com.hyg.yucai.model.TBank;
import com.hyg.yucai.service.TABService;

@Controller
public class PracticeController {
	@Autowired
	TABService tABService;

	/**
	 * 显示每日一练
	 * 包含初次加载的地区以及银行
	 * 目前用时政热点数据代替，待完成！！！！
	 * @return
	 */
	@RequestMapping("/practice")
	public ModelAndView showNewsPage() {

		ModelAndView modelAndView = new ModelAndView();

		List<TArea> arealist = tABService.getAllArea(null);
		List<TBank> banklist = tABService.getAllBank(null);

		modelAndView.addObject("arealist", arealist);
		modelAndView.addObject("banklist", banklist);

		modelAndView.setViewName("practice");

		return modelAndView;

	}
}
