package Class_18_Java8_feature;

public class AuonymousInnerClass1 
{
	public static void main(String[] args) 
	{
	
		
		A ob1 = new A() 			// if you wanna cheng the implementations of method you can do this way
				{
					public void method1()  // overided metohod of class A
					{
						 System.out.println("I am form class'AuonymousInnerClass' method1().");
					}
					
					 public void method2()
					 {
						 System.out.println("I am form class 'AuonymousInnerClass method2().");
					 }
					 
				};
				
		ob1.method1();	
		ob1.method2();
		ob1.method3();
	}
}

class A{

 public void method1()
 {
	 System.out.println("I am form class'AAAA' method1().");
 }
 
 public void method2()
 {
	 System.out.println("I am form class'AAAA' method2().");
 }

 public void method3()
 {
	 System.out.println("I am form class 'AAAA' method3().");
 }
}
