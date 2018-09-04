<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>誉材银行 精品课程</title>
    <%@ include file="include/common.jsp" %>
    <link rel="stylesheet" href="${ctx}/css/table.css"></link>
</head>
	<script>
		/* $(document).ready(function(){
			 $.ajax({ 
			     type : "POST", //提交方式 
			     url : "http://localhost:8080/Yucai/getcs.action",//路径 
			     success : function(result) {//返回数据根据结果进行相应的处理 
			    	 console.log(result[0].seriesname);
			      	for(var i = 0;i < result.length;i++){
			      		$("#table").append("<tr class='title'><td colspan='4'>"+result[i].seriesname+"</td></tr>");
			      		$("#table").append("<tr class='desc'><td>班级名称</td><td>课程内容</td><td>课时</td><td>价格描述</td></tr>")
			      		for(var j = 0;j < result[i].tCourse.length;j++){
			      			$("#table").append("<tr><td>"+result[i].tCourse[j].coursesort+"</td><td>"+result[i].tCourse[j].coursedetail+"</td><td>"+result[i].tCourse[j].coursehour+"</td><td>"+result[i].tCourse[j].courseprice+"</td></tr>")
			      		} 
			      	}     	
			     } 
			    }); 
		}); */
	</script>
<body>
	<%@ include file="include/header.jsp" %>
   <%--  <%@ include file="include/header.jsp" %> --%>
   	<div class="container-fluid">
		<!-- 面包屑导航条 -->
	   	<div class="crumbs">
				<span>您当前位置:</span>&nbsp;&nbsp;
				<a href="index.action">首页</a> &nbsp;>
				<a href="#"><span id="region">精品课程</span></a>&nbsp;
				<span id="bank"></span>
		</div>
		<!-- 课程详情表格 -->
		<hr style="margin: 0px;padding: 0px;">
	     <div style="min-height: 918px; width: 80%" class="container">
		    <table id="table" class="table table-striped table-bordered table-hover " >
		    	<c:forEach items="${courseAndSeries }" var="series" >
		    		<tr class="table-primary">
		    			<td colspan="4">${series.seriesname }</td>
		    		</tr>
		    		<tr class="table-success">
		    			<td>班级名称</td><td>课程内容</td><td>课时</td><td>价格描述</td>
		    		</tr>
		    		<c:forEach items="${series.tCourse }" var="course" >
		    			<tr class="detail" style="cursor: pointer">
		    				<td><input type="hidden" value="${course.courseid }" name="courseid"/>${course.coursesort }</td>
		    				<td>${course.coursedetail }</td>
		    				<td>${course.coursehour }</td>
		    				<td>${course.courseprice }</td>
		    			</tr>
		    		</c:forEach>
		    	</c:forEach>
		    </table>
	    </div>
    </div>
	<script type="text/javascript">
		$(".detail").click(function () {
			var courseid = $(this).find("input").val();
			//alert(courseid);
			window.location.href = "${pageContext.request.contextPath}/details/getdetail.action?courseid="+courseid;	
		});
		
	</script>
	<%@ include file="include/footer.jsp" %>
</body>
</html>