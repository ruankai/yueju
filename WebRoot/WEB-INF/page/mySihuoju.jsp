<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="./header.jsp"%>

	<!-- 简单搜索表单 -->
	<!--  <div style="margin: 15px auto; " >
		<form action="" class="simpleSearchForm" onsubmit="alert('暂不支持此功能！');return false;">
			<font class="logoLabel">贴吧</font>
			<input type="text" name="queryString" class="queryString"/>
			<input type="submit" value="搜 索" />
		</form>
	</div>
	-->
	<!-- 菜单 -->
	<div class="menubar">
		<s:a namespace="/" action="sihuoju_findAll">活动列表</s:a>
	</div>
	
	
	
	
	<!-- 显示主题 -->
	<div>
	 我的活动
	</div>
	<s:iterator value="#mysihuojuinfos" var="s" status="vs" > 
		<table class="postList" cellspacing="0" >
	    <tr class="content">
	        <td>活动名称</td>
	        <td><<pre><s:property value="#s.name"/> </pre></td>
	    </tr>
	   
	    <tr class="content">
	        <td>地点</td>
	        <td><pre><s:property value="#s.place"/> </pre></td>
	    </tr>
	    <tr class="content">
	        <td>内容</td>
	        <td><pre><s:property value="#s.description"/> </pre></td>
	    </tr>
	     <tr class="info">
	        <td></td>
	        <td>
				发起者：<font color="blue"><s:property value="#s.user.name"/></font> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	            <font color="#999999">活动开始时间：<s:date name="#s.firstTime" /></font> <%--format="yyyy-MM-dd" --%>
	        </td>
	    </tr>
	</table>
	</s:iterator>
	
	   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<div>
	我参与的活动
	</div>
	<s:iterator value="#mysihuojujoins" var="s" status="vs" > 
		<table class="postList" cellspacing="0" >
	    <tr class="content">
	        <td>活动名称</td>
	        <td><<pre><s:property value="#s.sihuojuinfo.name"/> </pre></td>
	    </tr>
	   
	    <tr class="content">
	        <td>地点</td>
	        <td><pre><s:property value="#s.sihuojuinfo.place"/> </pre></td>
	    </tr>
	    <tr class="content">
	        <td>内容</td>
	        <td><pre><s:property value="#s.sihuojuinfo.description"/> </pre></td>
	    </tr>
	     <tr class="info">
	        <td></td>
	        <td>
				发起者：<font color="blue"><s:property value="#s.sihuojuinfo.user.name"/></font> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	            <font color="#999999">活动开始时间：<s:date name="#s.sihuojuinfo.firstTime" /></font> <%--format="yyyy-MM-dd" --%>
	        </td>
	    </tr>
	</table>
	</s:iterator>
	
       
<%@ include file="./end.jsp"%>