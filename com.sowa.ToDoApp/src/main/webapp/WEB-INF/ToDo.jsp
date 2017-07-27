<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.sowa.ToDoApp.entities.Task" %>
<%@ page import="com.sowa.ToDoApp.dao.TaskDAO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ToDo</title>
</head>
<body>
	<h1>List of Tasks</h1>
	<% List<Task> lista = (List<Task>)request.getAttribute("tasks");
	for(Task x : lista)
	out.print( x.getId() +" "  + x.getName()+ " " + x.getDescription() + "<br>");
	
	%>
 
	
</body>
</html>