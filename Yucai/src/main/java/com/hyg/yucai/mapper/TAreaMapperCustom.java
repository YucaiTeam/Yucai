package com.hyg.yucai.mapper;

import java.util.List;

import com.hyg.yucai.model.TAreaCustom;
import com.hyg.yucai.model.TBank;

public interface TAreaMapperCustom {

	List<TAreaCustom> selectAreaAndBank();
	
	//根据地区号获得对应银行
	public List<TBank> selectBankByAreano(String areano);
}
