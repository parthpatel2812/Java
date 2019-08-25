package T_15_1;
import java.util.Scanner;

public class main 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		Calculator ob = new Calculator();
		
		System.out.println("Enter Two Numbers : ");
		
		int a = s.nextInt();
		int b = s.nextInt();
	
		ob.oprationd(a, b);
		
	}

}
