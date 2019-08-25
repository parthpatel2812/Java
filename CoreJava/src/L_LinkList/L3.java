package L_LinkList;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import TreeCollection.Main;

public class L3 
{
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "PARTH");
		Employee e2 = new Employee(2, "PRASHANT");
		Employee e3 = new Employee(1, "PARTH");
		
		List<Employee> employee = new LinkedList<>();
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		System.out.println(employee);
		
		Set<Employee> newEmployee = new LinkedHashSet<>(employee);
		
		List<Employee> Newemployee = new LinkedList<>(newEmployee);

		for(Employee e: Newemployee)
		{
			System.out.println(e.getId() +" "+e.getName());
		}
	}	
}

class Employee
{
	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}



	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	
	
	
}