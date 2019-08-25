package org.learn.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.learn.hibernate.datasource.DataSource;
import org.learn.hibernate.domain.Employee;
import org.learn.hibernate.domain.Store;

public class HibernateApplication {

	public static void main(String[] args) {

		Session session = DataSource.getSessionFactory().openSession();
		session.getTransaction().begin();

//		Store store = new Store("Wallmart" , "Greenbelt, MD");
//		Employee e1 = new Employee("John Doe");
//		Employee e2 = new Employee("PArth PAtel");
//
//		List<Employee> emps = new ArrayList<>();
//		emps.add(e1);
//		emps.add(e2);
//		
//	//	e1.setStore(store);
//	//	e2.setStore(store);
//		
//		store.setEmployee(emps);
//		
//		session.delete(store);
//	//	session.save(e1);
//	//	session.save(e2);

		// List<Store> stores = session.createQuery("FROM
		// Store",Store.class).getResultList();

		/*
		 * for(Store s : stores) { System.out.println(s.getId() +"  "+s.getName() +" "+
		 * s.getLocation());
		 * 
		 * for(Employee e : s.getEmployee()) { System.out.println("  "+
		 * e.getId()+"  "+e.getName()); } }
		 */

		/*
		 * System.out.println(stores.get(1).getId());
		 * System.out.println(stores.get(1).getEmployee().get(0).getName());
		 */

		// Employee e = session.createQuery("FROM Employee Where id=2" ,
		// Employee.class).getSingleResult();
		// System.out.println(e.getName() + " :: "+ e.getStore().getName());

		/*
		 * List<Store> listOfStore = session.createNamedQuery("selectAll",
		 * Store.class).getResultList();
		 * 
		 * for(Store s : listOfStore) { System.out.println(s.getName() +" "+
		 * s.getLocation()); }
		 */

		
		  List<Store> ss = session.createNamedStoredProcedureQuery("selectAll").getResultList();
		  
		
		StoredProcedureQuery query = session.createNamedStoredProcedureQuery("selectAll");
	
		  for (Store s : ss) { System.out.println(s.getName() + " " + s.getLocation());
		  }
		 

		// StoredProcedureQuery query = session.createNamedQuery("selectAll" ,
		// Store.class);

		session.getTransaction().commit();
		session.close();
		DataSource.closeSessionFactory();

	}

}
