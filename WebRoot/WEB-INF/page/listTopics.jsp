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
				回复
			</td>
			<td width="200" >
				标题
			</td>
			<td width="110">
				作者
			</td>
			<td width="145">
				最后回复时间
			</td>
		</tr>
	<!-- 显示部门列表 置顶-->
		<s:iterator value="page.records.{?#this.type==2}" status="vs" >
			<%--遍历每一个topic压入栈顶了 --%>
			<tr class="data">
				<td class="num">
					<s:property value="#vs.count" />
				</td>
				<td >
					<font color="red">置顶</font>
				</td>
				<td class="num">
					<s:property value="replies.size()" />
				</td>
				<td>
					<%--查询详情 --%>
					<s:a namespace="/" action="topic_findById">
						<s:property value="title" />
						<s:param name="id" value="id"></s:param>
					</s:a>
				</td>
				<td class="info">
					<s:property value="user.name" />
				</td>
				<td class="info">
					<s:property value="lastUpdateTime" />
				</td>
			</tr>
		</s:iterator>

		<!-- 显示部门列表  精华-->
		<s:iterator value="page.records.{?#this.type==1}" status="vs">
			<%--遍历每一个topic压入栈顶了 --%>
			<tr class="data">
				<td class="num">
					<s:property value="#vs.count" />
				</td>
				<td  >
					<font color="yellow">精华</font>
				</td>
				<td class="num">
					<s:property value="replies.size()" />
				</td>
				<td>
					<%--查询详情 --%>
					<s:a namespace="/" action="topic_findById">
						<s:property value="title" />
						<s:param name="id" value="id"></s:param>
					</s:a>
				</td>
				<td class="info">
					<s:property value="user.name" />
				</td>
				<td class="info">
					<s:property value="lastUpdateTime" />
				</td>
			</tr>
		</s:iterator>
	<!-- 显示部门列表  普通-->
		<s:iterator value="page.records.{?#this.type==1}" status="vs">
			<%--遍历每一个topic压入栈顶了 --%>
			<tr class="data">
				<td class="num">
					<s:property value="#vs.count" />
				</td>
				<td >
					普通
				</td>
				<td class="num">
					<s:property value="replies.size()" />
				</td>
				<td>
					<%--查询详情 --%>
					<s:a namespace="/" action="topic_findById">
						<s:property value="title" />
						<s:param name="id" value="id"></s:param>
					</s:a>
				</td>
				<td class="info">
					<s:property value="user.name" />
				</td>
				<td class="info">
					<s:property value="lastUpdateTime" />
				</td>
			</tr>
		</s:iterator>

		<tr>
			<td colspan="5" class="num">
				共有主题数
				<font color="red"><s:property value="page.records.size()" /> </font>个
			</td>
		</tr>
	</tbody>
</table>
<%@include file="./page.jsp"%>
<div style="margin-bottom: 15px"></div>

<!--发表主题表单-->
<s:form namespace="/" action="topic_add" cssClass="addNewTopicForm">
	<table class="publishArticleForm">
		<tr>
			<td>
				标 题:
			</td>
			<td>
				<s:textfield name="title" cssClass="title"></s:textfield>
			</td>
		</tr>
		<tr>
			<td>
				内 容:
			</td>
			<td>
				<s:textarea name="content" cssClass="content"></s:textarea>
			</td>
		</tr>
		<tr>
			<td></td>
			<td>
				<s:submit value="发　表"></s:submit>
			</td>
		</tr>
	</table>
</s:form>

<%@ include file="./end.jsp"%>