<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
나는 삭제하는 페이지입니다
<!-- webapp아래로 자동으로 페이지 넘김  -->
<%--  <% response.sendRedirect("index.jsp"); %> --%> 

<!-- views아래의 파일로 자동으로 페이지 넘김  -->
 <jsp:forward page="home.jsp"></jsp:forward> 
</body>
</html>