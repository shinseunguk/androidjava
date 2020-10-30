<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>장바구니에 넣기</h3>
	<hr color="red">
	<form action="add.jsp">
		<select name="product">
			<option value="watch">시계</option>
			<option value="ballpen">볼펜</option>
			<option value="notebook">노트북</option>
		</select><br>
		<select name="price">
			<option value="10000">10000원</option>
			<option value="20000">20000원</option>
			<option value="30000">30000원</option>
		</select><br>
		<button type="submit">장바구니에 넣기</button>
	</form>
</body>
</html>