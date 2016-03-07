<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC - HelloWorld Index Page</title>
</head>
<body bgcolor="#FFFFC2">
<center>
<h3>Log In Form</h3>
	<form name='loginForm' id="loginForm" action="hello" method='POST' >

		<table border="1" bgcolor="#FF8040">
			<tr>
				<td>User:</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr align="right">
				<td align="center" colspan="2"><input align="top" name="submit" type="submit" value="submit" onclick="submitLogin()" />
					<input align="top" name="reset" type="reset" /></td>
			</tr>
		</table>

	</form>
</center>

	<script>
		function submitLogin() {
			document.getElementById(loginForm).submit();
		}
	</script>
</body>
</html>