<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>ȸ�� �˻� �����Դϴ�.</h3>
<hr color="red">
<c:forEach var="vo" items="${list}">
ȸ�� id   : ${vo.id}, 
ȸ�� pw  : ${vo.pw}, 
ȸ�� name : ${vo.name}, 
ȸ�� tel :  ${vo.tel}<br>
</c:forEach>
<a href="signup.jsp">ù������</a>
<a href="update.do">�����ϴ� ������</a>
</body>
</html>