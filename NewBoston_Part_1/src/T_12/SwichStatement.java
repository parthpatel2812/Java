package T_12;
import java.util.Scanner;

public class SwichStatement
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("This progrma tells you what you can do in defferent age");
		
		System.out.println("Enter your AGE :");
		
		int age = s.nextInt();
		
		switch(age)
		{
		case 1:
			System.out.println("Just sleep");
			break;
		
		case 2:
			System.out.println("You can EAT");
			break;
		
		case 3:
			System.out.println("you can Wlake");
			break;
		default:
			System.out.println("YOU can do anything");
		}
		
		
		
		
	}

}
