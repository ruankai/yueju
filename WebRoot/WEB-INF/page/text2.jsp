<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="./header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	
			<div class="row-fluid text-center intro">

				<div class="span12">

					<h1>
						<span class="primarycolor">文档</span>
					</h1>
				</div>

			</div>


			<!-- /end header -->

			<div class="container">

				<div class="page-header">

					<h1>
						文档总览
					</h1>

					<div class="headerdivider"></div>

				</div>

			</div>
			<table>
				<tr>
						<td>
							标题：${text.title}
							<br />
							作者：${text.author}
							<br />
							乐曲：${text.themes}
							<br />
							内容：${text.content}
							<br />
						</td>
				</tr>
			</table>

			<!-- FOOTER BEGIN

================================================== -->
			<%@ include file="./end.jsp"%>
</html>