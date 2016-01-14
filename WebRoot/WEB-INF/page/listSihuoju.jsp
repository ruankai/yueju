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
<div class="menubar"></div>

<!-- 主题列表 -->
<table cellspacing="0" style="margin-left:60px;" style="text-align:center">
	<tbody class="list topicList" >
		<!--显示表头-->
		<tr class="title" >
			<td width="50">
				编号
			</td>
			<td width="50">
				类型
			</td>
			<td width="50">
				参与人数
			</td>
			<td width="50">
				活动名称
			</td>
			<td width="200" >
				地点
			</td>
			<td width="110">
				发起者
			</td>
			<td width="145">
				开始时间
			</td>
			
		</tr>
	<!-- 显示通过的活动-->
		<s:iterator value="allSihuojuinfo.{?#this.type==1}" status="vs" >
			<%--遍历每一个topic压入栈顶了 --%>
			<tr class="data">
				<td class="num">
					<s:property value="#vs.count" />
				</td>
				<td >
					<font color="red">通过</font>
				</td>
				<td class="num">
					<s:property value="count" />
				</td>
				<td>
					<%--查询详情 --%>
					<s:a namespace="/" action="sihuoju_findById">
						<s:property value="name" />
						<s:param name="id" value="id"></s:param>
					</s:a>
				</td>
				<td class="info">
					<s:property value="place" />
				</td>
					<td class="info">
					<s:property value="user.name" />
				</td>
				<td class="info">
					<s:property value="firstTime" />
				</td>
			</tr>
		</s:iterator>

	<!-- 显示待审核活动-->
		<s:iterator value="allSihuojuinfo.{?#this.type==2}" status="vs" >
			<%--遍历每一个topic压入栈顶了 --%>
			<tr class="data">
				<td class="num">
					<s:property value="#vs.count" />
				</td>
				<td >
					<font color="red">待审核</font>
				</td>
				<td class="num">
					<s:property value="count" />
				</td>
				<td>
					<%--查询详情 --%>
					<s:a namespace="/" action="sihuoju_findById">
						<s:property value="name" />
						<s:param name="id" value="id"></s:param>
					</s:a>
				</td>
				<td class="info">
					<s:property value="place" />
				</td>
					<td class="info">
					<s:property value="user.name" />
				</td>
				<td class="info">
					<s:property value="firstTime" />
				</td>
			</tr>
		</s:iterator>
		<tr>
			<td colspan="5" class="num">
				共有活动数
				<font color="red"><s:property value="allSihuojuinfo.size()" /> </font>个
			</td>
		</tr>
	</tbody>
</table>


<div>
 <s:a namespace="/" action="sihuoju_mysihuoju" >
						我的活动
			
 </s:a>
</div>
<%@ include file="./end.jsp"%>