<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<h1>Edit Password</h1>
<form action="updatePassword" method="post">
	<br><br>
	<label> Enter Password: </label>
		<input type="password"  name="oldPassword" required/>
		<br> <br>
		<label> New Password: </label>
		<input type="password"  name="newPassword" required/>
		<br> <br>
		<label> Confirm Password: </label>
		<input type="password"  name="newPasswords" required/>
		<br> <br>
	<input type="submit" />
	</form>
</body>
</html>

