<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%
    //파라메터값 받아주고
    String reply = request.getParameter("reply");
    //replyDAO로 댓글을 저장처리
    //성공하면, 저장된 댓글 데이터를 전송
    String result = "-" + reply +"<br>";
    %><%= result %>