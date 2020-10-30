<%@page import="dbcp.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%
    String aa ;
    String id = request.getParameter("id");
    MemberDAO dao = new MemberDAO();
    int result = dao.read(id);
    %><%=result %>