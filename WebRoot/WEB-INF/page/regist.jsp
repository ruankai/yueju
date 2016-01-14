<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="./header.jsp"%>
    <h3>新用户注册</h3>
    <form action="${pageContext.request.contextPath}/header_regist.action" method="post">
    	<table border="1" width="438" style="margin-left:30px;"
>
    		<tr>
    			<td>用户名：</td>
    			<td>
    				<input name="name"/>
    			</td>
    		</tr>
    		<tr>
    			<td>密码：</td>
    			<td>
    				<input type="password" name="password"/>
    			</td>
    		</tr>
    		<tr>
    			<td>真实姓名：</td>
    			<td>
    				<input name="trueName"/>
    			</td>
    		</tr>
    		<tr>
    			<td>电话：</td>
    			<td>
    				<input name="tel"/>
    			</td>
    		</tr>
    		<tr>
    			<td>地址：</td>
    			<td><input name="place"/></td>
    		</tr>
    		<tr>
    			<td>邮箱：</td>
    			<td>
    				<input name="email"/>
    			</td>
    		</tr>
    		<tr>
    			<td colspan="2">
    				<input type="submit" value="注册"/>
    			</td>
    		</tr>
    	</table>
    </form>
  </body>
</html>
