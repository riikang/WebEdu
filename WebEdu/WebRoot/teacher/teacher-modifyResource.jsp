<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();

String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String course_name=String.valueOf(ActionContext.getContext().getApplication().get("cname"));

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
	<head>
		<title>add-resource</title>
		<meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap-responsive.min.css" />
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/colorpicker.css" />
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/datepicker.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/uniform.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/select2.css" />		
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/unicorn.main.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/unicorn.grey.css" class="skin-color" />	
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<script src="<%=request.getContextPath()%>/js/jquery-1.11.1.min.js"></script>
	
	</head>
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
                <li class="btn btn-inverse"><a title="" href="<%=path %>/teacher/teacher-login.jsp"><i class="icon icon-share-alt"></i> <span class="text">注销</span></a></li>
            </ul>
        </div>
            
		<div id="sidebar">
			<a href="#" class="visible-phone"><i class="icon icon-th-list"></i> 添加资源</a>
			<ul>
				<li><a href="<%=path %>/teacher/teacher-index.jsp"><i class="icon icon-home"></i> <span>主页</span></a></li>
				<li class="submenu active open">
					<a href="#"><i class="icon icon-tint"></i> <span>资源</span> <span class="label">2</span></a>
					<ul>

						<li class="active"><a href="<%=path %>/student/teacherAction_addAllResources.action">添加资源</a></li>
						<li><a href="<%=path %>/student/teacherAction_findAllResources.action">管理资源</a></li>

					</ul>
				</li>
				<li>
					<a href="<%=path %>/teacher/teacher-comments.jsp"><i class="icon icon-inbox"></i> <span>评论</span></a>
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
				<h1>添加资源</h1>
				<div class="btn-group">
					<a class="btn btn-large tip-bottom" title="Manage Files"><i class="icon-file"></i></a>
					<a class="btn btn-large tip-bottom" title="Manage Users"><i class="icon-user"></i></a>
					<a class="btn btn-large tip-bottom" title="Manage Comments"><i class="icon-comment"></i><span class="label label-important">5</span></a>
					<a class="btn btn-large tip-bottom" title="Manage Orders"><i class="icon-shopping-cart"></i></a>
				</div>
			</div>
			<div id="breadcrumb">
				<a href="teacher-index.jsp" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> 主页</a>
				<a href="#" class="tip-bottom">管理</a>
				<a href="#" class="current">添加资源</a>
			</div>
			<!--<div class="container-fluid">
				<div class="row-fluid">
					<div class="span12">
						<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-align-justify"></i>									
								</span>
								<h5>Text inputs</h5>
							</div>
							<div class="widget-content nopadding">
								<form action="#" method="get" class="form-horizontal" />
									<div class="control-group">
										<label class="control-label">Normal text input</label>
										<div class="controls">
											<input type="text" />
										</div>
									</div>
									<div class="control-group">
										<label class="control-label">Password input</label>
										<div class="controls">
											<input type="password" />
										</div>
									</div>
									<div class="control-group">
										<label class="control-label">Input with description</label>
										<div class="controls">
											<input type="text" />
											<span class="help-block">This is a description</span>
										</div>
									</div>
									<div class="control-group">
										<label class="control-label">Input with placeholder</label>
										<div class="controls">
											<input type="text" placeholder="This is a placeholder..." />
										</div>
									</div>
									<div class="control-group">
										<label class="control-label">Normal textarea</label>
										<div class="controls">
											<textarea></textarea>
										</div>
									</div>
									<div class="form-actions">
										<button type="submit" class="btn btn-primary">Save</button>
									</div>
								</form>
							</div>
						</div>						
					</div>
				</div>-->
				<div class="row-fluid">
					<div class="span12">
						<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-align-justify"></i>									
								</span>
								<h5>修改课程资源</h5>
							</div>
							<div class="widget-content nopadding">
								<form action="<%=path %>/student/teacherAction_modifyResource.action?resource.rid=<s:property value="resource.rid" />" method="post" class="form-horizontal" enctype="multipart/form-data"/>
									<div class="control-group">
										<label class="control-label">资源所属课程</label>
										<div class="controls">
											<select name="resource.course.cname"  id="sel1" style="width:150px;">
											<s:iterator value="courses" id="list">
												<!--<option value="<s:property value="#list.cid" />"  selected="<%="list.get(i)".equals("美洲历史")?"selected":"" %>" ><s:property value="#list.cname"/></option> -->
												 <option value="<s:property value="#list.cname"/>"><s:property value="#list.cname"/></option>
												</s:iterator>
											</select>
											<s:hidden id="hhh1" name="resource.course.cname" value="%{resource.course.cname}"/>
											<script>
													$("#sel1").val($("#hhh1").val());
											</script>
										</div>
									</div>
									<div class="control-group">
										<label class="control-label">资源类型</label>
										<div class="controls">
											<select name="resource.resource_type"   id="r_type">
											    <option value="video">视频</option>	
												<option value="document">文档</option>	
											</select>
										</div>
									</div>
                                    <div class="control-group">
                                        <label class="control-label">资源名称</label>
                                        <div class="controls">
                                            <input type="textfield" name="resource.resource_name" value="<s:property value="resource.resource_name" />" id="resource_name" style="height:30px;" />
                                        </div>
                                    </div>                             
									<div class="control-group">
										<label class="control-label">选择文件</label>
										<div class="controls">
										<s:hidden name="resource.url" value="%{resource.url} "></s:hidden>
											<input type="file" name="upload" value="<s:property value="resource.url" />" style="height:30px;" />
										</div>
									</div>
									 <div class="form-actions">
                                        <input type="submit" value="修改资源" class="btn btn-primary" />${result}
                                    </div>
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
            <script src="<%=request.getContextPath()%>/js/bootstrap-colorpicker.js"></script>
            <script src="<%=request.getContextPath()%>/js/bootstrap-datepicker.js"></script>
            <script src="<%=request.getContextPath()%>/js/jquery.uniform.js"></script>
            <script src="<%=request.getContextPath()%>/js/select2.min.js"></script>
            <script src="<%=request.getContextPath()%>/js/unicorn.js"></script>
            <script src="<%=request.getContextPath()%>/js/unicorn.form_common.js"></script>
	</body>
</html>
