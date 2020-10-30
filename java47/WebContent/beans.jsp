<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%
    
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    
    System.out.println(id);
    System.out.println(pw);
    
    	String check = "로그인 실패!";
    if(id.equals("admin")&& pw.equals("1111")){
    		check = "로그인 성공!";
    }
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<div><%=check %></div>
<h1 style="margin-left:200px;">UserId : <%=id %></h1>

</body>
</html>