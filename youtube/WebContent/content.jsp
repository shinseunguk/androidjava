<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Neotube</title>
<link rel="stylesheet" href="css/index_page.css">
<!-- 메인페이지 css -->
</head>
<body>
	<!-- 상단 네비게이션 -->
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
	<!-- 좌측 사이드바 -->
	<aside>
		<div style="margin-left: -65px;margin-top: -15px;"><a href="" style="font-size: 30px; ">홈</a></div>
		<div style="margin-left: -65px;margin-top: -15px;"><a href="" style="font-size: 30px;">인기</a></div>
		<div style="margin-left: -65px;margin-top: -15px;"><a href="" style="font-size: 30px;">구독</a></div>
		<div style="margin-left: -65px;margin-top: -15px;"><a href="" style="font-size: 30px;">좋아요한 동영상</a></div>
		<div style="margin-left: -65px;margin-top: -15px;"><a href="" style="font-size: 30px;">시청기록</a></div>
		<div style="margin-left: -65px;margin-top: -15px;"><a href="" style="font-size: 30px;">결제</a></div>
	</aside>
	<!-- 본문 -->
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