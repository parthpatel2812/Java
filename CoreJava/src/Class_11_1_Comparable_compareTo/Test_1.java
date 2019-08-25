package Class_11_1_Comparable_compareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_1 
{
	public static void main(String[] args) 
	{
		Student1 s1 = new Student1(105, "Parth", "Patel");
		Student1 s2 = new Student1(100, "Jigar", "Pandya");
		Student1 s3 = new Student1(120, "Nalin", "Patel");
		Student1 s4 = new Student1(104, "Parth", "Shah");
		
		List<Student1> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		list.forEach(System.out::println);
		
		System.out.println();
		
		Collections.sort(list);				// we did sorting of objects,,But we need to implement Comparable<> interface and comparTo() method
		list.forEach(System.out::println);
		
		System.out.println();
		Collections.reverse(list);
		list.forEach(System.out::println);
	}
}
