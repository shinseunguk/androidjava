<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@page import="bean.MemberVO"%>
<%@page import="java.util.List"%>
<%@page import="dbcp.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- DAO를 이용해서 결과를 ArrayList로 받아온 후, html을 만든다.! -->
    <%
       String content = request.getParameter("content");   
       BbsDAO dao = new BbsDAO();
       List<BbsVO> list = dao.all2(content);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
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
<h3 style=color:blue>검색결과의 개수는 <%= list.size() %>개</h3>
<table border="1">
<tr>
  <td class="td">no</td>
   <td class="td">title</td>
   <td class="td">content</td>
   <td class="td">writer</td>
</tr>
<% for(int i = 0; i < list.size(); i++) { 
   BbsVO vo = list.get(i);
%>
<tr>
   <td><%= vo.getNo()%></td>
   <td><%= vo.getTitle() %></td>
   <td><%= vo.getContent() %></td>
   <td><%= vo.getWriter() %></td>
</tr>
<% } %>
</table>
</body>
</html>




