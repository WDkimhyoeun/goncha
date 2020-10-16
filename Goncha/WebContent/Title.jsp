<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/homepage2.css"
	type="text/css">
</head>
<style>
</style>
<body>
	<div class="header">
		<div class="header_in">
			<div id="logo">
				<a href="MainHome.jsp"> <img
					src="${pageContext.request.contextPath}/resources/images/logo.png" />
				</a>
			</div>
			<div class="menu_list" id="test">
				<ul id="menu_main">
					<li><a href="#">브랜드</a></li>
					<li><a href="#">상품 목록</a></li>
					<li><a href="#">매장</a></li>
					<li><a href="./Event.jsp">이벤트/공지사항</a></li>
				</ul>
				<ul id="menu_sub">
					<li>공지사항</li>
					<li id="link_logo"><a
						href="https://www.facebook.com/GongCha.Korea"> <img
							src="resources/images/facebook.png"></a> <a
						href="https://www.instagram.com/gongcha.official/"> <img
							src="resources/images/instargram.png">
					</a></li>
					<li id="store_logo"><a href="#"> <img
							src="resources/images/sub_menu_logo1.png"> <span><p>&nbsp&nbsp가맹점</p>
								<p>전화번호</p>
								<p>010-1111-1111</p></span>
					</a></li>
				</ul>
				<div id="hd_name">
					<!--슬라이드바  -->
				</div>

				<div id="imgs">
					<a href="#"> <img
						src="${pageContext.request.contextPath}/resources/images/eventpicture.jpg" />
					</a>
				</div>
				<div id="hd_submenu">
					<table>
						<tr id="tbl">
							<td><a href="./Brand.jsp">브랜드 소개</a></td>
							<td><a href="./products.jsp">음료</a></td>
							<td><a href="./store.jsp">매장 찾기</a></td>
							<td><a href="./Event.jsp">이벤트</a></td>
						</tr>
						<tr id="tbl">

							<td></td>
							<td><a href="./products12.jsp">빙수</a></td>
							<td></td>
							<td><a href="#">공지사항</a></td>
						</tr>
						<tr id="tbl">
							<td></td>
							<td><a href="./products13.jsp">디저트</a></td>
							<td></td>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>