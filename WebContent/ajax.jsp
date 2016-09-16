<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.1.0.js"></script>
<script type="text/javascript">
	$(function(){
	
	$("#ajaxButton").click(function(e){
		$.ajax({
			type:"POST",
			url:"findAllUser",
			data:{},
			dataType:"json",
			success:function(data){
				alert(data);
			},
			error:function(data){
				$("#content").html(data.responseText);
			}
		});
			
		});
	});
</script>
</head>
<body>

	<h4>AJAX测试</h4>
	<button id="ajaxButton">提交</button>
	<div id="content"></div>
</body>
</html>