<%@page import="dbcp.MemberDAO"%>
<%@page import="com.sun.org.apache.bcel.internal.generic.NEW"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id"); 
String pw = request.getParameter("pw"); 
String name = request.getParameter("name"); 
String tel = request.getParameter("tel"); 
//자동 import: 해당 클래스 위로 클릭하고, ctrl+shfit+m
	MemberDAO dao = new MemberDAO();
	boolean result =  dao.read(id, pw);
	
	String check = "로그인 x";
	
	if(result){
		check = "로그인 ok";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>당신이 입력한 정보의 결과는 <%= check %> 입니다</h3>
아이디:  <%= id %> <br>
비밀번호: <%= pw %> <br>
이름: <%= name %> <br>
나이: <%= tel %> <br>
<a href="member.html">회원가입 창으로</a>
</body>
</html>