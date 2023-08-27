<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration form</title>
</head>
<body>
<form  action="EmployeeController" method="get">

<input   type="hidden" name="action"  value="signup">

Employee Name<input   type="text" name="empname"><br>

Employee Address<input   type="text" name="empaddress"><br>

Employee Email<input   type="text" name="empemail"><br>

Employee Password<input   type="text" name="emppassword"><br>

<input   type="submit" value="signUp"><br>

</form>
</body>
</html>