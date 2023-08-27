<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  action="EmployeeController" method="get">

<input   type="hidden" name="action"  value="signin">

Employee Email<input   type="text" name="empemail"><br>

Employee Password<input   type="text" name="emppassword"><br>

<input   type="submit" value="signIn"><br>

</form>
</body>
</html>