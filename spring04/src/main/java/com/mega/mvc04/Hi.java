package com.mega.mvc04;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//service()
public class Hi extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//부모클래스에 service()
	//요청방식에 다라서, doGet(), goPost()
	//jsp의 모든 코드는 서블릿의 service()메서드 안으로 구현
	//jsp의 모든 변수는 service() 지역변수
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get요청됨.");
		response.getWriter().println("get 요청됨");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post요청됨.");
		response.getWriter().println("post 요청됨");
	}

}
