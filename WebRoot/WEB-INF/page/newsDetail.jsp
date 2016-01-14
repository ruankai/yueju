<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ include file="./header.jsp"%>
  <body>
    <div id="main-right" >		
				<center>
					<table border="0" cellpadding="5" cellspacing="1">
						<s:iterator value="#findNews">
						<tr>
							<h3>${title }</h3>
							<h5>${time}&nbsp;&nbsp;&nbsp;${time}</h5>
						</tr>
							
						 	<td style="padding-right:80px;padding-left:80px">${text}(完)</td> 
						 	 
						</tr>
						</s:iterator>
					</table>
				</center>
				<br>
		</div>	
  </body>
   <%@ include file="./foot.jsp"%>
  <%@ include file="./end.jsp"%>
 
</html>
