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
	<form action="displayInfo" method="Post">
		Name: <input type="text" name="name">
		<p />
		Age: <input type="text" name="age">
		<p />
		Email: <input type="text" name="email">
		<p />
		<input type="submit" value="Submit">
	</form>
	<%-- <form:form>
		<tr>
			<td>Name: <form:input path="" /> <form:errors></form:errors>
			</td>
		</tr>
		<tr>
			<td>Age: <form:input path="" /> <form:errors></form:errors>
			</td>
		</tr>
		<tr>
			<td>Email: <form:input path="" /> <form:errors></form:errors>
			</td>
		</tr>
	</form:form> --%>


</body>
</html>