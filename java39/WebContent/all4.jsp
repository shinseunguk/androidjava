<%@page import="java.util.ArrayList"%>
<%@page import="bean.BbsDAO"%>
<%@page import="bean.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
		BbsDAO dao = new BbsDAO();
		
		
		ArrayList<BbsVO> list = dao.all();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
   td {
      width: 100px;
      text-align: center;
   }
   .td{
      background: yellow;
   }
</style>
</head>
<body>
<h3>테이블 전체 갯수 : <%= list.size() %></h3><hr color="red">
<table border="1">
<tr>
<td class="td">no</td>
<td class="td">title</td>
<td class="td">content</td>
<td class="td">writer</td>
</tr>

<% for(int i =0; i<list.size();i++){ 
	BbsVO vo = list.get(i);
%> 


<tr>
<td><%=vo.getNo() %></td>
<td><%=vo.getTitle() %></td>
<td><%=vo.getContent() %></td>
<td><%=vo.getWriter() %></td>
</tr>




<%-- no : <%= list.get(i).getNo() %> <br>
title : <%= list.get(i).getTitle() %> <br>
content :  <%= list.get(i).getContent() %> <br>
writer : <%= list.get(i).getWriter() %> <br><br> --%>
<% } %>
</table>
</body>
</html>