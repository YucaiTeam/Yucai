package com.hyg.yucai.mapper;

import java.util.List;

import com.hyg.yucai.model.News;
import com.hyg.yucai.model.TNews;

public interface TNewsMapperSimple {
	
	//获取新闻和标题
	public List<TNews> selectNewsSimple(News news);
	
	//获取符合条件的新闻总数
	public int selectNewsCount(News news);
	
}
