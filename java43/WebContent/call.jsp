<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%
    String result = "미성인";
    String name = request.getParameter("name");
    String age = request.getParameter("age");
    if(Integer.parseInt(age)>= 18){
    	result="성인";
    }
%><%= result %>