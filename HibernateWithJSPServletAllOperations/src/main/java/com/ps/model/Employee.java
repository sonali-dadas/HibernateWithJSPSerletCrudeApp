package com.ps.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import jakarta.annotation.Generated;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	
	private int empId;
	
	private String empName;
	
	private String empAddress;
	
	private String empEmail;
	
	private String empPassword;
	
	

	public Employee(String empName, String empAddress, String empEmail, String empPassword) {
		this.empName = empName;
		this.empAddress = empAddress;
		this.empEmail = empEmail;
		this.empPassword = empPassword;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	public Employee() {
		super();
	}
	
	

}
