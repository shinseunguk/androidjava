<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>��ٱ��Ͽ� �ֱ�</h3>
	<hr color="red">
	<form action="add.jsp">
		<select name="product">
			<option value="watch">�ð�</option>
			<option value="ballpen">����</option>
			<option value="notebook">��Ʈ��</option>
		</select><br>
		<select name="price">
			<option value="10000">10000��</option>
			<option value="20000">20000��</option>
			<option value="30000">30000��</option>
		</select><br>
		<button type="submit">��ٱ��Ͽ� �ֱ�</button>
	</form>
</body>
</html>