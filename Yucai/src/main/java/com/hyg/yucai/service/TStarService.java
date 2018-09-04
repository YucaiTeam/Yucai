package com.hyg.yucai.service;

import java.util.List;

import com.hyg.yucai.model.TStar;
import com.hyg.yucai.model.TStarExample;

public interface TStarService {
	public List<TStar> getStars(TStarExample example);
}
