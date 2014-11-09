<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome Page</title>
<script type="text/javascript">
	function validateForm() {
		var sname = document.forms["loginForm"]["studentName"].value;
		var pswd = document.forms["loginForm"]["password"].value;
		if (sname == null || sname == "" || pswd == null || pswd == "") {
			document.getElementById("StudentName").innerText = 'Either Student Name or Password is Empty.';
			document.getElementById("Password").innerText = 'Either Student Name or Password is Empty.';
			return false;
		}
	}
</script>
</head>
<body>
	<form name="loginForm"
		action="${pageContext.request.contextPath}/login" method="post"
		onsubmit="return validateForm()">
		<h3>Welcome to the online election Website.</h3>
		<p>
			To vote, enter your Student number and election password. Then click
			<b>Sign In.</b>
		<table>
			<tbody>
				<tr>
					<td>Student ID</td>
					<td><input type="text" name="studentName" size="12"><label
						id="StudentName"></label></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" size="12"><label
						id="Password"></label></td>
				</tr>
			</tbody>
		</table>
		<input type="submit" name="SignIn" value="Sign In!" />
	</form>
</body>
</html>