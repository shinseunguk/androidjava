package com.mega.mvc05;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//���� Ŭ����(�ΰ���ɸ� ������ �ִ� Ŭ����)
@Component("aop")
@Aspect
public class AOPClass {
	public void login() {
		System.out.println("�α��� ���� ---------");
	}
	public void logout() {
		System.out.println("�α׾ƿ� ���� ---------");
	}
	public void search() {
		System.out.println("�˻� ���� ---------");
	}
}
