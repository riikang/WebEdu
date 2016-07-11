<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
if(ActionContext.getContext().getApplication().get("username").equals("登录")
		||ActionContext.getContext().getApplication().get("username")==null){
	response.sendRedirect(path+"/login.jsp"); 
}
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>课程学习 - DF - 在线学习网站</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link href="css/table_style.css" rel="stylesheet" type="text/css" media="all">
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
	<link rel="stylesheet" type="text/css" href="css/demo.css" />
	<link rel="stylesheet" type="text/css" href="css/component.css" />
	<link rel="stylesheet" href="css/main.css" />
	<link rel="stylesheet" type="text/css" href="css/sinaFaceAndEffec.css" />
	<link href='http://fonts.useso.com/css?family=Yanone+Kaffeesatz:400,200,300,700' rel='stylesheet' type='text/css' />
	<link href='http://fonts.useso.com/css?family=Open+Sans:400,800italic,800,700italic,700,600italic,600,400italic,300italic,300' rel='stylesheet' type='text/css' />
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	<script src="js/bootstrap.js"></script>
	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/cbpFWTabs.js"></script>
	<script src="js/logo.js"></script>
	<script>
	var i=1;
	<!-- 
  	$(document).ready(function(e) { 
    	$('a.zhan').click(function(){ 
 			var left = parseInt($(this).offset().left)+60;
 			var top =  parseInt($(this).offset().top)-10;
 			var obj=$(this); 
  			$(this).append('<div id="zhan"><b>+1<\/b></\div>'); 
			$('#zhan').css({'position':'absolute','z-index':'1', 'color':'#C30','left':left+'px','top':top+'px'})
				.animate({top:top-10,left:left+10},'slow',function(){ 
  					$(this).fadeIn('fast').remove(); 
   					var Num = parseInt(obj.find('span').text()); 
       				Num++; 
    				obj.find('span').text(Num);
    				window.location.href="<%=path %>/student/courseAction_updateHeat.action?num="+Num;
  				}); 
  			return false; 
 		}); 
    	
    	$("video").bind("ended", function() {
	           var text=confirm("本视频已观看完毕，是否前往测试页面");
					if(text==true){
							if($("#input1").val()==$("#input2").val()){
								alert("本门课程学分已经修满，无需进行考试");
							}else{
								window.location.href="<%=path %>/student/examAction_findExam.action";
							}
						}
					else{
						document.getElementById("vv1").pause();
						}
	        });
    	
    	$('.skillbar').each(function(){
    		$(this).find('.skillbar-bar').animate({
    			width:$(this).attr('data-percent')
    		},8000);
    	});
    	
 	}); 
 	//--> 
 	
 	function show(){  
			var tab=document.getElementById("tab");  
			var tr=tab.getElementsByTagName("tr");   
			for(var i=0;i<=tr.length;i++){  
			 	if(i%2==0){  
			 		tr[i].style.backgroundColor="#F5FAFE";  
			 		tr[i].onmouseover=function(){this.style.background="#ADFCFC"}; 
			 		tr[i].onmouseout=function(){this.style.background="#F5FAFE"}; 
			 	}else{  
			 		tr[i].style.backgroundColor="#FFFFFF";  
			 		tr[i].onmouseover=function(){this.style.background="#ADFCFC"};  
			 		tr[i].onmouseout=function(){this.style.background="#FFFFFF"};  
			 	}  
			} 
		} 	
		window.onload=show;
		
		
 	
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
									<li><a href="<%=path %>/student/courseAction_findAllCourse.action">课程</a></li>
									<li class="active"><a href="student/courseAction_findMyCourse.action">我的课程</a></li>
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

<!--视频-->
            
            <div class="services" style="padding-bottom:0em">
					<div class="container">
                    	<h3 id="h31" align="left" style="display:inline; float:left;">${res_video[0].resource_name} - <s:property value="course.cname"/></h3>
                        <span style="float:right;">
                        <a class="zhan" href="#"><img src="images/zan.png" width="36" height="47"/>❤<span id="sp1"><s:property value="course.heat"/></span></a>
                        </span>
						<h1>&nbsp;</h1>  
                        <h1>&nbsp;</h1>                     
                         <div class="flowplayer" data-swf="flowplayer.swf" data-ratio="0.4167">
                           <video id="vv1" controls height="600px" width="100%">
                             <source type="video/mp4" src="${res_video[0].url}" />
                           </video>
                         </div>                                    
					</div>                  
		  </div> 
		  
		
          <div class="services">
			  <h3>&nbsp;</h3>
              <div class="container">
			<div id="tabs" class="tabs">
				<nav>
					<ul>
						<li><a href="#section-1" ><span>章节选择</span></a></li>
						<li><a href="#section-2" ><span>相关资源</span></a></li>
						<li><a href="#section-3" ><span>评论</span></a></li>
						<li><a href="#section-4" ><span>课程简介</span></a></li>
						<li><a href="#section-5" ><span>学习情况</span></a></li>
					</ul>
				</nav>
                
				<div class="content">
				<!-- 视频选择-->
					<section id="section-1">
					<s:iterator value="res_video" id="video">
						<div class="mediabox" id="%{#video.rid}" 
							onclick="javascript:document.getElementById('vv1').setAttribute('src', '<s:property value="#video.url"/>');
								document.getElementById('vv1').setAttribute('autoplay', 'autoplay');
								$('#h31').html('<s:property value="#video.resource_name"/> - <s:property value="course.cname"/>')">
							<img src="<s:property value="course.cimg"/>" width="132" height="99" alt="img01"/>
							<h3><s:property value="#video.resource_name"/></h3>
						</div>
					</s:iterator>
					</section>
                   <!-- 文档下载 -->
					<section id="section-2">
						<table width="100%" id="tab" class="table"> 
						<s:iterator value="res_document" id="document">
								<tr> 
								<td><s:property value="#document.resource_name"/></td>
								<td align="right"><a href="<%=path%>/student/download.action?filename=<s:property value="#document.resource_name"/>">下载</a></td>  
								</tr> 
						</s:iterator>
						</table> 
					</section>
                   <!-- 课程评论 -->
					<section id="section-3">
					<s:form action='commentAction_saveComment' namespace="/student">
					<div id="content" style="width: 100%; height: auto;">
						<div class="wrap">
						<div class="comment">
							<div class="head-face">
								<img src="images/user.jpg"/>
								<p><%=ActionContext.getContext().getApplication().get("username") %></p>
							</div>
							
						<div class="content">
							<div class="cont-box">
								<textarea name="comment.content" class="text" placeholder="请输入..."></textarea>
							</div>
							<div class="tools-box">
								<div class="operator-box-btn"><span class="img-icon">▧</span></div>
								<div class="submit-btn"><input type="submit" value="提交评论" /></div>
							</div>
						</div>
					
					 	</div>
						<div id="info-show" style="text-align: left; color:#000;">
							<ul></ul>
						</div>
					</div>
					</div>
			</s:form>
	<script type="text/javascript" src="js/main.js"></script>
	<script type="text/javascript" src="js/sinaFaceAndEffec.js"></script>
	<script type="text/javascript">
		$('.face-icon').SinaEmotion($('.text'));// 绑定表情
	</script>
	<s:iterator value="comments" id="com">
		<script type="text/javascript">
			var html;
			html  = '<li>';
			html += '<div class="head-face">';
			html += '<img src="images/user.jpg" / >';
			html += '</div>';
			html += '<div class="reply-cont">';
			html += '<p class="username"><s:property value="#com.author"/></p>';
			html += '<p class="comment-body" style="color:#000;"><s:property value="#com.content"/></p>';
			html += '<p class="comment-footer"><s:property value="#com.date"/>　回复</p>';
			html += '</div>';
			html += '</li>';
			$('#info-show ul').append(html);
		</script>
	</s:iterator>
					</section>
					
                   <!-- 课程简介 -->
					<section id="section-4">
						<h3><s:property value="course.discription"/></h3>
					</section>
                    <!-- 学习情况-->
					<section id="section-5">
					<div class="skillbar clearfix " data-percent="${stu_credit}">
						<div class="skillbar-title" style="background: #d35400;"><span>总学分</span></div>
						<div class="skillbar-bar" style="background: #e67e22;"></div>
						<div class="skill-bar-percent">${students[0].credit}/100&nbsp;&nbsp;${stu_credit}</div>
					</div>
					<div class="skillbar clearfix " data-percent="${course_credit}">
						<div class="skillbar-title" style="background: #2980b9;"><span>课程学分</span></div>
						<div class="skillbar-bar" style="background: #3498db;"></div>
						<div class="skill-bar-percent">${course_credit_int}/${course.credit}&nbsp;&nbsp;${course_credit}</div>
						<input type="hidden" id="input1" value="${course_credit_int}"/>
						<input type="hidden" id="input2" value="${course.credit}"/>
					</div>
					 <div class="skillbar clearfix " data-percent="${course_score}%">
						<div class="skillbar-title" style="background: #2c3e50;"><span>课程平均分</span></div>
						<div class="skillbar-bar" style="background: #2c3e50;"></div>
						<div class="skill-bar-percent">${course_score}/100&nbsp;&nbsp;${course_score}</div>
					</div> 
					</section>
                    
				</div><!-- /content -->
			</div><!-- /tabs -->
		</div>
        
        <script src="js/cbpFWTabs.js"></script>
		<script>
			new CBPFWTabs( document.getElementById( 'tabs' ) );
		</script>    
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
