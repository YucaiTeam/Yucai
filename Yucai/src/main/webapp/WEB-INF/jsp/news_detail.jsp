<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新闻详情</title>
<%@ include file="include/common.jsp" %>
<link rel="stylesheet" href="${ctx}/css/RLCommon.css">
<link rel="stylesheet" href="${ctx}/css/article.css">
</head>
<body>
	<%@ include file="include/header.jsp" %>
	<div class="container-fluid">
		<div id="contain" style="min-height: 890px;">
			<!-- 面包屑导航条 -->
			<div class="crumbs">
				<span>您当前位置:</span>&nbsp;&nbsp;
				<a href="index.action">首页</a> &nbsp;&gt;
				<a href="hotspots.action"><span id="region">时政热点</span></a>&nbsp;>
				<span id="bank">新闻详情</span>
			</div>
		    <hr style="padding: 0;margin: 0">
		    <!-- 文章详细内容 -->
			<div class="left">
				<div class="title-info">
					<h2>${newsDetails.newstitle }</h2>
					<div>
						<span class="time">${edittime }</span>
						<span><a href="http://localhost:8080/Yucai/" target="_blank" style="color:#666">银行招聘网 http://localhost:8080/Yucai/</a></span>
						<span class="author">作者 : ${newsDetails.newsauthor }</span>
						<span>来源 : ${newsDetails.newssource }</span>
					</div>
				</div>
				<div class="introuction">【导读】${newsDetails.newsguide }</div>
				<div class="stepWp">
					<div>
						${newsDetails.newscontent }
					</div>
					<div class="editor">(编辑: ${newsDetails.newsauthor })</div>
				</div>
			</div>
			<div class="right">
				<%@include file="rightnav.jsp" %>
			</div>
			<div class="clearfix"></div>
			<!-- 页码条 -->
			<div class="page-wrap">
					<div class="page-num">
						<ul>
							<li>
								<span id="page" style="display:inline-block;float:left">
								
								</span>
								<div class="clearfix"></div>
							</li>
						</ul>
					</div>
			</div>
		</div>
	</div>
	<%@ include file="include/footer.jsp" %>
</body>
</html>