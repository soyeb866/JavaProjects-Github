<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>From Submission</title>
</head>
<body>
	Please Enter Your Information:
	<hr>
	<p />		
	<form:form action="displayInfo" modelAttribute="person">
		Name: <form:input path="name"/>
		<p />
		Age: <form:input path="age"/>
		<p />
		Email: <form:input path="email"/>
		<p />
		<input type="submit" value="Submit">
	</form:form>
	
</body>
</html>