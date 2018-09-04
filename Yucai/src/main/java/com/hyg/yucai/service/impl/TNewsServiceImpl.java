package com.hyg.yucai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyg.yucai.mapper.TNewsMapper;
import com.hyg.yucai.mapper.TNewsMapperSimple;
import com.hyg.yucai.model.News;
import com.hyg.yucai.model.TNews;
import com.hyg.yucai.service.TNewsService;
@Service
public class TNewsServiceImpl implements TNewsService {

	@Autowired
	private TNewsMapperSimple tNewsMapperSimple;
	@Autowired
	private TNewsMapper tNewsMapper;
	@Override
	public List<TNews> getNewsSimple(News news) {
		// TODO Auto-generated method stub
		
		//进行字符串缺0补齐
		String areano = news.getAreano();
		String bankno = news.getBankno();
		areano=this.autoReplace(areano);
		bankno=this.autoReplace(bankno);
		System.out.println("areano="+areano);
		System.out.println("bankno="+bankno);
		news.setAreano(areano);
		news.setBankno(bankno);
		
		return tNewsMapperSimple.selectNewsSimple(news);
	}


	@Override
	public TNews getOneNews(int newsid) {
		// TODO Auto-generated method stub
		return tNewsMapper.selectByPrimaryKey(newsid);
	}


	@Override
	public int getNewsCount(News news) {
		// TODO Auto-generated method stub
		
		//进行字符串缺0补齐
		String areano = news.getAreano();
		String bankno = news.getBankno();
		areano=this.autoReplace(areano);
		bankno=this.autoReplace(bankno);
		System.out.println("areano="+areano);
		System.out.println("bankno="+bankno);
		news.setAreano(areano);
		news.setBankno(bankno);
		
		return tNewsMapperSimple.selectNewsCount(news);
	}
	
	//字符串自动补齐  531->00531
	public String autoReplace(String num) {
		if(num!=""&&num!=null) {
			System.out.println(num.length()+"初始长度");
			for(int i = 5;i>num.length();) {
				System.out.println(num.length()+"长度");
				num = "0"+num;
			}
		}	
		return num;
	}

}
