package Class_11_1_Comparable_compareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_HW 
{
	//private static Employee e1;

	public static void main(String[] args) {
		
		
	/*	
		Employee e1 = new Employee("C",new Department("C"));
		Employee e2 = new Employee("X",new Department("E"));
		Employee e3 = new Employee("Z",new Department("B"));
		Employee e4 = new Employee("A",new Department("C"));
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Collections.sort(list);
		
		list.forEach(System.out::println);*/
		
		Employee e1 = new Employee("Z","A",10,new Department("C",20,34545));
		Employee e2 = new Employee("X","A",10,new Department("C",20,34545));
		Employee e3 = new Employee("Z","A",10,new Department("E",20,34545));
		Employee e4 = new Employee("Z","A",10,new Department("I",20,34545));
		Employee e5 = new Employee("A","A",10,new Department("C",20,34545));
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		Collections.sort(list);
		
		list.forEach(System.out::println);
	}
}
