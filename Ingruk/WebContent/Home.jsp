<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="kr">

<head>
<meta charset="UTF-8">
<title>잉력시장 Ingryuk-market :: 소소한 재능마켓</title>

<link rel="stylesheet" href="css/bootstrap.min.css"/>
<link rel="stylesheet" href="css/font-awesome.min.css"/>
<link rel="stylesheet" href="css/Home.css"/>

<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="http://malsup.github.com/jquery.cycle2.js"></script>
<script src="js/bootstrap.min.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$("#header").load("Header.html");
		$("#MenuNavigator").load("Menu.html");
		$("#footer").load("Footer.html");
	});
</script>

</head>
<body>

	<!-- //헤더 -->

	<div id="header" class="container-fluid" style="height:100px;">
	</div>

	<!--  //메인화면 상단 슬라이드 -->

	<div id="carouselExampleIndicators" class="carousel slide"
		data-ride="carousel">
		<ol class="carousel-indicators">
			<li data-target="#carouselExampleIndicators" data-slide-to="0"
				class="active"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner" role="listbox">
			<div class="carousel-item active" style="max-height: 600px">
				<a href="Guide.html"><img class="d-block w-100"
					src="img/slide_blank1.png" alt="First slide"></a>
				<div class="carousel-caption d-block">
					<h5>잉력시장 가이드</h5>
					<p>
						잉력시장을 처음 이용하시는 분들께<br> 소소한 재능으로 치킨값을 벌어봅시다 :-9
					</p>
				</div>
			</div>
			<div class="carousel-item" style="max-height: 600px">
				<a href="NewCommission.html"> <img class="d-block w-100"
					src="img/slide_blank2.png" alt="Second slide">
				</a>
				<div class="carousel-caption d-block">
					<h5>오늘의 새로운 의뢰</h5>
					<p>새로운 의뢰를 받아 보세요!</p>
				</div>
			</div>
			<div class="carousel-item" style="max-height: 600px">
				<a href="NewCeleb.html"> <img class="d-block w-100"
					src="img/slide_blank3.png" alt="Third slide">
				</a>
				<div class="carousel-caption d-block">
					<h5>이달의 인기 재능인</h5>
					<p>
						이번달에 치킨값을 가장 열심히 버신 재능인을 소개합니다. <br> 어떻게 벌었는지 알아볼까요? 여러분도 도전해
						보세요!

					</p>
				</div>
			</div>
		</div>
		<a class="carousel-control-prev" href="#carouselExampleIndicators"
			role="button" data-slide="prev"> <span
			class="carousel-control-prev-icon" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
			role="button" data-slide="next"> <span
			class="carousel-control-next-icon" aria-hidden="true"></span> <span
			class="sr-only">Next</span>
		</a>
	</div>

	<!--  //메뉴 네비게이터 -->

	<div class="container-fluid" align="center">
	<div id="MenuNavigator"></div>
	</div>



	<div id="ContentsPage" class="container" style="float:left; align:center;">
		<jsp:include page="NewCommission.html"/>
	</div>


	<!--  //푸터 -->

	<footer class="container-fluid">
		<div id="footer"></div>
	</footer>
</body>
</html>