<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository14"%>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href = "css.css">

<title>상품 목록</title>
<style>
#align_text{
height: 100pt;
    width: 1080pt;
      text-decoration: none;
    
}

#align_text li{
float: left;
    width: 25%;
    height: 40%;
    line-height: 50px;
    text-align: center;
      text-decoration: none;
    list-style-type: none;
  
}
 
 #align_text li a{
 display:block;
   text-decoration: none;
 }
 
 #align_text li a:hover{
 background:#C30E2E;
 color:#fff;}
 
#align_text > la > a > span{
height: 100pt;
    width: 80%;
      text-decoration: none;
    
}
.page_hgroup_event{
width: 1200px;
    height: 264px;
    padding: 0 680px;
    margin: 0 -680px;
    position: relative;
	background: url("../res_img/treegrain.jpg");
}
</style>

</head>
<body>
	<jsp:include page="Title.jsp" />
	
	<div id = "head" style="height: 100pt ;display : block;">
		
	</div>
<div id = "head2">
		
	</div>
		<%
		ProductRepository14 dao = ProductRepository14.getInstance();
		ArrayList<Product> listOfProducts = dao.getAllProducts();
	%>
	<div align="center" style="height: 140pt">
	<ul id= align_text >
			<li><a href="./products13.jsp"style="color:black"><span>베이커리</span></a></li>
			<li><a href="./products14.jsp"style="color:black"><span>스낵&미니 디저트</span></a></li>
			</ul>
			<br>
			</div>
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
				<p><a href="./product14.jsp?id=<%=product.getProductId()%>" class="btn btn-secondary" role="button"> 상세 정보 &raquo;</a>
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
