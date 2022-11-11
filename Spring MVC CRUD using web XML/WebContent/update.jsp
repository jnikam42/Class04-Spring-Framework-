<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update">
<pre>
Student id:-<input type="hidden" name="rollno" value="${data.rollno}">
Student name:-<input type="text" name="name" value="${data.name}">
Student Address:-<input type="text" name="addrs" value="${data.addrs}">
Username       :-<input type="text" name="user" value="${data.user}">
Password       :-<input type="text" name="pass" value="${data.pass}">
<input type="submit" value="UPDATE" style="background:lightblue">


</pre>

</form>
</body>
</html>