package com.mega.mvc04;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("�� ������ ������Ʈ ���۵�..=======================");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("�� ������ ������Ʈ �����..=======================");

	}

}
