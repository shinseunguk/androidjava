package com.mega.mvc04;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//service()
public class Hi extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//�θ�Ŭ������ service()
	//��û��Ŀ� �ٶ�, doGet(), goPost()
	//jsp�� ��� �ڵ�� ������ service()�޼��� ������ ����
	//jsp�� ��� ������ service() ��������
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get��û��.");
		response.getWriter().println("get ��û��");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post��û��.");
		response.getWriter().println("post ��û��");
	}

}
