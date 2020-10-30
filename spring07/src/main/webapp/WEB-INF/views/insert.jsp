<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>게시물 등록 정보입니다.</h3>
<hr color="red">
회원 id   : ${memberVO.id} <br>
회원 pw  : ${memberVO.pw}<br>
회원 name : ${memberVO.name}<br>
회원 tel :  ${memberVO.tel}<br>
<a href="signup.jsp">첫페이지</a>
<a href="update.do">수정하는 페이지</a>

</body>
</html>