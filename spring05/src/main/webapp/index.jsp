<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>게시판;</h1>
<form action="insert.do">
번호 : <input type="text" name="no"><br>
제목 : <input type="text" name="title"><br>
내용 : <input type="text" name="content"><br>
작성자 : <input type="text" name="writer"><br>
<button type="submit">작성</button>
</form>
</body>
</html>