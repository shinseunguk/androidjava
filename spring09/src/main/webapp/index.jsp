<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>게시판 검색입니다.</h1>
<a href="one.do?no=1">1번 검색하기</a>
<a href="one.do?no=2">2번 검색하기</a>
<a href="one.do?no=3">3번 검색하기</a>
<hr>
<!-- 태그 사이에 내용(contents)이 비어있음. 빈태그 -->
<sql:setDataSource
	url="jdbc:mysql://localhost:3366/shop"
	driver="com.mysql.jdbc.Driver"
	user="root"
	password="1234"
	scope="application"
	var="db"
	/>
	
	<sql:query var="list" dataSource="${db}">
		select * from reply
	</sql:query>

<c:forEach items="${list.rows}" var="vo">
- content: ${vo.content}, no: ${vo.no}<br>
</c:forEach>		
	
</body>
</html>