<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="dao.GongchaDAO"%>
<%@ page contentType="text/html; charset=utf-8"%>
<%@page import="dao.GongchaDAO" %>
<%@page import="dto.*" %>
<html>
<head>
<title>Event</title>
<link href="resources/css/event.css" rel="stylesheet" type="text/css">

<script src="https://code.jquery.com/jquery-3.5.1.js" integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js" integrity="sha256-T0Vest3yCU7pafRw9r+settMBX6JkKN06dqBnpQ8d30=" crossorigin="anonymous"></script>

<style>
	
</style>

</head>
<body>
	<div id="wrap" class="event">
		<!--header 추가하기-->
		<div id="header">
			<%@ include file="Title.jsp"%>
		</div>

		<!-- container -->
		
		<div id="container" style="height: 287pt;">
			<div id="pageTop">
				<div class="page_hgroup event">
					<h2 class="tit eng">EVENT</h2>
					<p class="txt">공차의 특별한 이벤트에 참여해 보세요.</p>
				</div>
			</div>
			</div>
			<form name="frmSearch" id="frmSearch">
				<input type="hidden" name="page" id="page" value="1"> <input
					type="hidden" name="status" id="status" value="ing">
			</form>
			<input type="hidden" name="totalPage" id="totalPage" value="1">
			<div id="contents">
				<div class="tab_style1 mb70">
					<ul>
						<li class="on"><a href="#">진행중인 이벤트</a></li>
						<li><a href="#">종료된 이벤트</a></li>
						<li><a href="#">당첨자 발표</a></li>
					</ul>
				</div>
				<!-- 나는 빡빡이다 -->
				<div class="gallery_list_wrap">
					<ul class="gallery_list">
						<% 
							GongchaDAO gongchaDAO = new GongchaDAO();
							 List<EventDTO> list = gongchaDAO.getEventList();
							
							for(EventDTO eventDTO : list){
						%>
						<li>
							<div class="imgs">
								<a href="#"> 
								<img src="${pageContext.request.contextPath}/resources/res_img/<%= eventDTO.getImageName()%>"></a>
							</div>
							<div class="info">
								<p class="tit"><%= eventDTO.getEvent_time() %></p>
								<a href="#">자세히 보기</a>
							</div>
						</li>
						<%
							}
						%>			
					</ul>
				</div>
				<div class="btn_wrap mt60" id="moreBtn" style="display: none;">
					<div class="fl_c">
						<a href="#" class="btn50 gray" style="width: 396px;"
							onclick="Prize.DataLoad();"> <span class="more">더보기</span>
						</a>
					</div>

				</div>
			</div>
		</div>
		
			<div id = "button">
				
					<div id= "button_menu">
						<button type="button" onclick="myFunction()">Click me</button>
					</div>
				
				</div>
	

		<!-- footer -->
		<div id="footer">
			<%@ include file="footer.jsp"%>
		</div>
		



</body>


<script>

	
	function myFunction() {
		
		console.log( "ready!" );

		
	}
	
/* 	.ajax({
		url:,
		data,
		success:function(data){
			console.log("성공");
		}
	}); */




	


</script>









</html>