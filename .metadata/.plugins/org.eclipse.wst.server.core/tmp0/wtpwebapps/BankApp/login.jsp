<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<form action="login" method="post">
<body bgcolor="cyan" style="text-align:center" >
 
 <img src = "images/icici logo.png" width="150" height="50" align="left"/>


	<h1>Login to your account</h1>
	
	<br><br>
		<label> Customer Email: </label> 
		<input type="text" name="email" required /> 
		<br> <br>
		<label> Password: </label> 
		<input type="password" name="password" size="10" required /> 
		<br> <br>
		<input type="submit" name="login">
		<br> <br>

<%@ include file = "footer.jsp" %>

</body>
</html>