<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.cjc.model.Student" %>

<html>
<head>
<script type="text/javascript">
function deletedata() {
	alert("delete ?")
	document.myform.action="delete";
	document.myform.submit();
	
 
	
	
}
function updatedata() {
	alert("update ?")
	document.myform.action="edit";
	document.myform.submit();
	
}
function addata() {
	alert("add data ?")
	document.myform.action="register.jsp";
	document.myform.submit();
	
}
</script>
</head>
<body>
<form name="myform">
<table  border="3" style="background: silver">
<tr bgcolor="yellow">
<td>Select</td>
<td>rollno</td>
<td>name</td>
<td>addrs</td>
<td>password</td>
<td>username</td>
</tr>
<tr>

<c:forEach items="${data}" var="stu">
<td><input type="radio" name="rd" value="${stu.rollno}"></td>
<td><c:out value="${stu.rollno}"></c:out></td>
<td><c:out value="${stu.name }"></c:out></td>
<td><c:out value="${stu.addrs }"></c:out></td>
<td><c:out value="${stu.pass }"></c:out></td>
<td><c:out value="${stu.user}"></c:out></td>
</tr>

</c:forEach>
<tr>

<td><input type="button" value="UPDATE" style="background: green" onclick="updatedata()"></td>

<td><input type="button" value="DELETE" style="background: red"    onclick="deletedata()"></td>
<td><input type="button" value="ADD" style="background: lightblue"    onclick="addata()"></td>

</tr>

</table>
</form>
</body>
</html>
