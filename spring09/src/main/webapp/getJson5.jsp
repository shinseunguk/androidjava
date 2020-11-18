<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.5.1.js"></script>
<script type="text/javascript">
$(function(){
	$('#btn').click(function(){
		var searchValue=$('#search').val()
		no = Number(searchValue)
		console.log(no)
	$.ajax({
		url: "json1.do",
		data :{
			no : no
		},
		dataType: "json",
		success: function(result){
			for(i = 0; i<result.length;i++){
				no=result[i].no
				title=result[i].title
				content=result[i].content
				writer=result[i].writer
			 $('#d1').append(no +", " +title +", " +content +", " +writer +"<br>") 
			}
	}
	})	
	})
	$('#btn1').click(function(){
		$.ajax({
			url: "json2.do",
			dataType: "json",
			success: function(result){
				for(i = 0; i<result.length;i++){
					no=result[i].no
					title=result[i].title
					content=result[i].content
					writer=result[i].writer
				 $('#d1').html(no +", " +title +", " +content +", " +writer +"<br>") 
				}
		}
		})	
	})
})
</script>
</head>
<body>
bbs 검색 : <input tpye="text" id="search"><button id="btn">검색</button><br>
<button id="btn1">전체검색</button>
<div id="d1">
</div>
</body>
</html>