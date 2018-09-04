package com.hyg.yucai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyg.yucai.mapper.TDetailMapper;
import com.hyg.yucai.model.TDetail;
import com.hyg.yucai.model.TDetailExample;
import com.hyg.yucai.service.TDetailService;

@Service
public class TDetailServiceImpl implements TDetailService {

	@Autowired
	private TDetailMapper tDetailMapper;
	
	@Override
	public TDetail getDetailById(int detailid) {
		// TODO Auto-generated method stub
		return tDetailMapper.selectByPrimaryKey(detailid);
	}
	@Override
	public List<TDetail> getDetailByCourseId(TDetailExample example) {
		// TODO Auto-generated method stub
		return tDetailMapper.selectByExample(example);
	}
}
