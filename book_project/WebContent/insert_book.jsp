<%@page import="java.util.ArrayList"%>
<%@page import="book.BookDAO"%>
<%@page import="book.BookDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%
    
    		// 1. VO�� ����
    		BookDTO vo = new BookDTO();
    	// 2. ���޵Ǵ� �� ���� ����, VO�� �־�� �Ѵ�.
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

    	// 3. DAO�̿��ؼ�, insertó����.
    		BookDAO dao = new BookDAO();
    		 //boolean result = dao.create(vo);
    		 boolean result = dao.create(vo);
    		 System.out.println(result);
    
    		 String check ="��Ͻ���";
    		 if(result){
    			 check="��ϿϷ�";
    		 }
    		 
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�Խ���</title>
</head>
<body>
<%=check %><br>
<a href="input_book.jsp">å�������� ���ư���</a>
</body>
</html>