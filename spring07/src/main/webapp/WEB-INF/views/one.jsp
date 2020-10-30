<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>회원 검색 정보입니다.</h3>
<hr color="red">
회원 id   : ${vo.id} <br>
회원 pw  : ${vo.pw}<br>
회원 name : ${vo.name}<br>
회원 tel :  ${vo.tel}<br>
<a href="signup.jsp">첫페이지</a>
<a href="update.do">수정하는 페이지</a>
</body>
</html>