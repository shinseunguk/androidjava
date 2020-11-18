<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
나는 수정하는 페이지<br>
검색결과 : ${bbsVO2}<br>
<hr color="red">
게시물 no      : ${bbsVO2.no} <br>
게시물 title   : ${bbsVO2.title}<br>
게시물 content : ${bbsVO2.content}<br>
게시물 writer :  ${bbsVO2.writer}<br>
<a href="delete.do">삭제하기</a>
</body>
</html>