<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	if(ActionContext.getContext().getApplication().get("username")==null){
		ActionContext.getContext().getApplication().put("username","登录");
		response.sendRedirect(path+"/login.jsp");
	} 
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 5.0 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>exam.jsp</title>
 <base href="<%=basePath%>">
    <title>课程选择 - DF - 在线学习网站 </title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link type="text/css" rel="stylesheet" href="css/layout.css">
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/exam_style.css" />
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	<script src="js/jquery-1.11.1.min.js"></script>
	<link href='http://fonts.useso.com/css?family=Yanone+Kaffeesatz:400,200,300,700' rel='stylesheet' type='text/css'>
	<link href='http://fonts.useso.com/css?family=Open+Sans:400,800italic,800,700italic,700,600italic,600,400italic,300italic,300' rel='stylesheet' type='text/css'>
	<script src="js/bootstrap.js"></script>
	<script type="text/javascript" src="js/jquery.easing.min.js"></script>
	<script type="text/javascript" src="js/jquery.mixitup.min.js"></script>
	<script type="text/javascript" src="js/quiz.js"></script>
	<script src="js/logo.js"></script>
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
	
	var time=3;
	function timeCount(){

		time--;
		if(time>=0){
			var flag=setTimeout("timeCount()",1000);
			}
		else{
			clearTimeout(flag);
			var ss="<%=path%>/student/examAction_RecordTest.action?test.score="+score2;
			window.location.href=ss;
			}	
		}
	
	</script>
<style type="text/css">
.demo {
	text-align:center;
	width: 760px;
	margin: 60px auto 10px auto
}
</style>
<script type="text/javascript">
	var init = {
		'questions' : []
	};
	var i = 0;
	$(function() {
		$('#quiz-container').jquizzy({
			questions : init.questions
		});
	//	var t=setTimeout("turn()",5000);
		turn();
	});
	
	
</script>
<s:iterator value="exams" id="exam">
	<script type="text/javascript">
		init.questions[i] = {
			'question' : '<s:property value="#exam.question"/>',
			'answers' : [ '<s:property value="#exam.optionA"/>',
					'<s:property value="#exam.optionB"/>',
					'<s:property value="#exam.optionC"/>',
					'<s:property value="#exam.optionD"/>' ],
			'correctAnswer' : <s:property value="#exam.answer"/>
		};
		i++;
	</script>
</s:iterator>
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

    <div class="demo">
		<div id='quiz-container'></div>
	</div>
		
</body>
</html>
