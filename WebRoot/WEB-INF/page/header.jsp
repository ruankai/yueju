<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 导入jquery核心类库 -->
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>

<!-- 导入jquery核心类库 -->
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<!-- 导入easyui类库 -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/ext/portal.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/default.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/ext/jquery.portal.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/ext/jquery.cookie.js"></script>
<script
	src="${pageContext.request.contextPath }/js/easyui/locale/easyui-lang-zh_CN.js"
	type="text/javascript"></script>
<!-- 导入ztree类库 -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/js/ztree/zTreeStyle.css"
	type="text/css" />
<script
	src="${pageContext.request.contextPath }/js/ztree/jquery.ztree.all-3.5.js"
	type="text/javascript"></script>

<title>粤剧网</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<meta name="description" content="">

<meta name="author" content="">

<!-- Le styles -->

<link href="css/bootstrap.css" rel="stylesheet">

<link href="css/style.css" rel="stylesheet">

<link href="css/camera.css" rel="stylesheet">

<link href="css/icons.css" rel="stylesheet">

<link rel="stylesheet" id="main-color" href="css/skin-orange.css"
	media="screen" />

<link href="css/bootstrap-responsive.css" rel="stylesheet">

<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->

<!--[if lt IE 9]>

      <script src="js/html5shiv.js"></script>

    <![endif]-->

<!-- Fav and touch icons -->
<!--
<link rel="apple-touch-icon-precomposed" sizes="144x144" href="img/ico/apple-touch-icon-144-precomposed.png">

<link rel="apple-touch-icon-precomposed" sizes="114x114" href="img/ico/apple-touch-icon-114-precomposed.png">

<link rel="apple-touch-icon-precomposed" sizes="72x72" href="img/ico/apple-touch-icon-72-precomposed.png">

<link rel="apple-touch-icon-precomposed" href="img/ico/apple-touch-icon-57-precomposed.png">
-->

<link rel="shortcut icon" href="img/ico/favicon.png">

</head>

<body class="boxed">

	<div class="body">

		<!-- Navigation -->

		<header>

		<div class="container clearfix">

			<div class="row-fluid">

				<div class="span12">

					<h1 class="brandlogo">
						<a href="index.html"><img src="img/logo.png" alt=""> </a>
					</h1>

					<div class="clearfix"></div>
					<c:if test="${sessionScope.loginUser==null}">
						<a href="${pageContext.request.contextPath}/page_regist.action">注册</a>
						<a href="${pageContext.request.contextPath}/page_login.action">登录</a>
					</c:if>
					<c:if test="${sessionScope.loginUser!=null}">${sessionScope.loginUser.trueName}
    	                 <a
							href="${pageContext.request.contextPath}/header_loginout.action">注销</a>
					</c:if>

					<div class="row-nav navbar">

						<div class="navbar-inner">

							<ul id="nav" class="nav">

								<li class="active selected"><a
									href="${pageContext.request.contextPath}//home1_home1.action">首页</a>
								</li>

								<li class="divider-vertical"></li>

							

								<li class="divider-vertical"></li>
								<li><a
									href="${pageContext.request.contextPath}/page_yueju1.action">粤剧</a>
								</li>
								<li><a href="${pageContext.request.contextPath}/page_song1.action">粤曲</a>
								</li>
								<li><a href="${pageContext.request.contextPath}/page_photo1.action">照片</a>
								</li>
								<li><a href="${pageContext.request.contextPath}/mingrenPage_mrt.action" >名人堂</a>
										</li>
								

								<li class="divider-vertical"></li>

								<li class="dropdown"><a href="${pageContext.request.contextPath}/topic_findAll.action" class="dropdown-toggle"
								>论坛  </a>
                                     
									</li>

								<li class="divider-vertical"></li>

								

								<li class="divider-vertical"></li>
                               <li class="dropdown"><a href="${pageContext.request.contextPath}/sihuoju_findAll.action" class="dropdown-toggle"
								>私伙局  </a>
                                     
									</li>

								<li class="divider-vertical"></li>
								<li><a href="${pageContext.request.contextPath}/page_photo1.action">微课程</a>
								<li><a href="${pageContext.request.contextPath}/news_findAll.action">新闻</a>
								</li>
								<li><a
									href="${pageContext.request.contextPath}/page_text1.action">文档</a>
								</li>
								<li class="divider-vertical"></li>

								

								<li class="divider-vertical"></li>

							</ul>

							
						</div>

					</div>

				</div>

			</div>

		</div>



		<div class="text-center">

			<img src="img/sha.png" class="slidershadow" alt="">

		</div>