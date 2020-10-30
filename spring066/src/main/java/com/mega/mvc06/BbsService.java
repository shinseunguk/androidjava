package com.mega.mvc06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BbsService {

	@Autowired
	BbsDAO dao; //전역변수
	
	//전역변수의 주소/값 를 넣는 방법
	//1. 파라메터 있는 생성자를 사용해라.
	//2. set메서드를 만들어라.
	//
//	public BbsService(BbsDAO dao) {
//		this.dao = dao;
//	}
	
	
	public void setDao(BbsDAO dao) {
		this.dao = dao;
	}
}
