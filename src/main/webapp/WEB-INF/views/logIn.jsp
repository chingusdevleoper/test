<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<html>

<body bgcolor="#FFFFC2">
	<center>
		<h1 id="banner">Login to Security Demo</h1>

		<form name="f" action="<c:url value="${loginUrl}" />" method="POST">
			<table>
				<tr>
					<td>Username:</td>
					<td><input type='text' name='j_username' /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type='password' name='j_password'></td>
				</tr>
				<tr>
					<td colspan="2">&nbsp;</td>
				</tr>
				<tr align="right">
					<td  align="center" colspan="2"><input name="submit" type="submit">&nbsp;<input
						name="reset" type="reset"></td>
				</tr>
			</table>
 <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />

		</form>
	</center>
</body>
</html>