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
	//alert('환영합니다.!')
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
영화제목   : <input type="text" name="title"><br>
영화관람료   : <input type="text" name="price"><br>
<button type="submit">버튼</button>
</form>



<hr color="red">
댓글 : <input type="text" id ="reply">
<button id="b1">댓글달기</button>
<hr color="blue">
가입할 아이디 : <input type="text" id="id"><button id="id_btn">가입</button><br>
<div id="d2">

</div>
<hr color="green">
<div id="d1">

</div>
</body>
</html>