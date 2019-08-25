package Class_11_1_Comparable_compareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {

	public static void main(String[] args) 
	{
		Student2 s1 = new Student2(117, "Aarth");
		Student2 s2 = new Student2(100, "Xigar");
		Student2 s3 = new Student2(120, "Zalin");
		Student2 s4 = new Student2(104, "Aarth");
		Student2 s5 = new Student2(105, "Parth");
		Student2 s6 = new Student2(102, "Aarth");
		
		List<Student2> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		
		Collections.sort(list); // we sorted list by First Name.
		list.forEach(System.out::println);	
	}

}
