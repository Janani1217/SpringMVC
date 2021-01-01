<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Response</title>
</head>
<body>
	<h2>User Registered Succesfully !</h2>
	<!-- toString method will be invoked -->
	<%=request.getAttribute("user")%>
</body>
</html>