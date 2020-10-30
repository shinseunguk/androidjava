<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="insert.do">
<h1>회원가입</h1>
아이디 : <input type="text" name="id"><br>
비밀번호 : <input type="text" name="pw"><br>
이름 : <input type="text" name="name"><br>
전화번호 : <input type="text" name="tel"><br>
<button type="submit">작성</button>
</form>
<hr color="red">
<form action="delete.do">
<h1>회원탈퇴</h1>
아이디 : <input type="text" name="id"><br>
<button type="submit">회원탈퇴 완료</button>
</form>
<hr color="red">
<form action="update.do">
<h1>회원수정</h1>
아이디 : <input type="text" name="id"><br>
전화번호 : <input type="text" name="tel"><br>
<button type="submit">수정 완료</button>
</form>
<form action="one.do">
<h1>회원검색</h1>
아이디 : <input type="text" name="id"><br>
<button type="submit">검색</button>
</form>
<form action="list.do">
<a href="list.do">전체 회원 검색 완료</a>
<button type="submit">전체 검색</button>
</form>
</body>
</html>