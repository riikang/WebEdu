<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
	<head>
		<title>reset-password</title>
		<meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap-responsive.min.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/unicorn.main.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/unicorn.grey.css" class="skin-color" />	
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>
	<body>
		
		
		<div id="header">
			<h1><a href="./dashboard.html">Unicorn Admin</a></h1>		
		</div>
		
		<div id="search">
			<input type="text" placeholder="Search here..." /><button type="submit" class="tip-right" title="Search"><i class="icon-search icon-white"></i></button>
		</div>
		<div id="user-nav" class="navbar navbar-inverse">
            <ul class="nav btn-group">
                <li class="btn btn-inverse"><a title="" href="#"><i class="icon icon-user"></i> <span class="text">用户</span></a></li>
                <li class="btn btn-inverse dropdown" id="menu-messages"><a href="#" data-toggle="dropdown" data-target="#menu-messages" class="dropdown-toggle"><i class="icon icon-envelope"></i> <span class="text">信息</span> <span class="label label-important">5</span> <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a class="sAdd" title="" href="#">新信息</a></li>
                        <li><a class="sInbox" title="" href="#">收件箱</a></li>
                        <li><a class="sOutbox" title="" href="#">发送</a></li>
                        <li><a class="sTrash" title="" href="#">垃圾箱</a></li>
                    </ul>
                </li>
                <li class="btn btn-inverse"><a title="" href="#"><i class="icon icon-cog"></i> <span class="text">设置</span></a></li>
                <li class="btn btn-inverse"><a title="" href="<%=path %>/manager/admin-login.jsp"><i class="icon icon-share-alt"></i> <span class="text">注销</span></a></li>
            </ul>
        </div>
            
		<div id="sidebar">
			<a href="#" class="visible-phone"><i class="icon icon-th-list"></i> 修改密码</a>
			<ul>
				<li><a href="<%=path %>/manager/admin-index.jsp"><i class="icon icon-home"></i> <span>主页</span></a></li>
				<li class="submenu">
					<a href="#"><i class="icon icon-th-list"></i> <span>课程</span> <span class="label">2</span></a>
					<ul>
                    	<li><a href="<%=path %>/student/managerAction_addCourseFindAllTeachers.action">添加课程</a></li>
                    	<li><a href="<%=path %>/student/courseAction_findAllCourses.action">管理课程</a></li>
					</ul>
				</li>
				<!-- <li class="submenu">
					<a href="#"><i class="icon icon-tint"></i> <span>资源</span><span class="label">1</span></a>
					<ul>
						<li><a href="admin-addResource.jsp">添加资源</a></li>
						<li><a href="<%=path %>/student/managerAction_findAllResources.action">管理资源</a></li>
					</ul>
				</li> -->
				<li class="submenu active open">
					<a href="#"><i class="icon icon-pencil"></i> <span>用户</span><span class="label">3</span></a>
					<ul>
						<li class="active"><a href="<%=path %>/manager/admin-resetPassword.jsp">修改密码</a></li>
						<li><a href="<%=path %>/student/managerAction_findAllTeachers.action"> <span>教师管理</span></a></li>
						<li><a href="<%=path %>/student/managerAction_findAllStudents.action"> <span>学生管理</span></a></li>
					</ul>
				</li>
				<li>
					<a href="<%=path %>/manager/admin-charts.jsp"><i class="icon icon-signal"></i> <span>图表</span></a>
				</li>
				<li>
					<a href="<%=path %>/manager/admin-comments.jsp"><i class="icon icon-inbox"></i> <span>评论</span></a>
				</li>
			</ul>
		
		</div>
		
		<div id="style-switcher">
			<i class="icon-arrow-left icon-white"></i>
			<span>Style:</span>
			<a href="#grey" style="background-color: #555555;border-color: #aaaaaa;"></a>
			<a href="#blue" style="background-color: #2D2F57;"></a>
			<a href="#red" style="background-color: #673232;"></a>
		</div>
		
		<div id="content">
			<div id="content-header">
				<h1>修改密码</h1>
				<div class="btn-group">
					<a class="btn btn-large tip-bottom" title="Manage Files"><i class="icon-file"></i></a>
					<a class="btn btn-large tip-bottom" title="Manage Users"><i class="icon-user"></i></a>
					<a class="btn btn-large tip-bottom" title="Manage Comments"><i class="icon-comment"></i><span class="label label-important">5</span></a>
					<a class="btn btn-large tip-bottom" title="Manage Orders"><i class="icon-shopping-cart"></i></a>
				</div>
			</div>
			<div id="breadcrumb">
				<a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> 主页</a>
				<a href="#">管理</a>
				<a href="#" class="current">修改密码</a>
			</div>
			<div class="container-fluid">
				<div class="row-fluid">
					<div class="span12">
						<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-pencil"></i>
								</span>
								<h5>修改用户密码</h5>
							</div>
							<div class="widget-content nopadding">
								<form id="form-wizard" class="form-horizontal" method="post" action="<%=path %>/student/managerAction_resetPassword.action" />
									<div id="form-wizard-1" class="step">
										<div class="control-group">
											<label class="control-label">原密码</label>
											<div class="controls">
												<input id="username" type="password" name="manager.password" />
											</div>
										</div>
										
										<div class="control-group">
											<label class="control-label">新密码</label>
											<div class="controls">
												<input id="password" type="password" name="password1" />
											</div>
										</div>
										<div class="control-group">
											<label class="control-label">确认新密码</label>
											<div class="controls">
												<input id="password2" type="password" name="password2" />
											</div>
										</div>
										
									</div>
									<!--<div id="form-wizard-2" class="step">
										<div class="control-group">
											<label class="control-label">Email</label>
											<div class="controls">
												<input id="email" type="text" name="email" />
											</div>
										</div>
										<div class="control-group">
											<label class="control-label">EULA Acceptation</label>
											<div class="controls">
												<input id="eula" type="checkbox" name="eula" />
											</div>
										</div>
									</div>-->
									<div class="form-actions">
											<!--<input id="back" class="btn btn-primary" type="reset" value="Back" />-->
											<input id="next" class="btn btn-primary" type="submit" value="确认" />
											<div id="status"></div>
									</div>
									<div id="submitted"></div>
								</form>
							</div>
						</div>
					</div>
				</div>
				
			</div>
		</div>
		
		
            
            <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
            <script src="<%=request.getContextPath()%>/js/jquery.ui.custom.js"></script>
            <script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
            <script src="<%=request.getContextPath()%>/js/jquery.validate.js"></script>
            <script src="<%=request.getContextPath()%>/js/jquery.wizard.js"></script>
            <script src="<%=request.getContextPath()%>/js/unicorn.js"></script>
            <script src="<%=request.getContextPath()%>/js/unicorn.wizard.js"></script>
	</body>
</html>
