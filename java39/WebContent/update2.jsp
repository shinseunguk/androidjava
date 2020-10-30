<%@page import="dbcp.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 액션태그 -->
<!--  1. 넘어오는 4개의 값을 받아서 vo에 넣준다.-->
<jsp:useBean id="vo" class="bean.MemberVO"></jsp:useBean>
<!-- useBean액션태그: new를 가지고 객체생성, import역할 -->
<jsp:setProperty property="*" name="vo"/>
<!-- setProperty액션태그: 클라이언트가 전송한 파라메터 받아오고,
	 vo의 set()메서드를 호출해줌.
 -->
<!--  2. dao를 이용해서 update시킨다.-->
<%
	MemberDAO dao = new MemberDAO();
	boolean result = dao.update(vo);
%>
<!--  3. 결과를 html로 만들어서 전송한다.-->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>업데이트 결과는 <%= result %>입니다.!</h3>
</body>
</html>