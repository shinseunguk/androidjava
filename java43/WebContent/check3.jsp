<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%
    double result = 0.0;
    String i1 = request.getParameter("i1");
    int i11 = Integer.parseInt(i1); 
    String i2 = request.getParameter("i2");
    if(Integer.parseInt(i2)==1){
    	 result = i11 * 0.95;
    }else if(Integer.parseInt(i2)==2){
    	result = i11 * 0.9;
    }else if(Integer.parseInt(i2)==3){
    	result = i11 * 0.85;
    } %><%= result %>