<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Ingryuk-market : user Login</title>


<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/font-awesome.min.css" />
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="js/member.js"></script>
<script src="http://malsup.github.com/jquery.cycle2.js"></script>
<script src="js/bootstrap.min.js"></script>

</head>
<body>
<p>
<div class="container contents">
<form name="login" method="post" action="Login.do">
<div class="form-row">
<div class="col-2" style="padding: 0.2rem;">&nbsp;</div>
<div class="col-2">아이디</div>
<input type="text" id="userid" class="col-3  form-control">
</div>
<div class="form-row">
<div class="col-2" style="padding: 0.2rem;">&nbsp;</div>
<div class="col-2">패스워드</div>
<input type="password" id="userpwd" class="col-3  form-control">
</div>
<div class="form-row">
			<div class="col-2" style="padding: 0.4rem;">&nbsp;</div>
				<input type="submit" id="submitbtn"
					class="btn btn-outline-info btn-lg col-2"
					style="padding: 0.2rem; margin: 10px;"
					value="로그인"> <input type="button" id="cancel"
					class="btn btn-outline-info btn-lg  col-2"
					style="padding: 0.2rem; margin: 10px;"
					onclick="location.href='Home.jsp'" value="취소">

			</div>
</form>
</div>



</body>
</html>