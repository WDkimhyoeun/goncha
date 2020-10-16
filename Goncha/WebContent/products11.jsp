<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository11"%>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css.css">

<title>상품 목록</title>
<style>
ul li {
	float: left;
	width: 25%;
	height: 10%;
	line-height: 50px;
	text-align: center;
	background:;
	list-style-type: none;
}

ul li a {
	display: block;
}

ul li a:hover {
	background: #C30E2E;
	color: #fff;
}
</style>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/homepage.css"
	type="text/css">
</head>
<body>
	<jsp:include page="Title.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">음료</h1>
			<h3 class="display-5">커피</h3>
		</div>
	</div>
	<%
		ProductRepository11 dao = ProductRepository11.getInstance();
	ArrayList<Product> listOfProducts = dao.getAllProducts();
	%>

	<div>
		<ul>
			<li><a href="./products.jsp" style="color: black"><span>시즌
						메뉴</span></a></li>
			<li><a href="./products2.jsp" style="color: black"><span>베스트
						콤비네이션</span></a></li>
			<li><a href="./products3.jsp" style="color: black"><span>오리지널
						티</span></a></li>
			<li><a href="./products4.jsp" style="color: black"><span>밀크티</span></a></li>
			<li><a href="./products5.jsp" style="color: black"><span>밀크폼&치즈폼</span></a></li>
			<li><a href="./products6.jsp" style="color: black"><span>그린티
						에이드</span></a></li>
			<li><a href="./products7.jsp" style="color: black"><span>주스&요구르트</span></a></li>
			<li><a href="./products8.jsp" style="color: black"><span>스페셜</span></a></li>
			<li><a href="./products9.jsp" style="color: black"><span>후르츠티</span></a>
			<li>
			<li><a href="./products10.jsp" style="color: black"><span>스무디&크러쉬</span></a></li>
			<li><a href="./products11.jsp" style="color: black"><span>커피</span></a></li>
		</ul>
		<br>
	</div>
	<br>


	<div class="container">
		<div class="row" align="center">

			<%
				for (int i = 0; i < listOfProducts.size(); i++) {
				Product product = listOfProducts.get(i);
			%>

			<div class="col-md-3">
				<img src="${pageContext.request.contextPath}/resources/product_img/<%=product.getFilename()%>" style="width: 100%">
				<h3><%=product.getPname()%></h3>
				<p>
					가격
					<%=product.getUnitPrice()%>원
				<p>
					<a href="./product11.jsp?id=<%=product.getProductId()%>"
						class="btn btn-secondary" role="button"> 상세 정보 &raquo;</a>
			</div>
			<%
				}
			%>
		</div>
		<hr>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>
