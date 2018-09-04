package com.hyg.yucai.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hyg.yucai.model.News;
import com.hyg.yucai.model.TArea;
import com.hyg.yucai.model.TBank;
import com.hyg.yucai.model.TNews;
import com.hyg.yucai.service.TABService;
import com.hyg.yucai.service.TNewsService;

@Controller
public class NewsController {

	@Autowired
	private TNewsService tNewsService;
	@Autowired
	private TABService tABService;

	/**
	 * 显示新闻页面 包含初次加载的地区以及银行
	 * 
	 * @return
	 */
	@RequestMapping("/hotspots")
	public ModelAndView showNewsPage() {

		ModelAndView modelAndView = new ModelAndView();

		List<TArea> arealist = tABService.getAllArea(null);
		List<TBank> banklist = tABService.getAllBank(null);

		modelAndView.addObject("arealist", arealist);
		modelAndView.addObject("banklist", banklist);

		modelAndView.setViewName("hotspots");

		return modelAndView;

	}

	// 获取简要新闻分页
	@RequestMapping("/getnewssimple")
	@ResponseBody
	public Map<String, Object> getNewsSimple(HttpServletResponse response, News news) {
		response.setHeader("Access-Control-Allow-Origin", "*");

		Map<String, Object> map = new HashMap<String, Object>();

		// 获取新闻总条数
		int count = tNewsService.getNewsCount(news);
		System.out.println("总条数:" + count);

		// 获取相关新闻信息
		map.put("news", tNewsService.getNewsSimple(news));

		map.put("total", count);

		return map;
	}

	// 显示新闻详细页面
	@RequestMapping("/showdetails")
	public ModelAndView shwoNewsDetails(int id) throws ParseException {

		ModelAndView modelAndView = new ModelAndView();

		TNews tNews = tNewsService.getOneNews(id);

		String d = this.dateFormat(tNews.getEditdate());

		modelAndView.addObject("newsDetails", tNews);

		modelAndView.addObject("edittime", d);

		modelAndView.setViewName("news_detail");

		return modelAndView;

	}

	// 显示右侧导航
	@RequestMapping("/showright")
	public String showRight() {

		return "rightnav";

	}

	// 时间格式转换 yyyy-MM-dd HH:mm
	public String dateFormat(Date date) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.US);

		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm ");

		String d = sdf.format(date);

		return d;

	}

	// 测试新闻
	@RequestMapping("/testarticle")
	public String shownews() {

		return "NewsDetail";

	}

}
