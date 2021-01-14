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
	Date: ${date}
	<p/>
	Show User Info 
	<hr>
	<%-- <p/>
Name: <%= request.getAttribute("name") %>
<p/>
Age: <%= request.getAttribute("age") %>
<p/>
Email Address: <%= request.getAttribute("email") %>
<p/> --%>

	<p />
	Name: ${name}
	<p />
	Age: ${age}
	<p />
	Email Address: ${email}
	<p />
	<hr>
	Team Member:
	<p />
	<c:forEach items="${team}" var="teamMember">
		<br>${teamMember}
	</c:forEach>
	<%-- Team: ${team} --%>
</body>
</html>