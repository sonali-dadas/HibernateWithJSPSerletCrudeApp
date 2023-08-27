package com.ps.dao;

import java.util.List;

import com.ps.model.Employee;

public interface EmployeeDao {
	
	public void saveData(Employee employee);
	
	public boolean signIn(String empEmail,String empPassword);
	
	public Employee getDataById(int empId);
	
	public List<Employee> getAlldata();
	
	public void updateDataById(int empId,Employee employee);
	
	public void deleteDataById(int empId);
	
	public void deleteAllData();

}
