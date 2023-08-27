package com.ps.service;

import java.util.List;
import com.ps.dao.EmployeeDao;
import com.ps.dao.EmployeeDaoImpl;
import com.ps.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	
	EmployeeDao employeeDaoImpl=new EmployeeDaoImpl();

	@Override
	public void saveData(Employee employee) {
		// TODO Auto-generated method stub
		employeeDaoImpl.saveData(employee);
	}

	@Override
	public boolean signIn(String empEmail, String empPassword) {
		// TODO Auto-generated method stub
		return employeeDaoImpl.signIn(empEmail, empPassword);
	}

	@Override
	public Employee getDataById(int empId) {
		// TODO Auto-generated method stub
		return employeeDaoImpl.getDataById(empId);
	}

	@Override
	public List<Employee> getAlldata() {
		// TODO Auto-generated method stub
		return employeeDaoImpl.getAlldata();
	}

	@Override
	public void updateDataById(int empId, Employee employee) {
		// TODO Auto-generated method stub
		employeeDaoImpl.updateDataById(empId, employee);
	}

	@Override
	public void deleteDataById(int empId) {
		// TODO Auto-generated method stub
		employeeDaoImpl.deleteDataById(empId);
	}

	@Override
	public void deleteAllData() {
		// TODO Auto-generated method stub
		employeeDaoImpl.deleteAllData();
	}

}
