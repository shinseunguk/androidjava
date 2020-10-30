<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%
    String result = "비밀번호가 일치 하지않습니다.";
   String pw1 = request.getParameter("pw1");
   String pw2 = request.getParameter("pw2");
   
   if(pw1.equals(pw2)){
	   result ="비밀번호가 일치 합니다.";
   }
%><%= result %>