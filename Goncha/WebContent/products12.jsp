<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository12"%>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href = "css.css">

<title>상품 목록</title>
<style>
ul li{
float:left;
width:25%;
height:10%;
line-height:50px;
text-align:center;
background:;
list-style-type:none;
}
 
 ul li a{
 display:block;
 }
 
 ul li a:hover{
 background:#C30E2E;
 color:#fff;}

</style>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/homepage.css"
	type="text/css">
</head>
<body>
	<jsp:include page="Title.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">빙수</h1>
			
		</div>
	</div>
	<%
		ProductRepository12 dao = ProductRepository12.getInstance();
		ArrayList<Product> listOfProducts = dao.getAllProducts();
	%>
	

			
	<div class="container">
		<div class="row" align="center">
			
			<%
				for (int i = 0; i < listOfProducts.size(); i++) {
					Product product = listOfProducts.get(i);
			%>
			
				
			<div class="col-md-3">
				<img src="${pageContext.request.contextPath}/resources/product_img/<%=product.getFilename()%>" style="width: 100%">
				<h3><%=product.getPname()%></h3> 
				<p>가격 <%=product.getUnitPrice()%>원
				<p><a href="./product12.jsp?id=<%=product.getProductId()%>" class="btn btn-secondary" role="button"> 상세 정보 &raquo;</a>
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
