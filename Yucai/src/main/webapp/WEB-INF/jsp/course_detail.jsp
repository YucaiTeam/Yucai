<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>课程详细</title>
<%@ include file="include/common.jsp" %>
<link rel="stylesheet" href="${ctx}/css/courseDetail.css"></link>
<link rel="stylesheet" href="${ctx}/css/RLCommon.css">
</head>
<body>
	<%@ include file="include/header.jsp"%>
	<div class="container-fluid">	
		<div class="crumbs">
				<span>您当前位置:</span>&nbsp;&nbsp;
				<a href="${pageContext.request.contextPath}/index.action">首页</a> &nbsp;>
				<a href="${pageContext.request.contextPath}/showcourse.action">精品课程</a>&nbsp;>
				<a href="#">${course.coursesort}</a>
		</div>
		<!-- 誉材辅导优势 -->
		<div class="advantage">
			
		</div>
		<!-- 课程内容详情 -->
		<div class="detail" id="detail">
			<div class="row">
				<div class="col-md-12">
					<h3>${course.coursesort}</h3>
				</div>
			</div>
			<div class="row">
				<div class="col-md-6 ">
					<p align="left">课程内容:${details[0].detailcontent}</p>
				</div>
				<div class="col-md-6 ">
					<p align="left">课程价格:${details[0].detailprice}</p>
				</div>
				<div class="col-md-6 ">
					<p align="left">适用人群:${details[0].detailpeople}</p>
				</div>
				<div class="col-md-6 ">
					<p align="left">达到效果:${details[0].detaileffect}</p>
				</div>
			</div>
		</div>
		<!-- 服务流程 -->
		<div class="process">
		</div>
	</div>
	<%@ include file="include/footer.jsp"%>
</body>
</html>