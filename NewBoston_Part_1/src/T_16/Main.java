package T_16;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in); 
		A objA = new A();
		
		System.out.println("Entr your first GF name:");
		
		String gfname = s.nextLine();
		
		objA.setName(gfname);
		
		objA.PrintGFname();
		
	}
	

}
