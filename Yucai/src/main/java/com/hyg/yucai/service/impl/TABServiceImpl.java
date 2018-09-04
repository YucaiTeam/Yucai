package com.hyg.yucai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyg.yucai.mapper.TAreaMapper;
import com.hyg.yucai.mapper.TAreaMapperCustom;
import com.hyg.yucai.mapper.TBankMapper;
import com.hyg.yucai.model.TArea;
import com.hyg.yucai.model.TAreaCustom;
import com.hyg.yucai.model.TAreaExample;
import com.hyg.yucai.model.TBank;
import com.hyg.yucai.model.TBankExample;
import com.hyg.yucai.service.TABService;
@Service
public class TABServiceImpl implements TABService {
	
	@Autowired
	private TAreaMapperCustom tAraeMapperCustom;
	@Autowired
	private TAreaMapper tAreaMapper;
	@Autowired
	private TBankMapper tBankMapper;
	@Override
	public List<TAreaCustom> getAreaAndBank() {
		// TODO Auto-generated method stub
		return tAraeMapperCustom.selectAreaAndBank();
	}
	@Override
	public List<TArea> getAllArea(TAreaExample example) {
		// TODO Auto-generated method stub
		return tAreaMapper.selectByExample(example);
	}
	@Override
	public List<TBank> getAllBank(TBankExample example) {
		// TODO Auto-generated method stub
		return tBankMapper.selectByExample(example);
	}
	@Override
	public List<TBank> getBankByAreano(String areano) {
		// TODO Auto-generated method stub
		
		areano = this.autoReplace(areano);
		System.out.println("接收地区编号为:"+areano);
		return tAraeMapperCustom.selectBankByAreano(areano);
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
