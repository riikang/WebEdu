<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 5.0 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>联系方式   - DF - 在线学习网站</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
	<link href="css/map.css" rel="stylesheet" type="text/css" media="all" />
	<link rel="stylesheet" href="css/lightbox.css">
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	<script src="js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="http://lib.sinaapp.com/js/jquery/1.7.2/jquery.min.js"></script>
 	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=etq6kt2hutaHGRjHXtKBU66y"></script>
 	<script type="text/javascript" src="http://developer.baidu.com/map/jsdemo/demo/convertor.js"></script>
 	<script src="js/logo.js"></script>
	<link href='http://fonts.useso.com/css?family=Yanone+Kaffeesatz:400,200,300,700' rel='stylesheet' type='text/css'>
	<link href='http://fonts.useso.com/css?family=Open+Sans:400,800italic,800,700italic,700,600italic,600,400italic,300italic,300' rel='stylesheet' type='text/css'>
	<script src="js/bootstrap.js"></script>
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
									<li><a href="student/courseAction_findMyCourse.action">我的课程</a></li>
									<li class="dropdown">
										<a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">用户 <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="login.jsp"><%=ActionContext.getContext().getApplication().get("username") %></a></li>
									<li><a href="student/userAction_logOut.action">注销</a></li>
								</ul>
									</li>					
									<li class="active"><a href="contact.jsp">联系方式</a></li>
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

<div class="content">
					<div class="contact">
						<div class="container">
							<h2>联系方式</h2>                      
<!-- 地图-->
					<div class="google-map">	                       			
                        <div id="allmap"></div>
<script type="text/javascript">
 $(function(){
     if(!supportsGeoLocation()){
         alert("不支持 GeoLocation.");
    }
               function supportsGeoLocation(){
                return !!navigator.geolocation;
              }  
               function getLocation(){
                  navigator.geolocation.getCurrentPosition(mapIt,locationError);
               }
              function mapIt(position){ 
                var lon = position.coords.longitude;
                var lat = position.coords.latitude;
                var map = new BMap.Map("allmap");
                var point = new BMap.Point(""+lon+"",""+lat+"");
                map.centerAndZoom(point,19);
                var gc = new BMap.Geocoder();
                      translateCallback = function (point){
                          var marker = new BMap.Marker(point);
                          map.addOverlay(marker);
                          map.setCenter(point);
                          gc.getLocation(point, function(rs){
                                var addComp = rs.addressComponents;
                                if(addComp.province!==addComp.city){
                                  var sContent =
                                  "<div><h4 style='margin:0 0 5px 0;padding:0.2em 0'>hi！我们在这(•̀ᴗ•́)و ̑̑↓</h4>" + 
                                  "<p style='margin:0;line-height:1.5;font-size:13px;text-indent:2em'>"+addComp.province + ", " + addComp.city + ", " + addComp.district + ", " + addComp.street + ", " + addComp.streetNumber+"</p>" + 
                                  "</div>";}
                                else{
                                  var sContent =
                                  "<div><h4 style='margin:0 0 5px 0;padding:0.2em 0'>你当前的位置是：</h4>" + 
                                  "<p style='margin:0;line-height:1.5;font-size:13px;text-indent:2em'>"+ addComp.city + ", " + addComp.district + ", " + addComp.street + ", " + addComp.streetNumber+"</p>" + 
                                  "</div>";
                                }
                                var infoWindow = new BMap.InfoWindow(sContent);
                                map.openInfoWindow(infoWindow,point);
                          }); 
                      }                    
                  BMap.Convertor.translate(point,0,translateCallback); 
            }
  
               function locationError(error)
              {
              switch(error.code)
                {
                case error.PERMISSION_DENIED:
                  alert("User denied the request for Geolocation.");
                  break;
                case error.POSITION_UNAVAILABLE:
                   alert("Location information is unavailable.");
                  break;
                case error.TIMEOUT:
                   alert("The request to get user location timed out.");
                  break;
                case error.UNKNOWN_ERROR:
                   alert("An unknown error occurred.");
                  break;
                }
              }

  		window.onload = getLocation;  
        })
</script>                            
	</div>
     <!-- 地图end-->
     
     <div class="contact-info" >
								<div class="col-md-4 contact-grid">
									<h4>联系人 1</h4>
									<p>姓名 ：</p>
									<p>手机号码 ：</p>
									<p>QQ号 ：</p>
									<p>邮箱地址 ： <a href="mailto:info@example.com"> QQ@example.com</a></p>																										
								</div>
								<div class="col-md-4 contact-grid">
									<h4>联系人 2</h4>
									<p>姓名 ：</p>
									<p>手机号码 ：</p>
									<p>QQ号 ：</p>
									<p>邮箱地址 ： <a href="mailto:info@example.com"> QQ@example.com</a></p>																										
								</div>
								<div class="col-md-4 contact-grid">
									<h4>联系人 3</h4>
									<p>姓名 ：</p>
									<p>手机号码 ：</p>
									<p>QQ号 ：</p>
									<p>邮箱地址 ： <a href="mailto:info@example.com"> QQ@example.com</a></p>																									
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="contact-form">
								<h4>联系我们</h4>
								<form>
									<input type="text" value="姓名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '姓名';}" required>
									<input class="email" type="text" value="邮箱" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '邮箱';}" required>
									<input type="text" value="联系方式" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '联系方式';}" required>
									<textarea type="text"  onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '您想说的话...';}" required>您想说的话...</textarea>
									<input type="submit" value="提交" >
								</form>
							</div>
						</div>
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
