package com.hyg.yucai.service;

import java.util.List;

import com.hyg.yucai.model.TVideo;
import com.hyg.yucai.model.TVideoExample;

public interface TVideoService {
	public List<TVideo> getVideos(TVideoExample example);
}
