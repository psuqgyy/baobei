<!doctype html>
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>大唐办公系统</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
<link href="css/slide-unlock.css" rel="stylesheet">
<link href="css/xcConfirm.css" rel="stylesheet">
</head>
<body>
	<div class="htmleaf-container">
		<div class="wrapper">
			<div class="container">
				<h1>大唐办公系统</h1>

				<form class="form" method="post" action="login">
					<input type="text" placeholder="账号" name="username">
					<input type="password" placeholder="密码" name="password">
					<div id="demo">
						<div id="slider" style="width: 250px; margin: 0 auto">
							<div id="slider_bg"></div>
							<span id="label">>></span> <span id="labelTip">拖动滑块验证</span>
						</div>
						<script src="js/jquery-3.1.0.js"></script>
						<script src="js/jquery.slideunlock.js"></script>
						<script src="js/xcConfirm.js"></script>
						<script>
							$(function() {
								var flag=false;
								var slider = new SliderUnlock("#slider", {
									successLabelTip : "已解锁"
								}, function() {
									//验证完成函数。
									flag=true;
								});
								slider.init();
								$("form").submit(function(e) {
									if(flag){
										return true;
									}else{
										var txt=  "请验证滑块";
										window.wxc.xcConfirm(txt, window.wxc.xcConfirm.typeEnum.info);
										return false;
									}
								});
								
							})
						</script>
					</div>
					<button type="submit" id="login-button">登陆</button>
				</form>
			</div>

			<ul class="bg-bubbles">
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
			</ul>
		</div>
	</div>
	<div
		style="text-align: center; margin: 50px 0; font: normal 14px/24px 'MicroSoft YaHei'; color: #000000">
	</div>
</body>
</html>