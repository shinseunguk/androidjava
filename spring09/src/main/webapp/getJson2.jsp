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
		url: "json.jsp",
		dataType: "json",
		success: function(result){
			console.log(result)
			$('#d1').append(result)
		}
	})	
})
</script>
</head>
<body>
<div id="d1"></div>
</body>
</html>