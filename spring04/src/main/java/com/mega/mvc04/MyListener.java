package com.mega.mvc04;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("내 스프링 프로젝트 시작됨..=======================");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("내 스프링 프로젝트 종료됨..=======================");

	}

}
