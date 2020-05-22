$(function(){
	$(document).on("click","#idCheck",function(){
		var a = $("#userid").val();
		if(a==" "||a==null){
			alert('아이디를 입력해 주세요.');
			document.myform.userid.focus();
			return;
		}
		if(a.length<6 || a.length>10){
			alert('아이디는 6~10자 사이로 입력하세요.');
			document.myform.userid.focus();
			return;
		}
		var url = "idCheck.do?userid="+ a;
		window.open(url, "_blank_1", "toolbar=no, menubar=no, scrollbars=no, resizable=no, width=500px, height=300px, top=200px, left=400px");
	}); // idCheck function
	
	$(document).on("click","#idCheckOK",function(){
		opener.myform.userid.value = document.myform.userid.value;
		opener.myform.reid.value = document.myform.reid.value;
		self.close();
		
	});//idCheckOK function
	
	$(document).on("click","#submitbtn",function(){
		
	});
	
	
}); //END