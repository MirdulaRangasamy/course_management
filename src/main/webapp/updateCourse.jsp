<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>COURSE MANAGEMENT SYSTEM</title>
</head>
<body>
<div align="center">
	<p>UPDATE COURSE</p>
	<form action="updateCourse" method="get">
		ID:<input type="text" name="cid"><br>
		NAME:<input type="text" name="cname"><br>
		DURATION:<input type="text" name="duration"><br>
		CREDIT:<input type="text" name="credit"><br>
		<input type="submit" value="UPDATE COURSE">
	</form>
</div>
</body>
</html>