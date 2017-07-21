<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ToDoApp</title>
</head>
<body>
	<form method="post">
		<p>Task name:</p>
		<input type="text" name="name" maxlength="255" />
		<p>Task description:</p>
		<textarea rows="9" cols="40" name="description"></textarea><br />
		<input type="submit" value="Add"/>
	</form>
</body>
</html>