package Class_15_hashcode_equal;

import java.util.Set;
import java.util.TreeSet;

 class Application2 {
	public static void main(String[] args) {
		
		
		Employee e1 = new Employee(18, "John");
		Employee e2 = new Employee(7, "Luke");
		Employee e3 = new Employee(16, "Tom");
		Employee e4 = new Employee(15, "Parth");
		Employee e5 = new Employee(16, "Tom");
		Employee e6 = new Employee(15, "Parth");
		
/*		HashMap<Employee,Employee> emp = new HashMap<>(10);
		emp.put( e1, e1);
		emp.put( e2, e2);
		emp.put( e3, e3);
		emp.put( e4, e4);
		emp.put( e5, e5);
		emp.put( e6, e6);
		
		emp.entrySet().forEach(x -> System.out.println(x.getKey() +":"+ x.getValue()));*/
		
		Set<Employee> set = new TreeSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		
		set.forEach(System.out::println);
		
	}

}
