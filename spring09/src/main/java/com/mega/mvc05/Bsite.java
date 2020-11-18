package com.mega.mvc05;

import org.springframework.stereotype.Component;

@Component
public class Bsite implements BSiteInterface {

	
	@Override
	public void basket() {
		System.out.println("장바구니");
	}
	
	@Override
	public void orderr() {
		System.out.println("주문하기");
	}
	@Override
	public void search() {
		System.out.println("검색하기");
	}
	
	
}
