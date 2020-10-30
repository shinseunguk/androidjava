package com.mega.mvc03;

import org.springframework.beans.factory.annotation.Autowired;

public class Sale {

	@Autowired
	MemberDAO dao;
	
	
	public int sale(int price) {
		
		if(price>=10000) {
			price -= 1000;
		}
		//dao.create(price);
		return price;
		
	}
	
	
}
