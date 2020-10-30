<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="js/jquery-3.5.1.js"></script>
<script type="text/javascript">
$(function(){
	$('#pw1').keyup(function(){
		pw = $('#pw1').val()
		$('#div').html("<p>잘못된 비밀번호 입니다.</p>")					
		if(pw=="1111"){
		$('#div').html("<p>PW correct.</p>")					
		console.log(pw)
		}
	})//button
	$('#id1').keyup(function(){
		id = $('#id1').val()
		$('#div').html("<p>잘못된 아이디 입니다.</p>")					
		if(id=="admin"){
		$('#div').html("<p>ID correct.</p>")					
		console.log(id)
		}
	})//button
})//function
</script>
</head>
<body>
<form action="beans.jsp">
<div id="div"></div>
<h1 style="margin-left : 200px;">로그인</h3>
Username : <input type="text" name="id" id="id1"><br>
Password : <input type="text" name="pw" id="pw1"><br>
<button type="submit">제출</button><br><br><br>

id: admin<br>
pw: 1111
</form>
</body>
</html>