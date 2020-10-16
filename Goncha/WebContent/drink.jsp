<%@ page contentType="text/html; charset=utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/homepage2.css"
	type="text/css">

</head>
<div class="container">
	<%@ include file="Banner.jsp"%>
		<%@ include file="Title.jsp"%>
	
	<div class = "drink">
	
		<div id = "menu_tbl" >
		<div id="pageTop">
				<div class="page_hgroup event">
					<h2 class="tit eng">HOW TO ORDER</h2>
					<p class="txt">취향에 맞게 토핑, 당도, 얼음량까지 맞춤 주문이 가능합니다.</p>
				</div>
			</div>
			
		</div>
	</div>
</div>
		
<%@ include file="footer.jsp"%>
</html>