<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <link rel='stylesheet' href='${ctx}/css/header.css'></link>
    <!-- 缩小之后的导航栏 -->
    <div id='min-header'>
        <div id='min-logo'>
            <div class='float-left'><img  src='${ctx}/img/logo1.jpg'></div>
            <div id="right-logo" class='float-right' style='margin-right: 63px;'><img src='${ctx}/img/logo2.jpg'></div>
        </div>
        <div class='clearfix'></div>
        <button id='toggler' class='navbar-light navbar-toggler collapsed' data-toggle='collapse' data-target='#nav-toggle'>
            <span class='navbar-toggler-icon'></span>
        </button>
	</div>
	<div id="right-menu" class="right-menu">
			<div id="min">></div>
			<div><a href="${pageContext.request.contextPath}/index.action">誉材银行招考</a></div>
			<div><a href="#">师资力量</a></div>
			<div><a href="#">招考公告</a></div>
			<div><a href="${pageContext.request.contextPath}/hotspots.action">时政热点</a></div>
			<div><a href="${pageContext.request.contextPath}/showcourse.action">精品课程</a></div>
			<div><a href="${pageContext.request.contextPath}/practice.action">每日一练</a></div>
			<div><a href="#">网申指导</a></div>
			<div><a href="#">在线报名</a></div>
	</div>
    <div id='header'>
        <img id='logo' src='${pageContext.request.contextPath}/WebContent/img/logo.jpg' class='img-fluid'>
        <nav id='navbar' class='navbar navbar-expand-lg navbar-light'>
            <div class='collapse navbar-collapse'>
                <ul class='navbar-nav mx-auto'>
                 	<a class='nav-link' href="${pageContext.request.contextPath}/index.action">
	                    <li class='nav-item'>
	                     	  誉材银行招考
	                    </li>
                    </a>
                    <a class='nav-link'>
	                    <li class='nav-item'>
                        	师资力量
                    	</li>
                    </a>
                    <a class='nav-link'>
	                    <li class='nav-item'>
                                招考公告
                    	</li>
                    </a>
                    <a class='nav-link' href="${pageContext.request.contextPath}/hotspots.action">
	                    <li class='nav-item'>
	                     	   时政热点
	                    </li>
                    </a>
                    <a class='nav-link' href="${pageContext.request.contextPath}/showcourse.action">
	                    <li class='nav-item'>
	                      	  精品课程
	                    </li>
                    </a>
                    <a class='nav-link' href="${pageContext.request.contextPath}/practice.action">
	                    <li class='nav-item'>
	                           每日一练
	                    </li>
                    </a>
                    <a class='nav-link'>
                    	<li class='nav-item'>
                        	网申指导
                    	</li>
                    </a>
                     <a class='nav-link'>
	                   	 <li class='nav-item'>
	                     	  在线报名
	                    </li>
                    </a>
                </ul>
            </div>
        </nav>
        
        <!-- 遮罩层 -->
        <div class="mask">
        	 
        </div>
    </div>
    <script>
    	var flag = 0;
    	/* 当屏幕尺寸改变收回移动菜单栏 */
     	$(window).resize(function() {
    		var width = $(this).width();
    		if(width > 1010){
    			$(".mask").css("display","none");
    			if(flag == 1){
        			$(".right-menu").css("animation","out 0.6s");
    			}
        		$(".mask").css("display","none");
    		}
    	})
		/* 点击显示移动端右侧菜单栏，添加遮罩层 */
    	$("#toggler").click(function(){
    		flag = 1;
    		$(".mask").css("display","block");
    		$(".right-menu").css("animation","in 0.6s");
    		$(".right-menu").css("animation-fill-mode","forwards");
    		$(".right-menu").css({"z-index":"3","opacity":"1"});
    	})
    	/* 取消遮罩层,移除菜单栏 */
    	$("#min,.mask").click(function(){
    		$(".right-menu").css("animation","out 0.6s");
    		$(".mask").css("display","none");
    	}) 
    </script>