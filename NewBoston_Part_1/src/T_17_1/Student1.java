package T_17_1;

public class Student1 
{
	public static void main(String[] args)
	{ 
		Student1 ob1 = new Student1(111,"PARTH");
		Student1 ob2 = new Student1(222,"Urvesh",28);

		ob1.display();
		ob2.display();
	}
	
	
	int id;
	String name;
	int age;
	
	Student1(int i , String n)
	{
		id = i;
		name =n ;
	}
	Student1(int i,String n,int a)
	{
		id = i;
		name = n;
		age = a;
	}

	public void display()
	{
		System.out.println(id +"\t"+ name +"\t"+ age);
	}
}
