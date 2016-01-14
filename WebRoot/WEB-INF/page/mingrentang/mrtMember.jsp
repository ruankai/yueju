<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<%@ include file="../header.jsp"%>
<script type="text/javascript">

$(document).ready(function(){
	post();
	
	
	var count2;
	var id2;
	function post(){
		
		id2=${id};
		
		$.post("${pageContext.request.contextPath}/mingrentang_findById.action",
			{
				id:id2
			},
			function(data,status){
				
				 $("#title").text("名人堂    "+data.name);
				 $("#a").text(data.content);
				 
				 $("#c").text(data.count+"");
				 count2=data.count;
				 
				 $("#b").bind("click",function(){
						BClickFunction();
				 });
			});
	}
	
	
	function BClickFunction(){
		
		$("#praise").attr("src","img/praise2.jpg");
		count2=count2+1;
		
		$("#c").text(count2+"");
			post2();
			
			function post2(){
				$.post("${pageContext.request.contextPath}/mingrentang_UpdateCount.action",
				{
					id:id2,
					count:count2
				},
				function(){
					$("#b").unbind("click");
				});
			}
	 }
});

</script>

<html>
	<!-- /end header -->
	<div class="row-fluid text-center intro">
			<div class="span12">
			<!--  -->
				 <h1><span class="primarycolor" id="title"></span></h1> 
			</div>
	</div>
	<div class="row-fluid text-center intro">
			<div class="span12">
				<a id="a"></a> 
			</div>
	</div>
	<div class="row-fluid text-center intro">
		<div class="span3" id=span_1>
			
			<center>
				<div  class="dd"  id="div">
						<b id="b" >
							<img width=15% height=15% src="img/praise1.jpg" id="praise">
						</b>
						<c id="c"></c>
				</div>	
				
			</center>
				
		</div>
	</div>
</html>

	<!-- FOOTER BEGIN

================================================== -->
<%@include file="../end.jsp"%></html>