<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/font-awesome.min.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="http://malsup.github.com/jquery.cycle2.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$("#header").load("Header.html");
		$("#MenuNavigator").load("Menu.html");
		$("#footer").load("Footer.html");
	});
</script>

<style type="text/css">
</style>


<title>Commission Lists</title>

</head>
<body>

	<!-- //헤더 -->

	<header class="header">
		<div id="header"></div>
	</header>
	<hr>
	<!--  //메뉴 네비게이터 -->

	<div class="container-fluid" align="center">
		<div id="MenuNavigator"></div>
	</div>
	<p>
		<!--  //내용 -->
	<div id="CommissionList" class="container" style="height: 1000px; margin-top:1rem;">
		리스트가 들어갈곳</div>

	<!--  //푸터 -->
	<footer class="container-fluid">
		<div id="footer"></div>
	</footer>
</body>
</html>