package com.hyg.yucai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyg.yucai.mapper.TCourseAndSeriesMapper;
import com.hyg.yucai.mapper.TCourseMapper;
import com.hyg.yucai.model.TCouresAndSeries;
import com.hyg.yucai.model.TCourse;
import com.hyg.yucai.service.TCourseAndSeriesService;

@Service
public class TCourseAndSeriesServiceImpl implements TCourseAndSeriesService {

	@Autowired
	private TCourseAndSeriesMapper tCourseAndSeriesMapper; 
	@Autowired
	private TCourseMapper tCourseMapper;
	@Override
	public List<TCouresAndSeries> findCourseAndSeries() {
		// TODO Auto-generated method stub
		return tCourseAndSeriesMapper.selectCourseAndSeries();
	}
	@Override
	public TCourse findCourseById(int courseid) {
		// TODO Auto-generated method stub
		return tCourseMapper.selectByPrimaryKey(courseid);
	}
}
