<%@page import="book.BookDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="book.BookDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시판</title>
</head>

<body>
<form action="insert_book.jsp">
아이디 : <input type="text" name="id"><br>
책이름 : <input type="text" name="bookname"><br>
책줄거리 : <input type="text" name="content"><br>
출판사 : <input type="text" name="publish"><br>
저자 : <input type="text" name="writer"><br>
<button type="submit">확인</button>
</form>
</body>
</html>