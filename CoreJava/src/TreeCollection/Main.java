package TreeCollection;

import java.util.TreeSet;

public class Main
{
	public static void main (String args[])
	{
		Employee e1 = new Employee(1,"PARTH");
		Employee e2 = new Employee(4,"PRASHANT");
		Employee e3 = new Employee(5,"JIGAR");
		Employee e4 = new Employee(2,"NALIN");
		Employee e5 = new Employee(3,"Anli");
		
		TreeSet<Employee> ob = new TreeSet<Employee>();
		ob.add(e1);
		ob.add(e2);
		ob.add(e3);
		ob.add(e4);
		ob.add(e5);
		
		for(Employee s: ob)
			System.out.println(s.getName() +" "+ s.getId());
		
		
	}

}



 class Employee implements Comparable<Employee>
{
	private Integer id;
	private String name;
	
	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
		}

	@Override                           // By using compareTo() you can srot by value to
	public int compareTo(Employee o) {
	return this.name.compareTo(o.getName());
	}
	
	
/*
	@Override
	public int compareTo(Employee o) {
	return this.id.compareTo(o.getId());
	}
*/
}
