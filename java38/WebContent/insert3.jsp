<%@page import="bean.BbsDAO"%>
<%@page import="bean.BbsVO"%>
<%@page import="com.sun.org.apache.bcel.internal.generic.NEW"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

// 1. VO를 만들어서
	BbsVO vo = new BbsVO();
// 2. 전달되는 값 받은 다음, VO에 넣어야 한다.
	int no = Integer.parseInt(request.getParameter("no"));
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String writer = request.getParameter("writer");
	
	
	vo.setNo(no);
	vo.setTitle(title);
	vo.setContent(content);
	vo.setWriter(writer);

// 3. DAO이용해서, insert처리함.
	BbsDAO dao = new BbsDAO();
	 boolean result = dao.create(vo);

// 4. 처리결과를 client알려주어야함.
	String check = "게시판 글쓰기 실패!!!";
	if(result){
		check ="게시판 글쓰기 성공!!";
	}
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>글쓰기 결과는 :  <%= check %></h3>
<a href="member3.html">글쓰기 페이지로</a>
</body>
</html>