<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="insert.do">
<h1>ȸ������</h1>
���̵� : <input type="text" name="id"><br>
��й�ȣ : <input type="text" name="pw"><br>
�̸� : <input type="text" name="name"><br>
��ȭ��ȣ : <input type="text" name="tel"><br>
<button type="submit">�ۼ�</button>
</form>
<hr color="red">
<form action="delete.do">
<h1>ȸ��Ż��</h1>
���̵� : <input type="text" name="id"><br>
<button type="submit">ȸ��Ż�� �Ϸ�</button>
</form>
<hr color="red">
<form action="update.do">
<h1>ȸ������</h1>
���̵� : <input type="text" name="id"><br>
��ȭ��ȣ : <input type="text" name="tel"><br>
<button type="submit">���� �Ϸ�</button>
</form>
<form action="one.do">
<h1>ȸ���˻�</h1>
���̵� : <input type="text" name="id"><br>
<button type="submit">�˻�</button>
</form>
<form action="list.do">
<a href="list.do">��ü ȸ�� �˻� �Ϸ�</a>
<button type="submit">��ü �˻�</button>
</form>
</body>
</html>