package com.mega.mvc05;

import org.springframework.stereotype.Component;

@Component
public class Bsite implements BSiteInterface {

	
	@Override
	public void basket() {
		System.out.println("��ٱ���");
	}
	
	@Override
	public void orderr() {
		System.out.println("�ֹ��ϱ�");
	}
	@Override
	public void search() {
		System.out.println("�˻��ϱ�");
	}
	
	
}
