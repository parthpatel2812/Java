package T_14;

public class Class1 
{
	public static void main(String args[])
	{
	Class1 ob = new Class1(); // create Object of Class1
	
	ob.p();     			// Call the method P() in main method
	}
	
	public void p()
	{
		Class2 ObOfclass2 = new Class2(); // create Object of Class2
		Class3 ObOfclass3 = new Class3(); // create Object of Class3
		
		ObOfclass2.methodOfClass2();  // Call the Class2 method
		ObOfclass3.methodOfClass3();  // Call the Class3 method
	}
}
