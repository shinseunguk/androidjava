<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Neotube</title>
<link rel="stylesheet" href="css/index_page.css">
<!-- ���������� css -->
</head>
<body>
	<!-- ��� �׺���̼� -->
	<header>
		<nav class="nav_fix">
			<div id="main_icon">
				<h3>
					<a href="index.html"><img id="logo" src="img/logo3.png" width=150 height=30.61></a>
				</h3>
			</div>
			<div id="nav_category">
				<ul>
					<li><a href="">Sports</a></li>
					<li><a href="">Games</a></li>
					<li><a href="">Cooking</a></li>
					<li><a href="">Kids</a></li>
					<li><a href="">Supports</a></li>
					<li><a href="">Login</a></li>
				</ul>
			</div>
		</nav>
	</header>
	<!-- ���� ���̵�� -->
	<aside>
		<div style="margin-left: -65px;margin-top: -15px;"><a href="" style="font-size: 30px; ">Ȩ</a></div>
		<div style="margin-left: -65px;margin-top: -15px;"><a href="" style="font-size: 30px;">�α�</a></div>
		<div style="margin-left: -65px;margin-top: -15px;"><a href="" style="font-size: 30px;">����</a></div>
		<div style="margin-left: -65px;margin-top: -15px;"><a href="" style="font-size: 30px;">���ƿ��� ������</a></div>
		<div style="margin-left: -65px;margin-top: -15px;"><a href="" style="font-size: 30px;">��û���</a></div>
		<div style="margin-left: -65px;margin-top: -15px;"><a href="" style="font-size: 30px;">����</a></div>
	</aside>
	<!-- ���� -->
	<div class="main_page" >
	
	</div>
	<div class="main_frame" style=" height:auto; overflow:hidden; width: 1950px; margin-left: 195px; ">
	<% for(int i=0;i<10;i++) {%>
	<div class="video_frame">
	<div class="thumbnail_frame">
	
	</div>
	<div class="content_frame">
	</div>
	</div>	
	<%
	}
	%>
	</div> 

</body>
</html>