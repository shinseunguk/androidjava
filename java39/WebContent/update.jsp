<%@page import="bean.MemberVO"%>
<%@page import="dbcp.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1. id값 받아와야 함. -->
    <!-- 2. dao와 연동하여 결과 받아와야 함. -->
    <!-- 3. html로 만들어서 전송해야함. -->
<%
	String id = request.getParameter("id");
	MemberDAO dao = new MemberDAO();
	MemberVO vo = dao.one(id);
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><%= vo.getId() %>님의 회원정보 수정 페이지입니다.</h3>
<hr color="red">
<form action="update2.jsp">
<table>
	<tr align="center">
		<td width="100" bgcolor="yellow">아이디</td>
		<td width="200" bgcolor="pink"><%= vo.getId() %>
			<input type="hidden" name="id" value="<%= vo.getId() %>" >
		 </td>
	</tr>
	<tr align="center">
		<td width="100" bgcolor="yellow">패스워드</td>
		<td width="200" bgcolor="pink">
			<input type="text" name="pw" value="<%= vo.getPw() %>"> </td>
	</tr>
	<tr align="center">
		<td width="100" bgcolor="yellow">이름</td>
		<td width="200" bgcolor="pink">
			<input type="text" name="name" value="<%= vo.getName()%>"> </td>
	</tr>
	<tr align="center">
		<td width="100" bgcolor="yellow">전화번호</td>
		<td width="200" bgcolor="pink">
			<input type="text" name="tel" value="<%= vo.getTel() %>"> </td>
	</tr>
	<tr align="center">
		<td colspan="2">
			<button type="submit" style=width:300px;background:red;color:white;>수정 처리 요청</button>
		</td>
	</tr>
</table>
</form>
<hr color="green">
[ 	<a href="index.html"><button style=background:green>처음페이지로</button></a> |
	<a href="one.jsp?id=<%= vo.getId() %>"><button style=background:gold>검색</button></a> |
	<a href="delete.jsp?id=<%= vo.getId() %>"><button style=background:lime>삭제</button></a> 
]  








</body>
</html>