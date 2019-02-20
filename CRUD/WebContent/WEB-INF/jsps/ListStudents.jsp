<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Students</title>
</head>
<body>
<h2>List of Students</h2>
	<p>
	<button onclick="window.location.href='Add'"; return false;>Add Student</button>
	</p>
	<table border="1">
	<tr>
		<td>Name</td>
		<td>Email</td>
		<td>Action</td>
	</tr>
	<c:forEach items="${studentList}" var = "student">
		<c:url var="updateLink" value="updateRecord">
			<c:param name="name" value="${student.name}"/>
		</c:url>
		
		<c:url var="deleteLink" value="deleteRecord">
			<c:param name="name" value="${student.name}"/>
		</c:url>
		<tr>
			<td>${student.name}</td>
			<td>${student.email}</td>
			<td><a href="${updateLink}">Update</a> | <a onclick="if(!(confirm('Are you sure want to delete the record?'))) return false" href="${deleteLink}">Delete </a></td>
		</tr>
	</c:forEach>	
	
	</table>
</body>
</html>