<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>COURSE MANAGEMENT SYSTEM</title>
</head>
<body>
<div>
	<p>VIEW COURSE</p>
	<form action="viewCourse" method="get">
		ID:<input type="text" name="cid"><br>
		<input type="submit" value="VIEW COURSE">
	</form>
</div>
<div>
	<p>VIEW ALL COURSE</p>
	<form action="viewAllCourse" method="get">
		<input type="submit" value="VIEW ALL COURSE">
	</form>
</div>
</body>
</html>