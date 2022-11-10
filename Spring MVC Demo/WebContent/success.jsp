<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.tech.Model.Student"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function updateData()
{
	alert("Do you want to Update Record?")
	document.myform.action="edit";
	document.myform.submit();
}

function deleteData()
{
	alert("Do you want to DELETE Record?")
	document.myform.action="delete";
	document.myform.submit();
}

function addData()
{
	alert("Do you want to Add New  Record?")
	document.myform.action="add";
	document.myform.submit();
}



</script>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<form action="myform">
<table border="3" style="background: skyblue">
<tr bgcolor="yellow">
<td>Select</td>
<td>Sid</td>
<td>sname</td>
<td>Addrs</td>
<td>password</td>
<td>username</td>
</tr>
<tr>

<c:forEach items="${data}" var="stu">
<td><input type="radio" name="rd" value="${stu.sid}"></td>
<td><c:out value="${stu.sid}"></c:out></td>
<td><c:out value="${stu.sname}"></c:out></td>
<td><c:out value="${stu.addrs}"></c:out></td>
<td><c:out value="${stu.username}"></c:out></td>
<td><c:out value="${stu.userpass}"></c:out></td>
</tr>

</c:forEach>
<tr>
</table>
<tr>
<td> <input type="button" value="UPDATE" style="background: lightgreen" onclick="updateData()"></td>
<td> <input type="button" value="DELETE" style="background: red" onclick="deleteData()"></td>
<td> <input type="button" value="ADD" style="background: skyblue" onclick="addData()"></td>
</tr>
</form>
</body>
</html>

