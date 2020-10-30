<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%
    String a = "" ;
    int b = 0 ;
    String s4 = "";
    String result = "";
    Random rd = new Random();
    String i3 = request.getParameter("i3");

    String s5 = i3.substring(0,3);
    
    if(s5.equals("010")){
    	a = "22";
    	b = rd.nextInt(9000)+1000;
    	result = a + b;
    	System.out.print(result);
    }%><%= result %>