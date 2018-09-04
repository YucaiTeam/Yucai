package com.hyg.yucai.service;

import java.util.List;

import com.hyg.yucai.model.News;
import com.hyg.yucai.model.TNews;

public interface TNewsService {

	//根据地区条件新闻 每次获取10条
	public List<TNews> getNewsSimple(News news);
	//获取单条新闻详细信息
	public TNews getOneNews(int newsid);
	//获取符合条件的总条数
	public int getNewsCount(News news);
}
