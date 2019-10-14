<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆主页</title>
<link href="./css/index.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div>
		<form action="validate.jsp" name="login">
			用户名 <input name="username" type="text" /><br />
			<br /> 密 &nbsp;&nbsp;码 <input name="password" type="password" /><br />
			<br /> <input class="submit" type="submit">
		</form>
	</div>
</body>
</html>