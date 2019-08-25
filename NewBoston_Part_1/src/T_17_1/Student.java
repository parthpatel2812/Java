package T_17_1;

public class Student
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(111,"Parth");
		Student s2 = new Student(222,"Urvesh");
		
		s1.display();
		s2.display();
	}
	
	
	
	int id;
	String name;
	
	Student(int i ,String n)
	{
		id = i;
		name = n;
	}

	void display()
	{
		System.out.println(id +"  "+ name);
	}
}
