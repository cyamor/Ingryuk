<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>잉력시장 회원가입-아이디 중복확인</title>


<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/font-awesome.min.css" />
<link rel="stylesheet" href="css/Home.css" />

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="http://malsup.github.com/jquery.cycle2.js"></script>
<script src="js/member.js"></script>
<script src="js/bootstrap.min.js"></script>

<script type="text/javascript">
</script>

<style type="text/css">
table{
width:450px;
align: center;
cellspacing:1px;
border:0px;
}
tr,td{
padding:1px;
text-height:1.4;
text-align: center;
}
</style>


</head>




<body>
	<div class="container" style="align-content: center; padding:1.5rem;">
		<form name="myform" method="get" action="idCheck.do">
		<input type="hidden" name="reid" size="20">
		<div class="form-row register" style=" margin-bottom:1rem;">아이디 중복확인</div>
			<table>
				<tr>
					<td width="80px">아이디</td>
					<td width="200px"><input class="form-control" id="userid" name="userid" value="${userid}">
					</td>
					<td width="150px"><input type="button" id="idCheck"
						class="btn btn-info" style="margin: 0.1rem; align:center;" value="중복확인"
						onclick="idCheck()"></td>
				</tr>
				<tr>
				
				<c:if test="${result==1}">	
				<td colspan="3" style="text-align:left;">		
				${userid }는 이미 사용중인 아이디입니다.
				</td>				
				</c:if>
				<c:if test="${result==0}">	
				<td colspan="2" style="text-align:left;">		
				${userid }는 사용 가능한 아이디입니다.		
				</td>
				<td width="150px"><input type="button" id="idCheckOK"
						class="btn btn-info" style="margin: 0.1rem; align:center;" value="사용하기"
						></td>		
				</c:if>
				
				</tr>
			</table>
		</form>
	</div>


</body>
</html>