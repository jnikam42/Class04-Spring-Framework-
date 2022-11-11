<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Data</title>
</head>
<body style="text-align:center; background-color:pink">
<form action="update">
<h2>
<pre>
Student id:-     <input type="hidden" name="sid" value="${data.sid}">

Student name:-   <input type="text" name="sname" value="${data.sname}">

Student Address:-<input type="text" name="addrs" value="${data.addrs}">

Username       :-<input type="text" name="username" value="${data.username}">

Password       :-<input type="text" name="userpass" value="${data.userpass}">

<input type="submit" value="UPDATE" style="background:lightblue">

</h2>
</pre>

</form>
</body>
</html>