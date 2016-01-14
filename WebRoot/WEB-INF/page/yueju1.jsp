<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="./header.jsp"%>

<script type="text/jscript">
function airport(c){
	c.style.background="#7c8577";   
	//alert("shang");
}
function airporthover(c){
	c.style.background="#9d9087";
}
	
function play(videoId){
	//alert(videoId);
	$.post("${pageContext.request.contextPath }/yueju1_play.action",
			  {
				videoId:videoId
			  },
			  function(data,status){
				   
				//  alert(data);
				  $("video").attr("src","testvideo/"+data.video+".mp4");
				  $("#head").text(data.uploadName);
				 // alert(data);
				  
			  });	
		
}
</script>



<script type="text/javascript">
$(document).ready(function(){
	
	query();
	function query(){
		$.post("${pageContext.request.contextPath }/yueju1_query.action",
				  {
					
				  },
				  function(data,status){

				//	alert(data.length);
					var h = "";
					for(var i=0;i<data.length;i++){
						//alert(data[i].uploadName);
						
						h+=	"<tr onmouseover='airport(this)' onmouseout='airporthover(this)'"
							+"onclick='play("+data[i].videoId+")'"
							+"style='height:100px;cursor:pointer;'>"
							+"<td style='width:35%;'>"
							+"<img  src='testphoto/"
					 		+data[i].preview 
							+".jpg' style='width:100%;height:100px;'"
							+"</td><td  style='width:65%;font-size:20px;color:#fffffb;'>"
							+"<center>"
							+data[i].uploadName
							+"</center></td></tr>";
							
					}
					$("#list").html(h);
					
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

			<h1>粤剧总览</h1>

			<div class="headerdivider">

			</div>

		</div>

	</div>
	
<p id=head style="font-size:30px;color:blue;">粤剧</p>
<table style="width:100%;height:500px">
<tr style="height:500px">
<td style="height:100%">
<div style="width:100%;height:500px;display:inline;">
	<div  	 style="width:70%;height:500px;float:left;">

	 <video    controls  autoplay style="width:100%;height:500px;background-image:url(img/background_black.jpg)">
				<source src="movie.ogg" type="video/ogg">
				<source src="${pageContext.request.contextPath }/testvideo/1.mp4" type="video/mp4">
						<!--  Your browser does not support the video tag.  -->
	</video> 
	
	</div>
	<div id="list" style="width:30%;height:500px;overflow:auto;float:left;background:#9d9087;"><!-- #5e7c85 -->
	
	<table style="width:100%;height:100%;">
	
	
	</table>
	</div>
</div>
</td>
</tr>
</table>


	<!-- FOOTER BEGIN

================================================== -->
<%@ include file="./end.jsp"%></html>