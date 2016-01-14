<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div>
    	&nbsp;&nbsp;&nbsp;&nbsp;第${page.pageNum}页/共${page.totalPage}页&nbsp;&nbsp;
    	<a href="${pageContext.request.contextPath}${page.url}?num=1">首页</a>&nbsp;&nbsp;
    	<a href="${pageContext.request.contextPath}${page.url}?num=${page.prePageNum}">上一页</a>&nbsp;&nbsp;
    	<c:forEach begin="${page.startPage}" end="${page.endPage}" var="num">
    		<a href="${pageContext.request.contextPath}${page.url}?num=${num}">${num}</a>&nbsp;&nbsp;
    	</c:forEach>
    	
    	<a href="${pageContext.request.contextPath}${page.url}?num=${page.nextPageNum}">下一页</a>&nbsp;&nbsp;
    	<a href="${pageContext.request.contextPath}${page.url}?num=${page.totalPage}">尾页</a>&nbsp;&nbsp;
    	<select id="jump" onchange="jump(this)">
    		<c:forEach begin="1" end="${page.totalPage}" var="n">
    			<option value="${n}" ${page.pageNum==n?'selected="selected"':''}>${n}</option>
    		</c:forEach>
    	</select>
    	&nbsp;&nbsp;
    	<input type="text" size="3" id="num"/><input type="button" value="跳转" onclick="jump1()"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    	<script type="text/javascript">
    		function jump(selectObj){
    			window.location.href="${pageContext.request.contextPath}${page.url}?num="+selectObj.value;
    		}
    		function jump1(){
    			//得到用户输入的页码
				var num = document.getElementById("num").value;
				//alert(num);
				//验证必须是个自然整数
				if(!/^[1-9][0-9]*$/.test(num)){
					alert("请输入正确的页码?");
					return;
				}
				//页码有没有超出范围
				if(num>${page.totalPage}){
					alert("页码超出范围");
					return;
				}
				window.location.href="${pageContext.request.contextPath}${page.url}?num="+num;
			}
    	</script>
    </div>