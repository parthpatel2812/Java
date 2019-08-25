package Class_17_JVM;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo1
{
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		Class c1 = s1.getClass();			// Find that class name by object of that class
		System.out.println(c1.getName());

		Method[] m1 = c1.getDeclaredMethods();// getting all methods and store in array
		for(Method x : m1)
			System.out.println(x);
		
		Field[] f = c1.getDeclaredFields(); 
		for(Field c: f)
			System.out.println(c);
	}

}

class Student
{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}