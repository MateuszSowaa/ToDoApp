<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add new task</title>
<link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="formularz">
		<form  method="post">
			<p>Name of task: </p>
			<input type="text" name="name" maxlength="255"  />
			<p>Descryption: </p>
			<textarea rows="9" cols="40" name="desc" ></textarea><br />
			<input id="submit" type="submit" value="add"/>
		</form>
	</div>
	<div id="formularz">
		<a id="link" href="index">Show Task</a>
	</div>
</body>
</html>