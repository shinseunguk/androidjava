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
<title>�Խ���</title>
</head>

<body>
<form action="insert_book.jsp">
���̵� : <input type="text" name="id"><br>
å�̸� : <input type="text" name="bookname"><br>
å�ٰŸ� : <input type="text" name="content"><br>
���ǻ� : <input type="text" name="publish"><br>
���� : <input type="text" name="writer"><br>
<button type="submit">Ȯ��</button>
</form>
</body>
</html>