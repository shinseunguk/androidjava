<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>	
 	<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
 	<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

 number : <fmt:formatNumber value="12345.678" type="number"/><br/>
 currency : <fmt:formatNumber value="12345.678" type="currency" currencySymbol="\\"/><br/>
 percent : <fmt:formatNumber value="12345.678" type="percent"/><br/>
 pattern=".0" : <fmt:formatNumber value="12345.678" pattern=".0"/>
 
 <p>
 
 <c:set var="now" value="<%=new java.util.Date()%>"/>
 <c:out value="${now}"/><br/>

 date : <fmt:formatDate value="${now}" type="date"/><br/>
 time : <fmt:formatDate value="${now}" type="time"/><br/>
 both : <fmt:formatDate value="${now}" type="both"/><br/>
 <br>
 <br>
 
 
 <c:set var="name" value=" ȫ�浿 " />
 
 �� �̸��� :  ${fn:trim(name)}(��, �� ��������)<br>
 �̸��� ���� ���ԵǾ� ������? ������ ${fn:contains(name, "��")} �Դϴ�.

<table>
<tr>
  <th>Value</th>
  <th>Square</th>
</tr>
<c:forEach var="x" begin="0" end="10" step="1">
<tr>
  <td><c:out value="${x}"/></td>
  <td><c:out value="${x * x}"/></td>
</tr>
</c:forEach>
</table>

 
<sql:setDataSource
	url="jdbc:mysql://localhost:3366/shop"
	driver="com.mysql.jdbc.Driver"
	user="root"
	password="1234"
	scope="application"
	var="db"
	/>
	
	<sql:update var="list" dataSource="${db}">
		insert into bbs values('5','dd','good','g')
	</sql:update>



</body>
</html>