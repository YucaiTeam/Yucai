package com.hyg.yucai.service;

import java.util.List;

import com.hyg.yucai.model.TDetail;
import com.hyg.yucai.model.TDetailExample;

public interface TDetailService {

	//根据ID获取课程详细内容
	public TDetail getDetailById(int detailid);
	//根据courseid获取课程详细内容
	public List<TDetail> getDetailByCourseId(TDetailExample example);
}
