package Class_14_equal_hashCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

public class Demo2 
{
	public static void main(String[] args) {
		
		Student s1 = new Student("Parth",10);
		Student s2 = new Student("Nalin",20);
		Student s3 = new Student("Nalin",20);
		Student s4 = new Student("Jigar",30);
		Student s5 = new Student("Parth",10);
		
		
		Map<Student,Integer> map1 = new HashMap<>();
		map1.put(s1, 10);
		map1.put(s2, 20);
		map1.put(s3,20);
		map1.put(s4,30);
		//map1.put(s5, 10);
		
System.out.println(map1.get(s5));
		

		Set<Entry<Student, Integer>> mappings = map1.entrySet();
		for(Entry<Student, Integer> mapping : mappings){
			System.out.println("Name: "+ mapping.getKey() + ", Age: "+ mapping.getValue());
		
		
		
	/*		
		Student s1 = new Student("Parth");
		Student s2 = new Student("Nalin");
		Student s3 = new Student("Nalin");
		Student s4 = new Student("Jigar");
		Student s5 = new Student("Parth");
		
		Set<Student> set = new LinkedHashSet<>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		
		set.forEach(System.out::println);
	*/	
		
		
		
	}
	}
}

