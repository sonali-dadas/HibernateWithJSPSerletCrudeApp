package com.ps.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.ps.model.Employee;
import com.ps.service.EmployeeService;
import com.ps.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeController
 */
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String INDEX_PAGE = "/index.jsp";

	String SIGNUP_PAGE = "/signup.jsp";

	String SIGNIN_PAGE = "/signin.jsp";

	String WELCOME_PAGE = "/welcome.jsp";

	String EDIT_PAGE = "/edit.jsp";

	EmployeeService employeeServiceImpl = new EmployeeServiceImpl();

	public EmployeeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		String redirect = "";

		String action = request.getParameter("action");

		if (action.equals("signup")) {
			String empName = request.getParameter("empname");

			String empAddress = request.getParameter("empaddress");

			String empEmail = request.getParameter("empemail");

			String empPassword = request.getParameter("emppassword");

			Employee employee = new Employee(empName, empAddress, empEmail, empPassword);
			employeeServiceImpl.saveData(employee);
			System.out.println("sign up sucess");
			redirect = SIGNIN_PAGE;
		} else if (action.equals("signin")) {
			String empEmail = request.getParameter("empemail");
			String empPassword = request.getParameter("emppassword");
			employeeServiceImpl.signIn(empEmail, empPassword);
			System.out.println("sign in sucess");
			redirect = WELCOME_PAGE;
		} else if (action.equals("editform")) {
			redirect = EDIT_PAGE;
		} else if (action.equals("edit")) {
			int empId = Integer.valueOf(request.getParameter("empid"));
			String empName = request.getParameter("empname");

			String empAddress = request.getParameter("empaddress");

			String empEmail = request.getParameter("empemail");

			String empPassword = request.getParameter("emppassword");
			Employee employee = new Employee(empName, empAddress, empEmail, empPassword);
			employeeServiceImpl.updateDataById(empId, employee);
			System.out.println("data updated");
			redirect=WELCOME_PAGE;
		}else if (action.equals("delete")) {
			int empId = Integer.valueOf(request.getParameter("empid"));

			employeeServiceImpl.deleteDataById(empId);
			System.out.println("data deleted ");
			redirect=WELCOME_PAGE;
		}
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(redirect);
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}

}
