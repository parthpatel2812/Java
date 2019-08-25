package Class_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee e1 = new Employee(199, "Parth");
		Employee e2 = new Employee(150, "Darth");
		Employee e3 = new Employee(100, "Carth");
		Employee e4 = new Employee(156, "Aarth");
		Employee e5 = new Employee(100, "Zarth");
		Employee e6 = new Employee(103, "Xarth");
		Employee e7 = new Employee(100, "Yarth");

		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);

		System.out.println("If you Enter '1' list will  compare by empId");
		System.out.println("If you Enter '2' list will  compare by empName");

		int input = sc.nextInt();

		switch (input) {
		case 1:
			Collections.sort(list, new Comparator<Employee>() 
			{

				@Override
				public int compare(Employee o1, Employee o2) {
					return o1.getEmpId().compareTo(o2.getEmpId());
				}
			});

			list.forEach(System.out::println);
			break;

		case 2:
			Collections.sort(list, new Comparator<Employee>() {

				@Override
				public int compare(Employee o1, Employee o2) {

					return o1.getEmpNmae().compareTo(o2.getEmpNmae());
				}
			});

			list.forEach(System.out::println);
			break;
		}
	}
}
