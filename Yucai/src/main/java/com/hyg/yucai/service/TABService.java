package com.hyg.yucai.service;

import java.util.List;

import com.hyg.yucai.model.TArea;
import com.hyg.yucai.model.TAreaCustom;
import com.hyg.yucai.model.TAreaExample;
import com.hyg.yucai.model.TBank;
import com.hyg.yucai.model.TBankExample;

public interface TABService {
	
	//获取所有地区以及该地区银行
	public List<TAreaCustom> getAreaAndBank();
	
	//获取所有地区
	public List<TArea> getAllArea(TAreaExample example);
	
	//获取所有银行
	public List<TBank> getAllBank(TBankExample example);
	
	//根据地区号获得对应银行
	public List<TBank> getBankByAreano(String areano);
}
