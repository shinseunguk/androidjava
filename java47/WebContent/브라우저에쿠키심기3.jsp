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
	Cookie r1 = new Cookie("subject","������");
	response.addCookie(r1);
	Cookie r2 = new Cookie("location","709ȣ");
	response.addCookie(r2);
	Cookie r3 = new Cookie("people","100��");
	response.addCookie(r3);
	r3.setMaxAge(0);
%>
<a href="������������Ű��������2.jsp">��Ű��������</a>
</body>
</html>