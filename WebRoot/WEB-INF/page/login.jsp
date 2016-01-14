<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="./header.jsp"%>

<body>
	
	
	<div class="main-inner" id="mainCnt"
		style=" height: 440px; overflow: hidden; left: 50%; top: 50%; ">
		<div id="loginBlock" class="login"
			style="margin-top: 80px; height: 255px;">
			<div class="loginFunc">
				<div id="lbNormal" class="loginFuncMobile">用户登录</div>
			</div>
			<div class="loginForm">
				<form  style="margin-left:30px;"
				id="loginform" name="loginform" method="post" class="niceform"
					action="${pageContext.request.contextPath }/header_login.action">
					<div id="idInputLine" class="loginFormIpt showPlaceholder"
						style="margin-top: 5px;">
						<input id="loginform:idInput" type="text" name="name"
							class="loginFormTdIpt" maxlength="50" />
						<label for="idInput" class="placeholder" id="idPlaceholder">帐号：</label>
					</div>
					<div class="forgetPwdLine"></div>
					<div id="pwdInputLine" class="loginFormIpt showPlaceholder">
						<input id="loginform:pwdInput" class="loginFormTdIpt" type="password"
							name="password" value="" />
						<label for="pwdInput" class="placeholder" id="pwdPlaceholder">密码：</label>
					</div>
					<div class="loginFormIpt loginFormIptWiotTh"
						style="margin-top:58px;">
						
						<a href="#" onclick="$('#loginform').submit()" id="loginform:j_id19" name="loginform:j_id19">
						<span
							id="loginform:loginBtn" class="btn btn-login"
							style="margin-top:-36px;">登录</span>
						</a>
					</div>
					<div class="loginFormIpt loginFormIptWiotTh"
						>
						<font color="red">
						<s:actionerror/>
						</font>
					</div>
				</form>
			</div>
		</div>
	</div>
	<%@ include file="./end.jsp"%>
</body>
</html>
