<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
		<c:forEach var="id" items="${task}">
			<tr>
                <td> x </td> 
                <td> v </td>
				<td>${task.name}</td>
                <td>${task.description}</td>
				<td> <fmt:formatDate value="${task.date}" dateStyle="short" timeStyle="short" type="both" /> </td>
				
		</c:forEach>
		
	</table>
	
</body>
</html>