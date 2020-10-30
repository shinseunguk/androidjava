<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%
    String result = "올바른 아이디입니다.";
   String id = request.getParameter("id");
   if (id.length()<5){
		result = "5글자 이상 입력하시오.";
   }
    %><%= result %>