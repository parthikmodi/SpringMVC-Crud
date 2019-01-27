<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Log IN</h1>
<f:form modelAttribute="student" action="saveProcess">
	<table border="1">
	
	<f:hidden path="name"/> 
			<tr>
				<td>Name</td>
				<td><f:input path="name"/></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><f:input path="email"/></td>
			</tr>
	</table>
	
	<input type="submit" value="Submit">
</f:form>

<a href="/ListStudents"></a>
</body>
</html>