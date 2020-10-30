<%@page import="java.util.ArrayList"%>
<%@page import="book.BookDAO"%>
<%@page import="book.BookDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%
    
    		// 1. VO를 만들어서
    		BookDTO vo = new BookDTO();
    	// 2. 전달되는 값 받은 다음, VO에 넣어야 한다.
    	    String id = request.getParameter("id");
   			String bookname = request.getParameter("bookname");
  			String content= request.getParameter("content");
    		String publish = request.getParameter("publish");
    		String writer = request.getParameter("writer");
    		
    		
    		  	vo.setId(id);
    		    vo.setBookname(bookname);
    		    vo.setContent(content);
    		    vo.setPublish(publish);
    		    vo.setWriter(writer);

    	// 3. DAO이용해서, insert처리함.
    		BookDAO dao = new BookDAO();
    		 //boolean result = dao.create(vo);
    		 boolean result = dao.create(vo);
    		 System.out.println(result);
    
    		 String check ="등록실패";
    		 if(result){
    			 check="등록완료";
    		 }
    		 
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시판</title>
</head>
<body>
<%=check %><br>
<a href="input_book.jsp">책저장으로 돌아가기</a>
</body>
</html>