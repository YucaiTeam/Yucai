<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>每日一练</title>
<%@ include file="include/common.jsp" %>
<link rel="stylesheet" href="${ctx}/css/RLCommon.css">
</head>
<body>
	<%@ include file="include/header.jsp" %>
	<div class="container-fluid">
		<div id="contain" style="min-height: 890px;">
			<div class="crumbs">
				<span>您当前位置:</span>&nbsp;&nbsp;
				<a href="index.action">首页</a> &nbsp;>
				<a href="#"><span id="region">全部</span>地区时政热点</a>&nbsp;>
				<span id="bank"></span>
			</div>
		    <hr style="padding: 0;margin: 0">
			<div class="left">
				<div class="area-box" >
					<span class="sm-tips">全部招聘</span>
					<ul>
						<li value="0">全部</li>
						<c:forEach items="${arealist }" var="area">
							<li value="${area.areano }">${area.areaname }</li>
						</c:forEach>
					</ul>
					<div class="clearfix"></div>
				</div>
				<div class="position-box">
					<span class="sm-tips">全部招聘</span>
					<ul>
						<li value="0">全部</li>
						<c:forEach items="${banklist }" var="bank">
							<li value="${bank.bankno }">${bank.bankname }</li>
						</c:forEach>
					</ul>			
					<div class="clearfix"></div>
				</div>
				<div class="message-box">
					<div style="border-bottom: 1px solid #ddd">
						<div class="hover">时政热点</div>
						<div class="clearfix"></div>
					</div>
					<div id="tabContent">
						<div class="listContent">
							<div class="listleft">
								<div class="left-time">
									<p class="date">13</p>
									<p class="year">2018-08</p>
								</div>
							</div>
							<div class="right-message">
								<a href="#">
									<h2>国有大型银行“涅槃重生”(2)</h2>
									<p>史上首次！中国四大行全面登顶全球1000家大银行榜单，国有大型银行“涅槃重生” 了，银行招聘网带你来解读一下这些银行的改革历程。</p>
								</a>
								<a href="#" id="hotspot">
								<span class="allspots">全部时政热点</span></a>
							</div>
							<div class="clearfix"></div>
						</div>
					</div>
				</div>
			</div>
			<div class="right">
				<%@include file="rightnav.jsp" %>
			</div>
			<div class="clearfix"></div>
			<div class="page-wrap">
					<div class="page-num">
						<ul>
							<span id="page" style="display:inline-block;float:left">
							
							</span>
							<div class="clearfix"></div>
						</ul>
					</div>
			</div>
		</div>
	</div>
	<script>
		$(document).ready(function() {
			var areano = 0;
			var bankno = 0;
			var result;

			/* 请求地区，银行信息 */
			/* $.ajax({ 
			     type : "POST", //提交方式 
			     url : "http://localhost:8080/Yucai/getab.action",//路径 
			     success : function(results) {//返回数据根据结果进行相应的处理 
			    	 result = results;
			    	 $(".area-box ul").append("<li>全部</li>");
			    	 $(".position-box ul").append("<li>全部</li>");
			    	 for(var i = 0; i<result.length;i++){ 
				    	 $(".area-box ul").append("<li value="+result[i].areano+">"+result[i].areaname+"</li>");
			    		 for(var j = 0; j<result[i].tBank.length; j++){
			    			 $(".position-box ul").append("<li value="+result[i].tBank[j].bankno+">"+result[i].tBank[j].bankname+"</li>");
			    		 }
			    	 }	
			     } 
			    }); */
			
			/* 获取所有数据 */
			getnewssimple();
			
			/* 点击获取地区具体信息  */
			$("body").on("click",".area-box li",function(){
					$(".area-box li").removeClass("back");
					$(this).addClass("back");
					
					areano = $(this).val();
					if(areano != 0){
						getnewssimple(0,areano);
						clearAB();
						getbank(areano);
						pageList();
					}
				});
			
			 /* 分页显示数据方法 */
			 $("body").on("click","#page li",function(){
				 var pageno = $(this).val();
				 var startid = (pageno-1)*10;
				 if(areano == 0){
					 areano = null;
				 }
				 if(bankno == 0){
					 bankno = null;
				 }
				 getnewssimple(startid,areano,bankno);
			 }) 

			/* 点击获取某个地区银行具体信息 */
			$("body").on("click",".position-box li",function(){
				bankno = $(this).val();
				if(bankno != 0){
					 if(areano != 0) {
						 getnewssimple(0,areano,bankno);
					 }else{
						 getnewssimple(0,null,bankno);
					 }
					
					$(".position-box li").removeClass("back2");
					$(this).addClass("back2");
				}else{
					if(areano != 0){
						getnewssimple(0,areano);	
					}
					else{
						getnewssimple(0);	
					}
	 				
					$(".position-box li").removeClass("back2");
					$(".position-box li:first-child").addClass("back2");
					
					pageList();
				}
			});
			 
			/* 改变面包屑导航条信息 */
			$("body").on("click",".area-box li",function(){
				var region = $(this).text();
				$("#region").text(region);
			});
			
			$("body").on("click",".position-box li",function(){
				$("#bank").text("");
				var region = $(this).text();
				if(region != "全部"){
					$("#bank").text(region);
				}else{
					$("#bank").text("");
				}
			});
			
			/* 鼠标悬浮某条新闻上 样式改变 */
			
			$("body").on("mouseleave",".listContent",function(){
				$(this).find(".date").css("color","#8a8988");
				$(this).find(".year").removeClass("date-hover");
			});
			$("body").on("mouseenter",".listContent",function(){
				$(this).find(".date").css("color","#ff8400");
				$(this).find(".year").addClass("date-hover");
			});
			
/* 			$("body").on("mouseenter",".position-box li",function(){
				$(this).addClass("back2");
			}); */
			/* 鼠标悬浮 页码样式改变 */	
			$("body").on("mouseenter",".page-num li",function(){
				$(this).css("color","white")
			});
			$("body").on("mouseleave",".page-num li",function(){
				$(this).css("color","");
			});
		});
		
		/* 请求内容相关信息 */
		function reqContent(result){
	    	$("#tabContent").empty();
	     	for(var i = 0; i < result.news.length; i++){
	     		$("#tabContent").append(
					"<div class='listContent'>"+
						"<div class='listleft'>"+
							"<div class='left-time'>"+
								"<p class='date'>"+formatD(result.news[i].editdate)+"</p>"+
								"<p class='year'>"+formatYM(result.news[i].editdate)+"</p>"+
							"</div>"+
						"</div>"+
						"<div class='right-message'>"+
								"<a href='showdetails.action?id="+result.news[i].newsid+"'>"+
									"<h2>"+result.news[i].newstitle+"</h2>"+
									"<p>"+result.news[i].newsguide+"</p>"+
								"</a>"+
								"<a href='#' id='hotspot'>"+
								"<span class='allspots'>全部时政热点</span></a>"+
						"</div>"+
						"<div class='clearfix'></div>"+
					"</div>");
	     	}
			
	     	pageList();
		}
		
		/*获取银行相关信息*/
		function getbank(areano){
			$.ajax({
				async: false,
				type: "POST",
				url: url+"Yucai/getbank.action",
				data: {areano: areano},
				dataType: "json",
				success: function(results){
					for(var i = 0; i<results.length; i++){
		    			 $(".position-box ul").append("<li value="+results[i].bankno+">"+results[i].bankname+"</li>");
		    		 }
				}
			});
		}
		
		function getnewssimple(startid,areano,bankno){
			 $.ajax({ 
					async:false,
				     type : "POST", //提交方式 
				     url : url+"Yucai/getnewssimple.action",//路径 
				     data : {startid: startid, areano: areano, bankno: bankno},
				     success : function(results) {//返回数据根据结果进行相应的处理 
				    	 result = results;
				     	 console.log(result);
				    	 reqContent(results);
				    	}
		     });
		}
		
		function pageList(){
			$('html,body').animate({scrollTop: '0px'}, 0);
			if(result.total <= 10){
				$(".page-num").hide();
			}else{
			 	$(".page-num").show(); 
			 	$('#page').empty();
		     	var count = 1
				if( result.total%10 != 0){
					count = Math.ceil(result.total/10);
				}else{
					count = result.total/10;
				}
		     	$('#page').append("<li value='1'>首页</li>")
				for(var i= 1 ;i <= count; i++){
		     		$('#page').append("<li value='"+i+"'>"+i+"</li>");
		     		if(i == count){
		     			$('#page').append("<li value='"+count+"'>尾页</li>")
		     		}
		     	}
			}
		}
		
		function clearAB(){
			$(".position-box ul").empty();
			$(".position-box ul").append("<li>全部</li>");
		}
		
		/* 日期格式化 */
		function add0(m){return m<10?'0'+m:m }
		function formatD(date)
		{
			var time = new Date(date);
			var y = time.getFullYear();
			var m = time.getMonth()+1;
			var d = time.getDate();
			var h = time.getHours();
			var mm = time.getMinutes();
			var s = time.getSeconds();
			return add0(d);
		}
		
		function formatYM(date)
		{
			var time = new Date(date);
			var y = time.getFullYear();
			var m = time.getMonth()+1;
			return y+'-'+add0(m);
		}
	</script>
	<%@ include file="include/footer.jsp" %>
</body>
</html>