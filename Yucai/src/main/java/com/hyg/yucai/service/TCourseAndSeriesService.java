package com.hyg.yucai.service;

import java.util.List;

import com.hyg.yucai.model.TCouresAndSeries;
import com.hyg.yucai.model.TCourse;

public interface TCourseAndSeriesService {
	//获取系列和对应课程的信息
	public List<TCouresAndSeries> findCourseAndSeries();
	//根据课程id获取课程
	public TCourse findCourseById(int courseid);

}
