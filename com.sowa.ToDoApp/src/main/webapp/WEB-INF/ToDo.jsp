<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="com.sowa.ToDoApp.entities.Task" %>
<%@ page import="com.sowa.ToDoApp.dao.TaskDAO" %>
<%@ page isELIgnored="false" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ToDo</title>
</head>
<body>
	<h1>List of Tasks</h1>
	<table border="1">
		<tr>
			<th>id</th>
			<th>name</th>
			<th>descryption</th>
			<th>date</th>
			<th>DELETE</th>
		</tr>
	<c:forEach var="task" items="${tasks}">
		<tr>
			<td>
				${task.id}
			</td>
			<td>
				${task.name}
			</td>
			<td>
				${task.description}
			</td>
			<td>
				<fmt:formatDate value="${task.date}" dateStyle="short" timeStyle="short" type="both" /> 
			</td>
			<td>
				
			</td>
	</c:forEach>
	</table>
	<a href="AddNewTask">Add task</a>
</body>
</html>