package org.learn.hibernate;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.learn.hibernate.dao.EmployeeDao;
import org.learn.hibernate.dao.impl.EmployeeDaoImpl;
import org.learn.hibernate.datasource.DataSource;
import org.learn.hibernate.domain.Employee;



public class HibernateApplication {

	public static void main(String[] args) {

	EmployeeDao employeeDao = new EmployeeDaoImpl();
	List<Employee> employees = employeeDao.findAll();
	
/*	for(Employee e : employees)
	{
		System.out.println(e);
	} */
	

	
	Employee employee = new Employee("Arian Sojkds");
	
	//employeeDao.insert(employee);
//	employeeDao.delet(3);
	employeeDao.findAll().forEach(e -> System.out.println(e));
	
	DataSource.closeSessionFactory();
	
	}

}
