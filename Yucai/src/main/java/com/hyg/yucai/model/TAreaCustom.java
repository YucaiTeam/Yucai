package com.hyg.yucai.model;

import java.util.List;

public class TAreaCustom extends TArea{

	//添加银行信息
	private List<TBank> tBank;

	public List<TBank> gettBank() {
		return tBank;
	}

	public void settBank(List<TBank> tBank) {
		this.tBank = tBank;
	}

	
	
}
