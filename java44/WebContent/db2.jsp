<%@page import="bean.MemberDAO2"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="vo" class="bean.MemberVO"></jsp:useBean>
<jsp:setProperty property="*" name="vo"/>

<%
	MemberDAO2 dao = new MemberDAO2();
	boolean result = dao.create(vo);
%><%= result %>