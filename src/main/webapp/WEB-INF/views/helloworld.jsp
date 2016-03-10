<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC -HelloWorld</title>
</head>

<BODY bgcolor="#FFFFC2">

	<FORM id="form1" METHOD="POST" action="New">
		
		<c:if test="${not empty existingProjectsList}">
			<center><h3>Existing Projects List for <c:out value="${name}"></c:out></h3>
			
				<c:forEach var="listValue" items="${existingProjectsList}" >
					 <li><a href="hello">${listValue}</a></li>
				</c:forEach>
			
			</center>
		</c:if>
		
		<center><h3><a href="New">Add New Project</a></h3></center>
		<!-- <button name="submitForm" id="submitForm" onclick="formSubmit()" value="Add New Project">Add New Project</button> -->
	</FORM>
<script>
function formSubmit(){
	document.getElementById("form1").submit();
}
</script>
</BODY>
</html>