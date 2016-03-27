<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>

<link rel="stylesheet"
	href="<c:url value="resources/css/login/style.css" />">
<script type="text/javascript"
	src="<c:url value="resources/js/jquery-1.12.2.min.js" />"></script>

</head>
<script>
	function sendLogin() {
		alert("test");
		$("#form1").submit();
	}
</script>
<body>
	<form id="form1" action="j_spring_security_check"  method="post">
		<div class="login">
			<div class="login-screen">
				<div class="app-title">
					<h1>Login</h1>
				</div>

				<div class="login-form">
					<div class="control-group">
						<input type="text" class="login-field" value="" name="username"
							placeholder="username" id="login-name"> <label
							class="login-field-icon fui-user" for="login-name"></label>
					</div>

					<div class="control-group">
						<input type="password" class="login-field" value="" name="password"
							placeholder="password" id="login-pass"> <label
							class="login-field-icon fui-lock" for="login-pass"></label>
					</div>

					<a class="btn btn-primary btn-large btn-block" href="#"
						onclick="sendLogin();">login</a> <a class="login-link" href="#">Lost
						your password?</a>
				</div>
			</div>
		</div>
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />

	</form>
</body>

</html>

