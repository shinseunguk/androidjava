<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="resources/js/jquery-3.5.1.js"></script>
<script type="text/javascript">

$(function(){
	//alert('ȯ���մϴ�.!')
	$('#b1').click(function(){
		replyValue = $('#reply').val()
		console.log(replyValue)
		$.ajax({
			url :"reply.do" ,
			data: {
				reply : replyValue
				},
			success: function(result){
				$('#d1').append(result)
			}
		})
	})//b1
	$('#id_btn').click(function(){
		idValue = $('#id').val()
		console.log(idValue)
		$.ajax({
			url: "login.do" ,
			data :{
				id : idValue
			},
			success : function(result){
				$('#d2').html(result)
			}
		})//ajax
	})
})
</script>
</head>
<body>
<form action="movie.do">
��ȭ����   : <input type="text" name="title"><br>
��ȭ������   : <input type="text" name="price"><br>
<button type="submit">��ư</button>
</form>



<hr color="red">
��� : <input type="text" id ="reply">
<button id="b1">��۴ޱ�</button>
<hr color="blue">
������ ���̵� : <input type="text" id="id"><button id="id_btn">����</button><br>
<div id="d2">

</div>
<hr color="green">
<div id="d1">

</div>
</body>
</html>