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
	$.ajax({
		url: "json.do",
		dataType: "json",
		success: function(result){
			console.log(result)
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
</script>
</head>
<body>
<div id="d1">
</div>
</body>
</html>