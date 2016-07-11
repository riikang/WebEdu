<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
	<head>
		<title>tables</title>
		<s:iterator value="resources" id="rlist">
         <script type="text/javascript">
	function clickme(){
	  if(confirm("确认删除？")==true){
	  
		window.location.href="<%=path %>/student/teacherAction_deleteResource.action?resource.rid=<s:property value="#rlist.rid"/>";
		
	  }else{
	  	window.location.href="<%=path %>/student/teacherAction_findAllResources.action";
	  }
	}
	</script>
	</s:iterator>
		<meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap-responsive.min.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/uniform.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/select2.css" />		
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/unicorn.main.css" />
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/unicorn.grey.css" class="skin-color" />	
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
   
    
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
			<a href="#" class="visible-phone"><i class="icon icon-th-list"></i> 资源</a>
			<ul>
				<li><a href="<%=path %>/teacher/teacher-index.jsp"><i class="icon icon-home"></i> <span>主页</span></a></li>
				<li class="submenu active open">
					<a href="#"><i class="icon icon-th-list"></i> <span>资源</span> <span class="label">3</span></a>
					<ul>
						<li><a href="<%=path %>/student/teacherAction_addAllResources.action">添加资源</a></li>
						<li class="active"><a href="<%=path %>/student/teacherAction_findAllResources.action">管理资源</a></li>
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
				<h1>Tables</h1>
				<div class="btn-group">
					<a class="btn btn-large tip-bottom" title="Manage Files"><i class="icon-file"></i></a>
					<a class="btn btn-large tip-bottom" title="Manage Users"><i class="icon-user"></i></a>
					<a class="btn btn-large tip-bottom" title="Manage Comments"><i class="icon-comment"></i><span class="label label-important">5</span></a>
					<a class="btn btn-large tip-bottom" title="Manage Orders"><i class="icon-shopping-cart"></i></a>
				</div>
			</div>
			<div id="breadcrumb">
				<a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> 主页</a>
				<a href="#" class="current">教师管理</a>
			</div>
			<div class="container-fluid">
				<div class="row-fluid">
					<div class="span12">
						
						<div class="widget-box">
							<div class="widget-title">
							
								<h5>所有课程</h5>
							</div>
							<div class="widget-content nopadding">
								<table class="table table-bordered data-table">
									<thead>
									<tr>
									<th>资源名称</th>
									<th>资源所属课程</th>
									<th>资源类型</th>
                                    <th>操作</th>
									</tr>
									</thead>
									<tbody>
									<s:iterator value="resources" id="list">
									<tr class="gradeX">
									<td><s:property value="#list.resource_name"/></td>
									<td><s:property value="#list.course.cname"/></td>
									<td><s:property value="#list.resource_type"/></td>
									
                                    <td>
                                      <center><a href="<%=path %>/student/teacherAction_findResourceById.action?resource.rid=<s:property value="#list.rid"/>" class="tip-top" data-original-title="Update"><img src="../img/Modify.png"></a>
                                      <a href="#" class="tip-top" data-original-title="Delete"><img src="../img/delete.png" onclick="clickme()"></a></center>
                                    </td>
									</tr>
									<s:hidden name="resource.url" value="%{list.url}"></s:hidden>
									</s:iterator>
									</tbody>
									</table>  
							</div>
						</div>
						<br>
						
					</div>
				</div>
				
			</div>
		</div>
		
		
            
            <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
            <script src="<%=request.getContextPath()%>/js/jquery.ui.custom.js"></script>
            <script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
            <script src="<%=request.getContextPath()%>/js/jquery.uniform.js"></script>
            <script src="<%=request.getContextPath()%>/js/select2.min.js"></script>
            <script src="<%=request.getContextPath()%>/js/jquery.dataTables.min.js"></script>
            <script src="<%=request.getContextPath()%>/js/unicorn.js"></script>
            <script src="<%=request.getContextPath()%>/js/unicorn.tables.js"></script>
	</body>
</html>
