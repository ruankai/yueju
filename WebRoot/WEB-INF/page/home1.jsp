<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="./header.jsp"%>

  
	
	<div class="row-fluid text-center intro">

			<div class="span12">

				<h1><span class="primarycolor">经典</span> 粤剧</h1>
			</div>

	</div>

	<div class="container">
         <!-- 新闻---->
		<div class="row-fluid">
        
			<div class="camera_wrap pattern_4 camera_emboss" id="camera_wrap_4">

				<div data-src="img/demo/slide1.jpg">

					<div class="camera_caption fadeFromTop">

						<h1>粤剧1</h1>

						<span>
                  		      好看
						</span>

					</div>

				</div>

				<div data-src="img/demo/slide2.jpg">

					<div class="camera_caption fadeFromRight">

						<h1>粤剧2</h1>

						<span>

						好看 </span>

					</div>

				</div>

			</div>

			<div class="text-center">

				<img src="img/sha.png" class="slidershadowcam" alt="">

			</div>

		</div>


		
		<div class="row-fluid">

			<div class="span12">

				<div class="titleborder">

					<div>
                        粤剧动态

					</div>

				</div>

			</div>

		</div>
		
		

		<div class="row-fluid recent-posts">
			<s:iterator value="allTopic" var="vs" >
					<div class="span3">
						<article>
								<div class="date">
								 <!-- 添加图片1 -->	
								<a href="<s:property value="#vs.url"/>" class="read-more"  target="_blank"	> 
									 
										<img src="img/temp/masonry/<s:property value="#vs.photopath" escape="false" /> "
										 width="300" height="300"	 alt="" class="imgOpa">
									
										<s:property value="#vs.newstitle" escape="false" /> 
										 <i class="icon-angle-right"></i>
								</a>
									</span>
									<!-- <span class="month"></span> -->
								</div>
						</article>
					</div>
			</s:iterator>
		</div>

	

	</div>

	<!-- FOOTER BEGIN

================================================== -->
<%@ include file="./end.jsp"%>
	