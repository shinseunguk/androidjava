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
	Cookie[] list =  request.getCookies();
	out.println("��Ű����: " + list.length + "��<br>");
	for(int i = 0 ; i<list.length;i++){
		if(!list[i].getName().equals("JSESSIONID")){
			
%>
 ��Ű�̸� : <%= list[i].getName() %>,
 ��Ű �� : <%= list[i].getValue() %><br>
 
 
 <%
	}
	}
 %>
</body>
</html>