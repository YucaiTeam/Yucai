package com.hyg.yucai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyg.yucai.mapper.TVideoMapper;
import com.hyg.yucai.model.TVideo;
import com.hyg.yucai.model.TVideoExample;
import com.hyg.yucai.service.TVideoService;

@Service
public class TVideoServiceImpl implements TVideoService {
	@Autowired
	TVideoMapper tVideoMapper;

	@Override
	public List<TVideo> getVideos(TVideoExample example) {

		return tVideoMapper.selectByExample(example);
	}

}
