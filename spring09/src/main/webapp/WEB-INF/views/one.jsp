<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.5.1.js"></script>
<script type="text/javascript">
	$(function(){
		$('#reply').click(function(){
			contentValue = $('#content').val()
			console.log(contentValue)
			$.ajax({
				url: "create.do",
				data: {
					content: contentValue,
					original: '${one.no}',
					writer: '${id}'
				},
				success: function(result){
					$('#table2').append(result)
					location.reload();
				}
			})
		})
	})
</script>
</head>
<body>
	<h3>�Խù� �ϳ� �˻�ȭ���Դϴ�.</h3>
	<hr color="red">
	<table align="cetner">
		<tr>
			<td>�Խù� ��ȣ</td>
			<td>${one.no}</td>
		</tr>
		<tr>
			<td>�Խù� ����</td>
			<td>${one.title}</td>
		</tr>
		<tr>
			<td>�Խù� ����</td>
			<td>${one.content}</td>
		</tr>
		<tr>
			<td>�Խù� �ۼ���</td>
			<td>${one.writer}</td>
		</tr>
	</table>
	<hr>
��� : <input id="content"><button id="reply">�Է�</button>
	<div id="d2" style="width: 450px; height: 200px;">
		<table id="table2" align="center" width=450px;>
			<c:forEach items="${list}" var="vo" varStatus="status">
				<tr style="background: lime;">
					<td style="width: 50px;">${status.index+1}</td>
					<td style="width: 300px;">${vo.content}</td>
					<td style="width: 100px;">${vo.writer}</td>
					<td style="width: 100px;">
						<!-- one.do?no=1  --> 
						<a href="delete3.do?no=${vo.no}&original=${vo.original}">
							<button style="background: yellow;">����</button>
					</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>