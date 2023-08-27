package com.ps.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


import com.ps.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private static SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();

	@Override
	public void saveData(Employee employee) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(employee);
		transaction.commit();	
	}

	@Override
	public Employee getDataById(int empId) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Employee employee=(Employee) session.get(Employee.class, empId);
		return employee;
	}

	@Override
	public List<Employee> getAlldata() {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		List<Employee> list=session.createQuery("from Employee").list();
		return list;
	}

	@Override
	public void updateDataById(int empId, Employee employee) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Employee employee1=(Employee) session.get(Employee.class, empId);
		employee1.setEmpName(employee.getEmpName());
		employee1.setEmpAddress(employee.getEmpAddress());
		employee1.setEmpEmail(employee.getEmpEmail());
		employee1.setEmpPassword(employee.getEmpPassword());
		session.save(employee1);
		transaction.commit();
	}

	@Override
	public void deleteDataById(int empId) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Employee employee1=(Employee) session.get(Employee.class, empId);
		session.delete(employee1);
		transaction.commit();
	}

	@Override
	public void deleteAllData() {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		List<Employee> list=session.createQuery("from Employee").list();
	    for(Employee e:list) {
			Transaction transaction=session.beginTransaction();
            session.delete(e);
            transaction.commit();
	    }
	}

	@Override
	public boolean signIn(String empEmail, String empPassword) {
		// TODO Auto-generated method stub
		boolean flag=false;
		Session session=factory.openSession();
		List<Employee> list=session.createQuery("from Employee").list();
		for(Employee e:list) {
			if(e.getEmpEmail().equals(empEmail) && e.getEmpPassword().equals(empPassword)) {
				flag=true;
			}
	    }
		return flag;
	}

}
