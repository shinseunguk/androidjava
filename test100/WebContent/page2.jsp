<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <!--1. ���޵� �� �޾ƾ���.  -->
    <%
    //��Ʈ�ѷ�(controller����)
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    
    %>
    <!--2. DBó�� : Ư���� ó���� ���� ����� �����ϴ� Ŭ����  -->
    <!-- DAO: �𵨿���!  -->
    <%
    String result="�α��� ����";
    if(id.equals("root")&& pw.equals("1234")){
    	result ="�α��� ����";
    }
    %>
    <!--3. ó�� ����� Ŭ���̾�Ʈ���� �˷���.  -->
    <!-- ����� �˷��ִ� view����!!  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>