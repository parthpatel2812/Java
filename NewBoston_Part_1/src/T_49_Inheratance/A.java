package T_49_Inheratance;

class A extends B
{
	public static void main(String args[])
	{
		A ob = new A();
		B Bob = new B();
		C Cob = new C();
		
		ob.method();
		Bob.method();
		Cob.method();
	}
}
