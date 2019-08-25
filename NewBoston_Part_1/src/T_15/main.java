package T_15;
import java.util.Scanner;

class main
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		parth o = new parth();
		
		System.out.println("Enter your name");
		
		String nm = s.nextLine();
		
		o.met(nm);						// we pass the value which goes in met() method
		
	}
}
