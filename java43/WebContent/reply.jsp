<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%
    //�Ķ���Ͱ� �޾��ְ�
    String reply = request.getParameter("reply");
    //replyDAO�� ����� ����ó��
    //�����ϸ�, ����� ��� �����͸� ����
    String result = "-" + reply +"<br>";
    %><%= result %>