<%@page import="com.ps.model.Employee"%>
<%@page import="com.ps.service.EmployeeServiceImpl"%>
<%@page import="com.ps.service.EmployeeService"%>
<%@page import="java.text.SimpleDateFormat"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%@ page import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Employee</title>
</head>
<body>
<%
	//UserBean user = new UserBean();
	EmployeeService employeeServiceImpl = new EmployeeServiceImpl();
	List<Employee> empList=employeeServiceImpl.getAlldata();
	//Iterator<UserBean> itr = userList.iterator();
%>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>address</th>
		<th>email</th>
		<th>password</th>	
		<th>action</th>
	</tr>
	<tr>
		<%
			/*while(itr.hasNext())
			 {
			 System.out.println(user.getId());*/
			for (Employee employee : empList) {
				
		%>
		<td><%=employee.getEmpId()%></td>
		<td><%=employee.getEmpName()%></td>
		<td><%=employee.getEmpAddress()%></td>
		<td><%=employee.getEmpEmail()%></td>
		<td><%=employee.getEmpPassword()%></td>
		
		<td><a
			href="EmployeeController?action=editform&empid=<%=employee.getEmpId()%>">Update</a></td>
		<td><a
			href="EmployeeController?action=delete&empid=<%=employee.getEmpId()%>">Delete</a></td>

	</tr>
	<%
		}
		//}
	%>
</table>
<p><a href="EmployeeController?action=signup">Add</a></p>
</body>
</html>