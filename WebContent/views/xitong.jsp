<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/easyui.css">
<link rel="stylesheet" type="text/css" href="../css/icon.css">
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
<script type="text/javascript">
	$(function() {
		InitLeftMenu();
		$('body').layout();
	})

	function InitLeftMenu() {
		$('.easyui-accordion li a').click(function() {
			var tabTitle = $(this).text();
			var url = $(this).attr("href");
			addTab(tabTitle, url);
			$('.easyui-accordion li div').removeClass("selected");
			$(this).parent().addClass("selected");
		}).hover(function() {
			$(this).parent().addClass("hover");
		}, function() {
			$(this).parent().removeClass("hover");
		});
	}

	function addTab(subtitle, url) {
		if (!$('#tabs').tabs('exists', subtitle)) {
			$('#tabs').tabs('add', {
				title : subtitle,
				content : createFrame(url),
				closable : true,
				width : $('#mainPanle').width() - 10,
				height : $('#mainPanle').height() - 26
			});
		} else {
			$('#tabs').tabs('select', subtitle);
		}
	}

	function createFrame(url) {
		var s = '<iframe name="mainFrame" scrolling="no" frameborder="0"  src="'
				+ url + '" style="width:100%;height:100%;"></iframe>';
		return s;
	}
</script>
</head>
<body class="easyui-layout" style="overflow-y: hidden" scroll="no">

	<div region="north" split="true"
		style="overflow: hidden; height: 100px; background: #D2E0F2 repeat-x center 50%; line-height: 20px; color: #fff;">
		<img alt="" src="../img/dianzhao.jpg" width="100%">
	</div>
	<div region="south" style="height: 20px; background: #D2E0F2;">
		<div style="text-align: center; font-weight: bold">EntWebSite ver 1.0</div>
	</div>
	<div region="west" split="true" title="导航菜单" style="width: 180px; overflow: hidden;"
		icon="icon-redo">
		<div id="menu" class="easyui-accordion" fit="true" border="false">
			<div title="权限管理" style="overflow: auto; padding: 10px;" icon="icon-edit">
				<div title="权限管理">
					<ul>
						<li>
							<div>
								<a target="mainFrame" href="index.jsp">员工管理</a>
							</div>
						</li>
						<li>
							<div>
								<a target="mainFrame" href="index2.jsp">用户管理</a>
							</div>
						</li>
					</ul>
				</div>
			</div>
			<div title="系统配置" style="padding: 10px;" icon="icon-edit">
				<div title="系统配置">
					<ul>
						<li>
							<div>
								<a target="mainFrame" href="Product/Default.htm">产品管理</a>
							</div>
						</li>
					</ul>
				</div>
			</div>
			<div title="关于" icon="icon-help">
				<h4>EntWebSite Ver 1.0</h4>
			</div>
		</div>
	</div>
	<div region="center" id="mainPanle" style="background: #eee; overflow: hidden;">
		<div id="tabs" class="easyui-tabs" fit="true" border="false">
			<div title="主页" style="padding: 20px;" id="home">
				<h1>Welcome...</h1>
			</div>
		</div>
	</div>
</body>