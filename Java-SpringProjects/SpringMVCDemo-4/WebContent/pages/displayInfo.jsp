<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Info</title>
</head>
<body>


<table border="1">
<tr>
<th>Name</th><th>Age</th><th>Email</th>
</tr>
<tr><td>${person.name}</td><td>${person.age}</td><td>${person.email}</td></tr>
</table>


</body>
</html>