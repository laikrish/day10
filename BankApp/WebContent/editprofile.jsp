<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Profile Page</title>
<%@ include file="header.jsp" %>
</head>
<body bgcolour="pink" style="text-align:left">
<br>
<h1>Edit Details</h1>
<form action="editProfile" method="post">
	<br><br>
	<label> Customer Id: </label>
		<input type="number" value="${Customer.customerId}" name="customerId" readonly/>
		<br> <br>
		<label> Customer Name: </label>
		<input type="text" placeholder="${Customer.customerName}" name="customerName" required/>
		<br> <br>
		<label> Customer Password: </label>
		<input type="password" value="${Customer.password}" name="password" readonly/>
		<br> <br>
		  <label> Customer Email: </label>
		<input type="text" placeholder="${Customer.email}" name="email" required/>
		<br> <br>
	    <label> Customer Address: </label>
		<input type="text" placeholder="${Customer.address}" name="address" required/>
		<br> <br>
	    <label> Customer DOB: </label>
		<input type="date"placeholder="${Customer.dateOfBirth}" name="dob"  required/>
	    <br> <br><br>
	<input type="submit" value="Edit"/>
	</form>
</body>
</html>