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
	
	
	<div style="padding: 10px 30px; font-size: 12px; font-family:'宋体'">
		共有<font color="red"><s:property value="#sihuojujoin.size"/> </font>人参与
	</div>
	
	<!-- 显示主题 -->
	<table class="postList" cellspacing="0" >
	    <tr class="content">
	        <td>活动名称</td>
	        <td><<pre><s:property value="#sihuojuinfo.name"/> </pre></td>
	    </tr>
	   
	    <tr class="content">
	        <td>地点</td>
	        <td><pre><s:property value="#sihuojuinfo.place"/> </pre></td>
	    </tr>
	     <tr class="content">
	     	<td>内容</td>
	    	<s:iterator value="#sihuojuinfo">
		       <td><pre> ${description} </pre></td>
		     </s:iterator>
	   	 </tr>
	     <tr class="info">
	        <td></td>
	        <td>
				发起者：<font color="blue"><s:property value="#sihuojuinfo.user.name"/></font> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	            <font color="#999999">活动开始时间：<s:date name="#sihuojuinfo.firstTime" /></font> <%--format="yyyy-MM-dd" --%>
	        </td>
	    </tr>
	</table>
	
	  
	<!-- 显示回复列表 -->
	<s:iterator value="#sihuojujoin" var="s" status="vs" > 
		<table class="postList" cellspacing="0">
	     
	       
	        <tr class="info">
	            <td></td>
	            <td>
					参与者：<font color="blue"><s:property value="#s.user.name"/></font> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	             
	            </td>
	        </tr>
	        
	       
	    </table>
	</s:iterator>
	
        <s:a namespace="/" action="sihuojujoin_join">
						參加
						<s:param name="id" value="id"></s:param>
		</s:a>
		
        <s:a namespace="/" action="sihuojujoin_del">
						取消
						<s:param name="id" value="id"></s:param>
		</s:a>
<%@ include file="./end.jsp"%>