<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%
    String result = "��й�ȣ�� ��ġ �����ʽ��ϴ�.";
   String pw1 = request.getParameter("pw1");
   String pw2 = request.getParameter("pw2");
   
   if(pw1.equals(pw2)){
	   result ="��й�ȣ�� ��ġ �մϴ�.";
   }
%><%= result %>