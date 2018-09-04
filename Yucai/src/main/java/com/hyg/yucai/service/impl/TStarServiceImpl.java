package com.hyg.yucai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyg.yucai.mapper.TStarMapper;
import com.hyg.yucai.model.TStar;
import com.hyg.yucai.model.TStarExample;
import com.hyg.yucai.service.TStarService;

@Service
public class TStarServiceImpl implements TStarService {
	@Autowired
	TStarMapper tStarMapper;

	@Override
	public List<TStar> getStars(TStarExample example) {
		return tStarMapper.selectByExample(example);
	}

}
