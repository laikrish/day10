<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fund Transfer</title>
</head>
<body bgcolor="lightcoral">
<img src = "images/icici logo.png" width="150" height="50" align="left"/>


<form action="transferAmount" method="post">
	<br><br>
	<h1>Transfer Fund</h1>
		<label> From Account Number: </label>
		<input type="number" value="${Customer.accountId}" name="fromAcc" readonly>
		<br> <br>
		<label> Enter amount : </label>
		<input type="number"  name="amount">
		<br> <br>
		<label> To Account Number: </label>
		<input type="number" name="toAcc">
		<br> <br>

        <input type="submit" name="Tranfer Fund"/>
</form>
</body>
</html>