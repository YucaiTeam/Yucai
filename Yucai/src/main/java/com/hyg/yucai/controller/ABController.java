package com.hyg.yucai.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hyg.yucai.model.TAreaCustom;
import com.hyg.yucai.model.TBank;
import com.hyg.yucai.service.TABService;

@Controller
public class ABController {

	@Autowired
	private TABService tABService;
	
	//获取地区银行相关信息
	@RequestMapping("/getab")
	@ResponseBody
	public List<TAreaCustom> getAreaAndBank(HttpServletResponse response){
		
		response.setHeader("Access-Control-Allow-Origin", "*");
		
		List<TAreaCustom> list = tABService.getAreaAndBank();
		
		return list;
	}
	//根据地区编号获取对应银行
	@RequestMapping("/getbank")
	@ResponseBody
	public List<TBank> getBankByAreano(String areano){
		
		return tABService.getBankByAreano(areano);
	}
	
	
}
