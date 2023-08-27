<%@page import="com.ps.model.Employee"%>
<%@page import="com.ps.service.EmployeeServiceImpl"%>
<%@page import="com.ps.service.EmployeeService"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit User</title>
</head>
<body>
<%
	Employee employee = new Employee();
%>
<%
	EmployeeService employeeServiceImpl = new EmployeeServiceImpl();
%>
<form method="GET" action='EmployeeController' name="frmEditEmployee">
<input type="hidden" name="action" value="edit" /> <%
 	String uid = request.getParameter("empid");
 	if (!((uid) == null)) {
 		int employeeId = Integer.parseInt(uid);
 		employee=employeeServiceImpl.getDataById(employeeId);
 		
 %>
<table>
	<tr>
		<td>ID</td>
		<td><input type="text" name="empid" readonly="readonly"
			value="<%=employee.getEmpId()%>"></td>
	</tr>
	<tr>
		<td>Name</td>
		<td><input type="text" name="empname"
		
		 value="<%=employee.getEmpName()%>"/></td>
	</tr>
	
		<tr>
		<td>Address</td>
		<td><input type="text" name="empaddress"
		
		 value="<%=employee.getEmpAddress()%>"/></td>
	</tr>
	<tr>
		<td>Email</td>
		<td><input type="text" name="empemail"
		
		 value="<%=employee.getEmpEmail()%>"/></td>
	</tr>
	
	
	<tr>
		<td>Password</td>
		<td><input type="text" name="emppassword" 
		
		value="<%=employee.getEmpPassword()%>"/></td>
	</tr>
	
	<tr>
		<td></td>
		<td><input type="submit" value="Update" /></td>
	</tr>
</table>
<%
	} else
		out.println("ID Not Found");
%>
</form>
</body>
</html>