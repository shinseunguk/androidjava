<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 
    1. 클라이언트가 입력해서 제출한 데이터를 받아와야 한다.
    2. DB연동해서 처리해서 결과 받아와야 한다
    3. 받아온 결과에 따라서화면을 html로 만들어서 클라이언트에게 전송한다`
     -->
<%
	// HttpServletRequest request = new HttpServletRequest();
	// 내장된객체
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>당신이 입력한 정보는</h3>
<hr color="red">
아이디 : <%= id %><br>
패스워드 : <%= pw  %><br>
<hr color="blue">
<a href="login.html">로그인 페이지로</a>

</body>
</html>