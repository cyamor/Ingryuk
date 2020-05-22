<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>잉력시장 회원가입</title>


<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/font-awesome.min.css" />
<link rel="stylesheet" href="css/Home.css" />

<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="js/member.js"></script>
<script src="http://malsup.github.com/jquery.cycle2.js"></script>
<script src="js/bootstrap.min.js"></script>

<script type="text/javascript">
</script>

<style type="text/css">
.form-row {
	width: auto;
	display: flex;
	align-items: center;
}
</style>


</head>




<body>
	<div class="container-xl" >
		<div class="form-row register" style="padding: 1rem; margin-bottom:2rem;">잉력시장 회원가입</div>
		<p>
		<form name="myform" method="post" action="Join.do">
		<input type="hidden" name="reid" size="20">
			<div class="form-row">
			<div class="col-1" style="padding: 0.2rem;">&nbsp;</div>
				<div class="col-2" style="padding: 0.2rem;">아이디</div>
				<input type="text" id = "userid" name="userid" class="form-control col-3"
					aria-describedby="IDhelp"
					style="padding: 0.2rem; margin-right: 1rem;">
				<input type="button" id="idCheck" class="btn btn-info col-1" style="padding: 0.2rem;" value="중복확인" onclick="idCheck()" >
			</div>
			<div class="form-row">
			<div class="col-1" style="padding: 0.2rem;">&nbsp;</div>
				<div class="col-2" style="padding: 0.2rem;">&nbsp;</div>
				<small id="IDhelp" class="text-muted col-6">6~10글자 영문 또는 숫자를
					입력하세요.</small>
			</div>
			<div class="form-row">
			<div class="col-1" style="padding: 0.2rem;">&nbsp;</div>
				<div class="col-2" style="padding: 0.2rem;">비밀번호</div>
				<input type="password" name="PWD" class="form-control col-3"
					aria-describedby="PWDhelp" style="padding: 0.2rem;">
				<div class="col-1" style="padding: 0.2rem;"></div>
			</div>

			<div class="form-row">
			<div class="col-1" style="padding: 0.2rem;">&nbsp;</div>
				<div class="col-2" style="padding: 0.2rem;">&nbsp;</div>
				<small id="PWDhelp" class="text-muted col-6 "> 8~12자리, 영문자,
					숫자, 특수문자</small>

			</div>
			<div class="form-row">
			<div class="col-1" style="padding: 0.2rem;">&nbsp;</div>
				<div class="col-2" style="padding: 0.2rem;">비밀번호 확인</div>
				<input type="password" name="PWD2" class="form-control col-3"
					aria-describedby="PWDhelp2" style="padding: 0.2rem;">
				<div class="col-1" style="padding: 0.2rem;"></div>
			</div>

			<div class="form-row">
			<div class="col-1" style="padding: 0.2rem;">&nbsp;</div>
				<div class="col-2" style="padding: 0.2rem;">&nbsp;</div>
				<small id="PWDhelp2" class="text-muted col-6 "> 비밀번호를 한 번 더 입력하세요.</small>

			</div>
			<div class="form-row">
				<hr class="col-5" align="left">
			</div>

			<div class="form-row" style="margin-top: 1rem;">
			<div class="col-1" style="padding: 0.2rem;">&nbsp;</div>
				<div class="col-2" style="padding: 0.2rem;">이름</div>
				<input type="text" name="name" class="form-control col-3"
					aria-describedby="namehelp" style="padding: 0.2rem;">
				<div class="col-1" style="padding: 0.2rem;"></div>
			</div>

			<div class="form-row">
			<div class="col-1" style="padding: 0.2rem;">&nbsp;</div>
				<div class="col-2" style="padding: 0.2rem;">&nbsp;</div>
				<small id="namehelp" class="text-muted col-6 "></small>
			</div>
			<div class="form-row">
			<div class="col-1" style="padding: 0.2rem;">&nbsp;</div>
				<div class="col-2" style="padding: 0.2rem;">생년월일</div>
				<input type="text" name="birth" class="form-control col-3"
					aria-describedby="birthhelp" style="padding: 0.2rem;">
				<div class="col-1" style="padding: 0.2rem;"></div>
			</div>

			<div class="form-row">
			<div class="col-1" style="padding: 0.2rem;">&nbsp;</div>
				<div class="col-2" style="padding: 0.2rem;">&nbsp;</div>
				<small id="birthhelp" class="text-muted col-6 "> 8자리 숫자</small>
			</div>
			<div class="form-row">
			<div class="col-1" style="padding: 0.2rem;">&nbsp;</div>
				<div class="col-2" style="padding: 0.2rem;">휴대전화</div>
				<input type="tel" name="phone" class="form-control col-3"
					aria-describedby="telhhelp" style="padding: 0.2rem;">
				<div class="col-1" style="padding: 0.2rem;"></div>
			</div>

			<div class="form-row">
			<div class="col-1" style="padding: 0.2rem;">&nbsp;</div>
				<div class="col-2" style="padding: 0.2rem;">&nbsp;</div>
				<small id="telhelp" class="text-muted col-6 "> '-'없이 입력하세요.</small>
			</div>
			<div class="form-row">
			<div class="col-1" style="padding: 0.2rem;">&nbsp;</div>
				<div class="col-2" style="padding: 0.2rem;">이메일</div>
				<input type="email" name="email" class="form-control col-4"
					aria-describedby="telhhelp" style="padding: 0.2rem;"
					onchange="checkEmail();">
				<div class="col-1" style="padding: 0.2rem;"></div>
			</div>

			<div class="form-row">
			<div class="col-1" style="padding: 0.2rem;">&nbsp;</div>
				<div class="col-2" style="padding: 0.2rem;">&nbsp;</div>
				<small id="emailhelp" class="text-muted col-6 "></small>
			</div>

			<p>
			<div class="form-row">
			<div class="col-2" style="padding: 0.2rem;">&nbsp;</div>
				<input type="submit" id="submitbtn"
					class="btn btn-outline-info btn-lg col-2"
					style="padding: 0.2rem; margin: 10px;"
					value="입력완료"> <input type="button" id="cancel"
					class="btn btn-outline-info btn-lg  col-2"
					style="padding: 0.2rem; margin: 10px;"
					onclick="location.href='Home.jsp'" value="취소">

			</div>
		</form>
	</div>


</body>
</html>