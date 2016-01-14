<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<%@ include file="./header.jsp"%>
<%-- <script type="text/javascript"
	src="${pageContext.request.contextPath }/js/json2.js"></script> --%>
	
<script type="text/javascript">
$(document).ready(function(){
	
	query();
	
	 $("#btn1").bind("click", function(){
	
			
			
		  var i = parseInt($("#select1").val())-1;
		  
			 $("#select1").val(i);
			 
			 query();
	    });
	  
	  $("#btn2").bind("click", function(){
		  
		
		
		  var i = parseInt($("#select1").val());
		
			 $("#select1").val(i);
			 
			 query();
			
	    });
	  
	  $("#btn3").bind("click", function(){
		  
		
		
		  var i = parseInt($("#select1").val())+1;
		
			 $("#select1").val(i);
			 
			 query();
			
	    });


	function query(){
		
		for(var n=1;n<=8;n++){
		//	alert(n);
			 $("#"+n).attr("src","");
			 $("#a"+n).attr("href","");
			$("#a"+n).text("");
			
		}
		
		
		var currentPage =  $("#select1").val();
		
		$.post("${pageContext.request.contextPath }/photo1_pageQuery.action",
				  {
				    page:currentPage,
				    
				    rows:8
				  },
				  function(data,status){
					
					var data_re = data.rows;
					
					$.each(data_re, function(i, n){ 
						
					 var ab=i+1;
					 $("#"+ab).attr("src","testphoto/"+n.photo+".jpg");
					 $("#a"+ab).attr("href","testphoto/"+n.photo+".jpg");
					$("#a"+ab).text(n.uploadName);
						
					  });	
					$("#myspan").text("共"+data.total+"条记录");
					
					var length = (data.total%8)?data.total/8+1:data.total/8;
				
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
				<h1><span class="primarycolor">经典</span> 粤剧</h1>
			</div>
	</div>

	<!-- /end header -->

	<div class="container">

		<div class="page-header">

			<h1>照片总览</h1>

		 	<div class="headerdivider"> 

			</div>

		</div>

	</div>
	
 
<style type="text/css">
.dd{ width:241.01px; height:160px;}
.dd img{ width:100%; height:100%;}
#select1{width:50px;}
</style>




<div class="row-fluid recent-posts">

			<div class="span3">

			<div  class="dd"  ><img width=100% height=100% id=1 ></div>	

				<center><h4><a target=_blank id="a1"></a></h4></center>

			</div>
			
			<div class="span3">

				<div  class="dd"  ><img width=100% height=100% id=2 ></div>

				<center><h4><a target=_blank id="a2"></a></h4></center>


			</div>
			
			<div class="span3">

				<div  class="dd"  ><img width=100% height=100% id=3 ></div>

				<center><h4><a target=_blank id="a3"></a></h4></center>

			</div>
			
			<div class="span3">

				<div  class="dd"  ><img width=100% height=100% id=4 ></div>

				<center><h4><a target=_blank id="a4"></a></h4></center>

			</div>
			
</div>




<div class="row-fluid recent-posts">

			<div class="span3">
			
				<div  class="dd"  ><img width=100% height=100%  id=5 ></div>
	
				<center><h4><a target=_blank id="a5"></a></h4></center>

			</div>
			
			<div class="span3">
				
				<div  class="dd"  ><img width=100% height=100% id=6 ></div>
			
				<center><h4><a target=_blank id="a6"></a></h4></center>

			</div>
			
			<div class="span3">

				<div  class="dd"  ><img width=100% height=100% id=7 ></div>

				<center><h4><a target=_blank id="a7"></a></h4></center>

			</div>
			
			<div class="span3">

				<div  class="dd"  ><img width=100% height=100% id=8 ></div>

				<center><h4><a target=_blank id="a8"></a></h4></center>

			</div>
			
</div>


	<center>
		<a id="btn1"  class="easyui-linkbutton" >上一页</a>
		第
			<select  id="select1" contenteditable="true">
			  <option id="op1" value=1>1</option>
			<!--   <option id="op2" value=2>2</option>
			  <option id="op3" value=3>3</option>
			  <option id="op4" value=4>4</option> -->
			</select>
		页
		<a id="btn2" href="#" class="easyui-linkbutton" >跳转</a>
		<a id="btn3" class="easyui-linkbutton" >下一页</a>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<span id="myspan">haha</span>
	</center>









	<!-- FOOTER BEGIN

================================================== -->
<%@include file="./end.jsp"%></html>