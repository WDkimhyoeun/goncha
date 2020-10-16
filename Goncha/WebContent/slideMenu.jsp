<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/homepage2.css"
	type="text/css">
	
</head>
<style>
	
	.container{
	top:100pt;
	position:relative;
	 overflow: hidden;
	width: 2500px;
	height: 1000px;
    margin: 0 auto;
    left :-240pt;
    position: ab;
	z-index: 1;
	}
	.carousel-control{
	
	}
	.carousel-control.left{
	left:190px;
	
	}
	.carousel-control.right{

	right:250px;
	}
.carousel-indicators {
    bottom: -10px; 
}
#side_menubar > ul > li {
margin: 1px;
float: left;
}
.carousel-indicators li{
box-sizing:border-box;
border-radius:0;
text-indent:0;
line-height: 35pt;
 background: white;
}
.carousel-indicators .active {
background: indianred;
}
</style>
<body>

<div class="container">
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
 <!--   <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active">1212</li>
      <li data-target="#myCarousel" data-slide-to="1">121</li>
      <li data-target="#myCarousel" data-slide-to="2">212</li>
    </ol> -->

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
      	<a href="#">
        				<img src="${pageContext.request.contextPath}/resources/images/banner1.jpg" alt="첫 번째 페이지" style="width:100%;">
      </a>
      </div>

      <div class="item">
        	<a href="#">
        	<img src="${pageContext.request.contextPath}/resources/images/banner2.jpg" alt="두 번째 페이지" style="width:100%;">
</a>
      </div>
 
      <div class="item">
      	<a href="#">
        <img src="${pageContext.request.contextPath}/resources/images/banner3.jpg" alt="세 번째 페이지" style="width:100%;">
     </a>
   
    </div>
 <div class="item">
      	<a href="#">
        <img src="${pageContext.request.contextPath}/resources/images/banner3.jpg" alt="네 번째 페이지" style="width:100%;">
     </a>
   
    </div>
    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
  <div id = "side_menu">
  	<div id = "side_menubar">
		<ul class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active">메뉴1</li>
			<li data-target="#myCarousel" data-slide-to="1">메뉴2</li>
			<li data-target="#myCarousel" data-slide-to="2">메뉴3</li>
			<li data-target="#myCarousel" data-slide-to="3">메뉴4</li>
		</ul>
  	</div>
  </div>
</div>
</div>

</body>
</html>