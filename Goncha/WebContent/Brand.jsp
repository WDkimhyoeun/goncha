<%@ page contentType="text/html; charset=utf-8"%>

<html>
<head>
	<title>Brand</title>
	<link href="resources/css/brand.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="wrap" class="brand">
		<!--header 추가하기-->
		<div id="header">
			<%@ include file="Title.jsp"%>
		</div>
		
		<!-- container -->
		<div id="container">
			<div id="pageTop">
				<div class="page_hgroup brand">
					<h2 class="tit eng">BRAND STORY</h2>
					<p class="txt">브랜드 소개</p>
				</div>
			</div>
			<div id="contents">
				<div class="brand_story_wrap">
					<div class="head n-motion n-bottom n-active">
						<p class="tit">황실에 바치는 차(茶), 공차를 소개합니다.</p>
						<p class="txt">
						貢茶는 바칠 공, 차 차의 뜻으로 중국 황실에서만 맛 볼 수 있던 프리미엄 퀄리티의 차(茶)를<br>
						바친다는 의미를 지니고 있습니다. 대만은 차나무가 자라기에 최적의 기온과 기상조건을 가지고 있어<br>
						중국의 황실에 최고급 차 잎을 생산해낼 수 있었습니다.<br>
						<span class="red">중국 황실에 진상하던 대만의 프리미엄 잎차를 신선하게 우려낸 차, 그것이 바로 공차랍니다.</span></p>
						<div class="video">
							<iframe width="800" height="600" src="https://www.youtube.com/embed/AYMpuJofWJw" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
						</div>
					</div>
					<div class="body">
						<div class="hgroup">
							<p class="tit">공들여 맛있는 차 공차</p>	
						</div>
						<ul>
							<li>
								<div class="left n-motion n-left n-active">
									<p class="tit">고른다</p>
									<p class="txt1">세상의 茶가 빠름을 쫓을 때 공차는 느림을 쫓습니다.</p>
									<p class="txt2">
										티백이나 가루를 멀리하고<br>
										황실에 바치던 잎차를 고집합니다.	
									</p>
								</div>
								<img src="./res_img/brand_story_img1.png" alt="" class="n-motion n-spin n-active">
								<div class="right n-motion n-right n-active">
									<p class="txt">
										대만 현지의 따뜻하고 깨끗한 기후조건에서 자란<br>
										중국의 황실에 진상하던 대만의 프리미엄 찻잎들을<br>
										차(茶) 장인의 노하우로 재배, 건조, 발효, 정제과정을 거친<br>
										최상의 품질을 가진 찻잎만을 사용합니다.
									</p>
								</div>
							</li>
							
							<li>
								<div class="left n-motion n-left n-active">
									<p class="tit">우린다</p>
									<p class="txt1">세상의 茶가 간편함을 품을 때 공차는 불편함을 품습니다.</p>
									<p class="txt2">
										1도 1초도 어기지 않고<br>
										차마다 다른 황금률로 우립니다.	
									</p>
								</div>
								<img src="./res_img/brand_story_img2.png" alt="" class="n-motion n-spin n-active">
								<div class="right n-motion n-right n-active">
									<p class="txt">
										숙련된 공차의 티마스터(Tea Master)가<br>
										공차 음료의 기본이 되는 우롱티, 블랙티, 자스민 그린티,<br>
										얼그레이티를 눈대중이 아닌 차마다 다른 온도와 황금율로<br>
										정성을 다해 우려내고 있습니다.
									</p>
								</div>			
							</li>
							
							<li>
								<div class="left n-motion n-left n-active">
									<p class="tit">더한다</p>
									<p class="txt1">세상의 茶가 틀 안을 향할때 공차는 틀 밖을 향합니다.</p>
									<p class="txt2">
										고정관념에 갇히지 않고<br>
										끝없이 새로운 맛을 창조합니다.	
									</p>
								</div>
								<img src="./res_img/brand_story_img3.png" alt="" class="n-motion n-spin n-active">	
								<div class="right n-motion n-right n-active">
									<p class="txt">
										공차의 모든 음료는 토핑, 당도, 얼음을<br>
										내 입맛에 따라 선택하여 즐기실 수 있습니다.<br>
										매일매일 새롭고 다양한 맛과 함께 차 한 잔에 우려내는<br>
										행복한 순간을 위해 끊임없이 노력하고 있습니다.
									</p>
								</div>											
							</li>
						</ul>			
					</div>
				</div>
			</div>
		</div>
		
		<!-- footer -->
		<div id="footer">
			<div class="footer_inner">
				<div class="footer_left">
					<img class="logo" src="./res_img/ft_logo.png" alt="GONGCHA">
					<p class="copyright">
						(C)GONGCHA KOREA CO.,LTD<br>
						ALL RIGHTS RESERVED.
					</p>
				</div>
				<div class="footer_right">
					<ul class="ft_menu">
						<li>
							<a href="#">회사소개</a>
						</li>
						<li>						
							<a href="#">제휴/제안</a>
						</li>
						<li>						
							<a href="#">고객센터</a>
						</li>
						<li>						
							<a href="#">개인정보처리방침</a>
						</li>
						<li>						
							<a href="#">이메일무단수집거부</a>
						</li>
						<li>						
							<a href="#">사이트맵</a>
						</li>
					</ul>
					<p class="center">
						고객센터
						<span class="tell">02-779-7758</span>
						<span class="time">(운영시간 오전 9시~오후 6시/주말 및 공휴일 휴무)</span>
					</p>
					<address class="address">
						<span>서울 종로구 종로 47(공평동, 7층)</span>
						<span>㈜공차코리아 대표이사 김의열</span>
						<span>사업자등록번호 214-88-84534</span>
						<span>통신판매번호: 2014-서울서초-1322</span>
					</address>
				</div>
			</div>
		</div>

		
</div>
</body>
</html>