package T_38;

public class main 
{
	public static void main(String args[])
	{
		A ob = new A();
		
		System.out.println(ob.display());
		
		ob.setVariable(0, 0, 0);
		
		System.out.println(ob.display());
	}

}
