<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Election Error</h3>
	<p>There is a problem, either Student ID or Password is incorrect</p>
	<form method="post" action="${pageContext.request.contextPath}/error">
		<input type="submit" name="err" value="Try Again!" />
	</form>
</body>
</html>