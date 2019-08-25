package Class_13_Lemada_Expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {



		Employee e1 = new Employee(199, "Parth");
		Employee e2 = new Employee(150, "Darth");
		Employee e3 = new Employee(100, "Aarth");
		Employee e4 = new Employee(156, "Aarth");
		Employee e5 = new Employee(120, "Zarth");
		Employee e6 = new Employee(103, "Xarth");
		Employee e7 = new Employee(190, "Aarth");

		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);

	
			Collections.sort(list,
					(o1,o2) -> 
							o1.getEmpNmae().compareTo(o2.getEmpNmae()) == 0 ? 											//compare name and if name are same	
									o1.getEmpId().compareTo(o2.getEmpId()) : o1.getEmpNmae().compareTo(o2.getEmpNmae()) //then compare the id of same name employee
									
					);

			list.forEach(System.out::println);
		

		}
	}

