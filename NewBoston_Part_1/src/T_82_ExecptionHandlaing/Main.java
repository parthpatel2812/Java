package T_82_ExecptionHandlaing;
import java.util.Scanner;

public class Main 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		int x =1;
		
		do
		{
			try
			{
				System.out.println("Enter first num:");
				int n1 = s.nextInt();
				
				System.out.println("Enter Second num:");
				int n2 = s.nextInt();
				
				int div = n1/n2;
				System.out.println(div);
				
				x=2;
			}
			catch(Exception e)
			{
				System.out.println("You can't do this.");
			}
		}while(x==1);
	}
}
