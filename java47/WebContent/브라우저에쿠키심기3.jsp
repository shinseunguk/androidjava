<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie r1 = new Cookie("subject","스프링");
	response.addCookie(r1);
	Cookie r2 = new Cookie("location","709호");
	response.addCookie(r2);
	Cookie r3 = new Cookie("people","100명");
	response.addCookie(r3);
	r3.setMaxAge(0);
%>
<a href="브라우저에서쿠키가져오기2.jsp">쿠키가져오기</a>
</body>
</html>