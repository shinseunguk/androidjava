<%@page import="dbcp.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="vo2" class="dbcp.MemberVO2"></jsp:useBean>
<jsp:setProperty property="*" name="vo2"/>

<%
	MemberDAO dao = new MemberDAO();
	boolean result = dao.create(vo2);
%><%= result %>