<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<%@ include file="../header.jsp"%>
<%-- <script type="text/javascript"
	src="${pageContext.request.contextPath }/js/json2.js"></script> --%>
	
<script type="text/javascript">
$(document).ready(function(){
	post();
	
	var currentPage=1;
	var length2;
	 var count;
	 
	
	
	$("#btn1").bind("click", function(){
		
		  var i = parseInt($("#select1").val())-1;
		  	if(i>0){
		  	
				 $("#select1").val(i);
				 currentPage=i;
				 post();
			}
	    });
	    
	 $("#btn2").bind("click", function(){
		  
		  var i = parseInt($("#select1").val());
				
				$("#select1").val(i);
				currentPage=i;
				post();
		
	    });
	  
	  $("#btn3").bind("click", function(){
		  
		  var i = parseInt($("#select1").val())+1;
			if(length2>i)
			 {
			 	$("#select1").val(i);
				currentPage=i;
				post();
			}
			 
			
	    });
	   function post(){
	   		
			$.post("${pageContext.request.contextPath }/mingrentang_pageQuery.action",
			  {
			    page:currentPage,
			    
			    rows:4
			  },
			function(data,status){
					
					var data_re = data.rows;
					var content=data.content;
					count=1;
					while(count<=4)
					 	{
					 		
					 		$("#span_"+count).show();
					 		count=count+1;
					 	}
					count=0;
					$.each(data_re, function(i, n){ 
						if(n.id<=data.total)
							{
							
							 count=count+1;
							 $("#"+count).attr("src","minren_image/"+n.id+".jpg");
							 $("#a"+count).attr("href","${pageContext.request.contextPath }/mingrenPage2_"+n.id+".action");
							 $("#div"+count).bind("click", function(){
							 		window.location.href="${pageContext.request.contextPath }/mingrenPage2_"+n.id+".action";
									});
							 				
							 $("#a"+count).text(n.name);
							}
					
					  });	
				
					 while(count<4)
					 	{
					 		count=count+1;
					 		$("#span_"+count).hide();
					 		
					 	}
					  
					$("#myspan").text(data.total);
				
					var length = (data.total%4)?data.total/4+1:data.total/4;
					length2=length;
					var niw="";
					
					for(var m=1;m<=length;m++){
					
						niw+="<option value="+m+">"+m+"</option>";	
					}
					
					var s1 = document.getElementById("select1");
					
					s1.innerHTML=niw;
					
					$("#select1").val(currentPage);
					
			});
	   		
	   
	   }
	
});


</script>




<html>
	<!-- /end header -->
	<div class="row-fluid text-center intro">
			<div class="span12">
			<!--  -->
				 <h1><span class="primarycolor" >名人堂</span></h1> 
			</div>
	</div>

	<!-- /end header -->

	<div class="container">

		<div class="page-header">

			<h1>名家众览</h1>

		 	<div class="headerdivider"> 

			</div>

		</div>

	</div>
	
 <!--照片的外观格式  -->
<style type="text/css">
.dd{ width:241.01px; height:160px;}
.dd img{ width:100%; height:100%;}
#select1{width:50px;}
</style>
<div class="row-fluid recent-posts">
		
			<div class="span3" id=span_1>
			
			<div  class="dd"  id="div1"><img width=100% height=100% id=1 ></div>	
			
				<center><h4 id=h4_1><a target=_blank id="a1" ></a></h4></center>
				
			</div>
			
			<div class="span3" id=span_2>

				<div  class="dd"  id="div2"><img width=100% height=100% id=2 ></div>

				<center><h4 id=h4_2><a target=_blank id="a2"></a></h4></center>


			</div>
			
			<div class="span3" id=span_3>

				<div  class="dd"  id="div3"><img width=100% height=100% id=3 ></div>

				<center><h4 id=h4_3><a target=_blank id="a3"></a></h4></center>

			</div>
			
			<div class="span3" id=span_4>

				<div  class="dd"  id="div4"><img width=100% height=100% id=4 ></div>

				<center><h4 id=h4_4><a target=_blank id="a4"></a></h4></center>

			</div>
			
</div>

	<center>
		<a id="btn1"  class="easyui-linkbutton" >上一页</a>
		第
			<select  id="select1" contenteditable="true" >
			  <option id="op1" value=1>1</option>
		
			</select>
		页
		<a id="btn2" href="#" class="easyui-linkbutton" >跳转</a>
		<a id="btn3" class="easyui-linkbutton" >下一页</a>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			共有<span id="myspan"></span>记录
	</center>

	<!-- FOOTER BEGIN

================================================== -->
<%@include file="../end.jsp"%></html>