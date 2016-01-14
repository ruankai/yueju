<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="./header.jsp"%>

<div class="menubar"></div>

<!-- 主题列表 -->
<table cellspacing="0" style="margin-left:60px;" style="text-align:center">
	<tbody class="list topicList" >
		<!--显示表头-->
		<tr class="title" >
			<td width="50" style="padding-left:220px">
				标题
			</td>
		</tr>

		<s:iterator value="allNews" status="vs">
			<tr class="data">
				<td class="num" style="padding-right:80px;padding-left:80px">
					<s:property value="#vs.title" />
				</td>
				<td>
					<%--查询详情 --%>
					<s:a namespace="/" action="news_findById">
						<s:property value="title" />
						<s:param name="id" value="id"></s:param>
					</s:a>
				</td>
			</tr>
		</s:iterator>
	

		<tr>
			<td colspan="5" class="num">
				共有主题数
				<font color="red"><s:property value="allNews.size()" /> </font>个
			</td>
		</tr>
	</tbody>
</table>
<%@include file="./page.jsp"%>
<div style="margin-bottom: 15px"></div>

<%@ include file="./end.jsp"%>