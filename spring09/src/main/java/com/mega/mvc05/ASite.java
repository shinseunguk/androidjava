package com.mega.mvc05;

import org.springframework.stereotype.Component;

@Component
public class ASite implements ASiteInterface {
	
	@Override
	public void person() {
		System.out.println("���� ���� ����");
	}
}
