<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ToDoApp</title>
</head>
<body>
	<h1>ToDoList</h1>
	<table border="1px">
		<tr>
			<th>x</th>
			<th>v</th>
			<th>Name</th>
            <th>Description</th>
			<th>Date added</th>
		
		</tr>
		<c:forEach var="task" items="${tasks}">
			<tr>
                <td> x </td> 
                <td> v </td>
				<td>${task.name}</td>
                <td>${task.description}</td>
				<td>${task.date}</td>
				
		</c:forEach>
	
	</table>
	<c:url value="/newTask" var="urlNewTask" scope="page" />
	<form action="${urlNewTask}">
		<input type="submit" value="Add New Task">
	</form>
	
</body>
</html>