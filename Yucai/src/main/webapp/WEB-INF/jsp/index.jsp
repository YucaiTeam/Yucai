<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<head>
	<title>誉材培训</title>
	<%@ include file="include/common.jsp" %>
    <link rel="stylesheet" href="${ctx}/css/index.css"></link>
    <script src="${ctx}/js/ckplayer.js"></script>
</head>

<body>
	<%@ include file="include/header.jsp"%>
	
    <div class="container-fluid">
    	<!-- 轮播图 -->
        <div id="carousel">
            <div id="carouselIndicators" class="carousel slide" data-ride="carousel"> 
                <ol class="carousel-indicators">
                    <li data-target="#carouselIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselIndicators" data-slide-to="2"></li>
                    <li data-target="#carouselIndicators" data-slide-to="3"></li>
                    <li data-target="#carouselIndicators" data-slide-to="4"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img class="d-block w-100" src="${ctx}/img/banner1.jpg" alt="">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="${ctx}/img/banner1.jpg" alt="">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="${ctx}/img/banner1.jpg" alt="">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="${ctx}/img/banner1.jpg" alt="">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="${ctx}/img/banner1.jpg" alt="">
                    </div>
                </div>
            </div>
        </div>
		<!-- 誉材银行优势 -->
        <div id="adv">
        	 <div class="row text-center">
        	 	<p style="font-size: 38px;width:100%;font-weight: 600;padding-top:80px;">誉材银行招考七大优势</p>
        	 </div>
       		 <div class="row adv-imgs">
	            <%-- <img src="${pageContext.request.contextPath}/WebContent/img/adv.jpg" class="img-style img-responsive"> --%>
	            <div class="col-md-3 col-6" >
	            	<img class="img-fluid" src="${ctx}/img/adv1.png">
	            	<div>小班制教学</div>
	            </div>
	            <div class="col-md-3 col-6">
	            	<img class="img-fluid" src="${ctx}/img/adv2.png">
	            	<div>班主任制跟踪服务</div>    
	            </div>
	            <div class="col-md-3 col-6">
	            	<img class="img-fluid" src="${ctx}/img/adv3.png">
	            	<p>强大专业的师资团队</p>  
	            </div>
	            <div class="col-md-3 col-6">
	            	<img class="img-fluid" src="${ctx}/img/adv4.png">
	            	<p>线上线下教学结合</p>  
	            </div>
	            <div class="col-md-3 col-6">
	            	<img class="img-fluid" src="${ctx}/img/adv5.png">
	            	<p>全真题模考</p>  
	            </div>
	            <div class="col-md-3 col-6">
	            	<img class="img-fluid" src="${ctx}/img/adv6.png">
	            	<p>高押题率</p>  
	            </div>
	            <div class="col-md-3 col-6">
	            	<img class="img-fluid" src="${ctx}/img/adv7.png">
	            	<p>协议保过不过退费</p>  
	            </div>
            </div>
        </div>
		<!-- 服务流程图片 -->
        <div id="service">
            <img src="${ctx}/img/service.jpg" class="img-fluid">
        </div>
		<!-- 明星学员相关信息 -->
        <div id="star">
            <div class="title text-center">
                <p style="font-weight: 600;font-size: 38px;margin-bottom: 0px">誉材银行招考明星学员</p>
                <p style="color:#868686;font-size: 24px">万名学员见证</p>
            </div>
            <div class="v-style">
                <!-- <video src="japan.mp4" controls style="width:100%;height:452px"></video> -->
                <div class="video-wrap">
	                <div class="video" style="float:left;width:70%;z-index:0;"></div>
	                <div style="float:right;width:30%">
	                	<ul id="video-list" style="padding:0;height:452px;background-color: black;">
	                		<c:forEach items="${videos}" var="video">
	                			<li onclick="changeVideo('${video.videopath}','${video.photo}')">${video.title}</li>
	                		</c:forEach>
	                	</ul>
	                </div>
	                <div class="clearfix"></div>
                </div>
            </div>
            <div class="display">
                <div class="images">
                	<c:forEach  items="${stars}" var="star" varStatus="status">
	                    <div class="col-lg-3 col-md-6 col-sm-6 col-6 float-left">
	                        <div class="star-img" data-toggle="modal"  data-target="#myModal${status.count}">
	                            <img src="${pageContext.request.contextPath}/${star.starimg}" class="rounded-circle float-left star-img img-fluid" alt="明星学员">
	                        </div>
	                    </div>
	                     <!-- 模态框（Modal） -->
						<div class="modal fade" style="z-index:100" id="myModal${status.count}" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
						    <div class="modal-dialog">
						        <div class="modal-content" style="width: 145%;height: 500px;">
						            <div class="modal-header">
						                <h4 class="modal-title" id="myModalLabel" style="margin: 0 auto">${star.starname}</h4>
						            </div>
						            <div class="modal-body row">
						            	<div class="col-md-5"><img src="${pageContext.request.contextPath}/${star.starbigimg}" class="rounded-circle star-img img-fluid" alt="..."></div>
						            	<div id="description" class="col-md-7">${star.stardescription}</div>
						            </div>
						            <div class="modal-footer">
						                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
						            </div>
						        </div><!-- /.modal-content -->
						    </div><!-- /.modal -->
						</div>
                   </c:forEach>
                    <div class="clearfix"></div>
                </div>
            </div>	
        </div>
    </div>

   	<%@include file="include/footer.jsp" %>

    <script type="text/javascript">
        var videoObject = {
            container: '.video',//“#”代表容器的ID，“.”或“”代表容器的class
            variable: 'player',//该属性必需设置，值等于下面的new chplayer()的对象
            poster: '${ctx}/${videos[0].photo}',//封面图片
            video: '${ctx}/${videos[0].videopath}' //视频地址
        };
        var player = new ckplayer(videoObject);
        
        function changeVideo(video,photo){
        	console.log(video);
        	videoObject = {
                    container: '.video',//“#”代表容器的ID，“.”或“”代表容器的class
                    variable: 'player',//该属性必需设置，值等于下面的new chplayer()的对象
                    poster: '${ctx}/'+photo,//封面图片
                    video: '${ctx}/'+video //视频地址
                };
        	 player = new ckplayer(videoObject);
        }
    </script>


</body>

</html>