<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vote</title>
</head>
<body>
	<h3>Please click to vote for one of:</h3>
	<form method="post" action="${pageContext.request.contextPath}/vote">
		<input type="submit" name="vote" value="Aakash Khan" />
		<input type="submit" name="vote" value="Marion Wells" />
		<input type="submit" name="vote" value="Damien Yu" />
	</form>
</body>
</html>