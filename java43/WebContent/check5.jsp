<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%
    String result = "�ùٸ� ���̵��Դϴ�.";
   String id = request.getParameter("id");
   if (id.length()<5){
		result = "5���� �̻� �Է��Ͻÿ�.";
   }
    %><%= result %>