<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie[] cookies =  request.getCookies();
	out.println("쿠키개수: " + cookies.length + "개<br>");
	
	for(int i = 0 ; i<cookies.length;i++){
		if(!cookies[i].getName().equals("JSESSIONID")&&
				!cookies[i].getName().equals("name")&&
				!cookies[i].getName().equals("age")
				){
			 
%>
  <%= cookies[i].getName() %>:
 <%= cookies[i].getValue() %><br>
 
 <%
	}
	}
 %>
</body>
</html>