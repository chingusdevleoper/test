<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<html>

<body bgcolor="#FFFFC2">
	<center>
		<h1 id="banner">Project Details</h1>

		<form name="f" action="<c:url value="/NewProjectDetails" />" method="POST">
			<table>
				<tr>
					<td>Enter Project Name:</td>
					<td><input type='text' name='projectNname' /></td>
				</tr>

				<tr align="right">
					<td align="center"><input name="submit" type="submit">
				</tr>
			</table>

			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />

		</form>
	</center>
</body>
</html>