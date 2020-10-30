package com.mega.mvc04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {
	String id = null;
	String pw = null;
	private static final long serialVersionUID = 1L;
       

	@Override
	public void init(ServletConfig config) throws ServletException{
		id = config.getInitParameter("id");
		System.out.println(id);
		pw = config.getInitParameter("pw");
		System.out.println(pw);
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get요청");
		String name = request.getParameter("name");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>" + name + ": get</h1>");
		out.println("<h1>Login ID :" + id + "</h1>");
		out.println("<h1>Login PW :" + pw + "</h1>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post요청");
		String name = request.getParameter("name");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>" + name + ": get</h1>");
		out.close();
		
		
	}
	
	
	
	

}
