<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="./header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	

			<div class="container">

				<div class="page-header">

					<h1>
						文档总览
					</h1>

					<div class="headerdivider"></div>

				</div>

			</div>
			<script type="text/javascript">

        function ClickRow(rowIndex, rowData) {
                 //alert(rowData.title);
                 window.location.href="${pageContext.request.contextPath}/text1_findById.action?id="+rowData.textId;            
               } 
    </script>
			<table id="dg" class="easyui-datagrid"
				data-options="url : '${pageContext.request.contextPath}/text1_pageQuery.action',pagination:true,width:700,height:300,singleSelect:true,toolbar:'#tt',fitColumns:true,onClickRow:ClickRow">
				<thead>
					<tr>
						<th data-options="field:'title',width:100">
							标题
						</th>
						<th data-options="field:'author',width:100">
							作者
						</th>
					
					
					</tr>
				</thead>
			</table>

			<!-- FOOTER BEGIN

================================================== -->
			<%@ include file="./end.jsp"%>
</html>