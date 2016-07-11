<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
if(ActionContext.getContext().getApplication().get("username")==null){
	ActionContext.getContext().getApplication().put("username","登录");
} 
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 5.0 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>课程选择 - DF - 在线学习网站 </title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link type="text/css" rel="stylesheet" href="css/layout.css">
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
	<link rel="stylesheet" href="css/jquery.dad.css">
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	<script src="js/jquery-1.11.1.min.js"></script>
	<link href='http://fonts.useso.com/css?family=Yanone+Kaffeesatz:400,200,300,700' rel='stylesheet' type='text/css'>
	<link href='http://fonts.useso.com/css?family=Open+Sans:400,800italic,800,700italic,700,600italic,600,400italic,300italic,300' rel='stylesheet' type='text/css'>
	<script src="js/bootstrap.js"></script>
	<script type="text/javascript" src="js/jquery.easing.min.js"></script>
	<script type="text/javascript" src="js/jquery.mixitup.min.js"></script>
	<script src="js/logo.js"></script>
	<script src="js/jquery.dad.min.js"></script>
	<script type="text/javascript">
	$(function(){
	var filterList = {
		init:function(){
			// MixItUp plugin
			$('#portfoliolist').mixitup({
				targetSelector: '.portfolio',
				filterSelector: '.filter',
				effects: ['fade'],
				easing: 'snap',
				// call the hover effect
				onMixEnd: filterList.hoverEffect()
			});				
		},
		hoverEffect:function(){
			// Simple parallax effect
			$('#portfoliolist .portfolio').hover(function(){
				$(this).find('.label').stop().animate({bottom:0},200,'easeOutQuad');
				$(this).find('img').stop().animate({top:-30},500,'easeOutQuad');				
			},function(){
				$(this).find('.label').stop().animate({bottom:-40},200,'easeInQuad');
				$(this).find('img').stop().animate({top:0},300,'easeOutQuad');								
			});				
		}

	};
	filterList.init();
	});	
	</script>
  </head>
  
  <body>
    <!--header-->
			<div class="header banr">
				<div class="container">
					<div class="header-top">
						<nav class="navbar navbar-default">
							<div class="container-fluid">
								<div class="navbar-header">								 
									<div class="navbar-brand">
										<h1><a href="welcome.jsp"><canvas id="canvas" width="380" height="40">Sorry, canvas not supported</canvas></a></h1>
									</div>
								</div>
							<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							  <ul class="nav navbar-nav"> 
									<li><a href="welcome.jsp">主页 <span class="sr-only">(current)</span></a></li>
									<li class="active"><a href="<%=path %>/student/courseAction_findAllCourse.action">课程</a></li>
									<li><a href="student/courseAction_findMyCourse.action">我的课程</a></li>
									<li class="dropdown">
										<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">用户 <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="login.jsp"><%=ActionContext.getContext().getApplication().get("username") %></a></li>
									<li><a href="student/userAction_logOut.action">注销</a></li>
								</ul>
									</li>					
									<li><a href="contact.jsp">联系方式</a></li>
								</ul>
							  
							</div>
  </div>
						</nav>

					</div>
			</div>
	</div>
	<script type="text/javascript" >
        window.addEventListener("load", MakeLogo, true);//加载logo
    </script>
<!--header-->

<!-- 课程选择 -->
<div class="content" style="min-height:1000px;">
			<!--services-->
			<div class="services">
				<div class="container">
					<h2>课程选择</h2>
                    
                    <div class="container">

	<ul id="filters" class="clearfix">
		<li><span class="filter active" data-filter="IT manager history test life">所有课程</span></li>
		<li><span class="filter" data-filter="IT">IT编程</span></li>
		<li><span class="filter" data-filter="manager">经济/管理</span></li>
		<li><span class="filter" data-filter="history">历史/文化</span></li>
		<li><span class="filter" data-filter="test">等级考试</span></li>
		<li><span class="filter" data-filter="life">生活技巧</span></li>
	</ul>
	
	<div id="portfoliolist">
		<s:iterator value="courses" id="cou">
			<div class="portfolio <s:property value="#cou.type"/>" data-cat="<s:property value="#cou.type"/>" 
				onclick="window.location.href='<%=path%>/student/courseAction_findTheCourse.action?id=<s:property value="#cou.cid"/>'" >
			<div class="portfolio-wrapper">
				<img src="<s:property value="#cou.cimg"/>" width="264" height="198" alt="" />
				<div class="label">
					<div class="label-text">
						<a class="text-title"><s:property value="#cou.cname"/></a>
						<span class="text-category"><s:property value="#cou.type"/></span>
					</div>
					<div class="label-bg"></div>
				</div>
			</div>
		</div>
		</s:iterator>
	</div>
	<script>
	$(function(){ 
		$('#portfoliolist').dad(); //拖放功能加载
	});
	</script>
</div>
				</div>	
			</div>	
			<!--feature-->
		</div>

			<!--footer-->
				<div class="footer-section">
					<div class="container">
						<div class="social-icons">
							<a href="#"><i class="icon1"></i></a>
							<a href="#"><i class="icon4"></i></a>
						</div>
						<div class="footer-top">
							<p>Copyright &copy; 2016. By LLC.</p>
						</div>						
					</div>
				</div>
			<!--footer-->

  </body>
</html>
