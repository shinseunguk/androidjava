<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <!--1. 전달된 값 받아야함.  -->
    <%
    //컨트롤러(controller역할)
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    
    %>
    <!--2. DB처리 : 특정한 처리에 대한 방법을 정의하는 클래스  -->
    <!-- DAO: 모델역할!  -->
    <%
    String result="로그인 실패";
    if(id.equals("root")&& pw.equals("1234")){
    	result ="로그인 성공";
    }
    %>
    <!--3. 처리 결과를 클라이언트에게 알려줌.  -->
    <!-- 결과를 알려주는 view역할!!  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>