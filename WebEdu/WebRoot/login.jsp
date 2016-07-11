<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>用户登陆 - DF - 在线学习网站</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
	<link href='http://fonts.useso.com/css?family=Yanone+Kaffeesatz:400,200,300,700' rel='stylesheet' type='text/css'>
	<link href='http://fonts.useso.com/css?family=Open+Sans:400,800italic,800,700italic,700,600italic,600,400italic,300italic,300' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="css/jq22.css">
	<script src="js/bootstrap.js"></script>
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/logo.js"></script>
	<style type="text/css">
	.unchanged {
		border: 0; 
		font-family: Arial;
		font-style: italic;
		color: Red;
		border: 0;
		padding: 2px 3px;
		letter-spacing: 3px;
		font-weight: bolder;  
	}
	</style>
	
	<script language="javascript">

 function createCode(len)  
 {  
				var seed = new Array(  
                    'abcdefghijklmnopqrstuvwxyz',  
                    'ABCDEFGHIJKLMNOPQRSTUVWXYZ',  
                    '0123456789'  
            );               //创建需要的数据数组  
            var idx,i;  
            var result = '';   //返回的结果变量  
            for (i=0; i<len; i++) //根据指定的长度  
            {  
                idx = Math.floor(Math.random()*3); //获得随机数据的整数部分-获取一个随机整数  
                result += seed[idx].substr(Math.floor(Math.random()*(seed[idx].length)), 1);//根据随机数获取数据中一个值  
            }  
            document.getElementById("checkk").value=result;  
        }  

</script>
	
  </head>
  
  <body onload="createCode(6)">
    <!--header-->
			<div class="header banr">
				<div class="container">
					<div class="header-top">
						<nav class="navbar navbar-default">
							<div class="container-fluid">
								<div class="navbar-header">
									<div class="navbar-brand">
										<h1><a href="index.jsp"><canvas id="canvas" width="380" height="40">Sorry, canvas not supported</canvas></a></h1>
									</div>
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

<!--登陆框-->
<div class="services">																
  <div id="login"  style="background:#FFF; margin-bottom:300px;">
    <div class="wrapper">
        <div class="login">
            <s:form action="userAction_loginCheck" namespace="/student" autocomplete="on" class="container offset1 loginform">
                <div id="owl-login">
                    <div class="hand"></div>
                    <div class="hand hand-r"></div>
                    <div class="arms">
                        <div class="arm"></div>
                        <div class="arm arm-r"></div>
                    </div>
                </div>
                <div class="pad">
                    <div class="control-group">
                        <div class="controls">
                        	${errors["stu.username"][0]}
                            <label for="email" class="control-label fa fa-envelope"></label>
                            <input id="email" type="text" name="stu.username" placeholder="用户名/邮箱地址" tabindex="1" autofocus class="form-control input-medium">
                        </div>
                    </div>
                    <div class="control-group">
                        <div class="controls">
                            <label for="password" class="control-label fa fa-asterisk"></label>
                            <input id="password" type="password" name="stu.password" placeholder="请输入密码" tabindex="2" class="form-control input-medium">
                        	${errors["stu.password"][0]}
                        </div>
                    </div>
                    <div class="control-group">
                    	<div class="controls">
                    		<input class="form-control input-medium" name="inputCode" type="text" id="input1"/>
                    		${errors["inputCode"][0]} 
                		</div>
                	</div>
                	<div class="control-group">
                		<input type="text" onclick="createCode(6)" name="createCode" readonly="readonly" id="checkk" class="unchanged" style="width: 120px; background-color:#0F0"/>
                		<a onclick="createCode(6)">看不清楚</a>
                	</div>
                </div>
                <div class="form-actions">
                	<a href="" tabindex="5" class="btn pull-left btn-link text-muted">忘记密码?</a>
                    <button type="submit" tabindex="4" class="btn btn-primary">登陆</button>
                </div>
            </s:form>
        </div>
    </div>
    <script>
    $(function() {
        $('#login #password').focus(function() {
            $('#owl-login').addClass('password');
        }).blur(function() {
            $('#owl-login').removeClass('password');
        });
    });
    </script>
 </div>
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
