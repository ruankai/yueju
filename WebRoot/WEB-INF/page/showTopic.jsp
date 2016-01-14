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
		<s:a namespace="/" action="topic_findAll">主题列表</s:a>
	</div>
	
	<!-- 当前主题贴数 -->
	<div style="padding: 10px 30px; font-size: 12px; font-family:'宋体'">
		共有<font color="red"><s:property value="#findTopic.replies.size() + 1"/> </font>篇帖子
	</div>
	
	<!-- 显示主题 -->
	<table class="postList" cellspacing="0">
	    <tr class="title">
	        <td width="20" class="num">1</td>
	        <td><s:property value="#findTopic.title"/></td>
	    </tr>
	    <tr class="content">
	        <td></td>
	        <td><pre><s:property value="#findTopic.content"/> </pre></td>
	    </tr>
	    <tr class="info">
	        <td></td>
	        <td>
				作者：<font color="blue"><s:property value="#findTopic.user.name"/></font> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	            <font color="#999999">发帖时间：<s:date name="#findTopic.postTime" /></font> <%--format="yyyy-MM-dd" --%>
	        </td>
	    </tr>
	</table>
	
	<!-- 显示回复列表 -->
	<s:iterator value="#findTopic.replies" var="reply" status="vs"> <%--将遍历的每一个回复reply，添加到context中put("var值",遍历内容) --%>
		<table class="postList" cellspacing="0">
	        <tr class="title">
	            <td width="20" class="num"><s:property value="#vs.count + 1"/></td>
	            <td></td>
	        </tr>
	        <tr class="content">
	            <td></td>
	            <td><pre><s:property value="#reply.content"/> </pre></td>
	        </tr>
	        <tr class="info">
	            <td></td>
	            <td>
					作者：<font color="blue"><s:property value="#reply.user.name"/></font> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	                <font color="#999999">回帖时间：<s:date name="#reply.postTime"/> </font>
	            </td>
	        </tr>
	    </table>
	</s:iterator>
	
    
    <div style="margin-bottom: 20px"></div>
	<!-- 发表回复表单 -->
	<s:form namespace="/" action="reply_add" cssClass="addNewTopicForm">
		<%--确定当前主题 --%>
		<s:hidden name="topic.id" value="%{#findTopic.id}"></s:hidden>
		<table class="publishArticleForm">
	        <tr>
	            <td class="label">内　容:</td>
	            <td>
	            	<s:textarea name="content" cssClass="content"></s:textarea>
	            </td>
	        </tr>
	        <tr>
	            <td></td>
	            <td><s:submit value="回　贴"></s:submit></td>
	        </tr>
	    </table>
	</s:form>
<%@ include file="./end.jsp"%>