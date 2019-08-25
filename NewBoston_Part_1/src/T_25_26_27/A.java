package T_25_26_27;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
	
		// First WAY
		int a[] = new int[5]; 
		
		a[0] = 1;
		a[1] = 5;
		a[2] = 3;
		a[3] = 98;
		a[4] = 100;
		
		System.out.println("FIRST WAY");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		// SECOND WAY
		System.out.println("\nSECOND WAY");
		
		Scanner s = new Scanner(System.in);
		int b[] = new int[5];
		

		 System.out.println("Enter "+b.length +" Numbers : ");
		for(int i = 0 ;i<b.length;i++)
		{
		b[i] = s.nextInt();
		}
		for(int i = 0 ;i<b.length;i++)
		{
		System.out.print(b[i] +" ,");
		}
		
		//THIRD WAY
		System.out.println("\n\nTHIRD WAY");
		
		int c[] = {54,65,86,53,65};
		
		System.out.println(c[0] +" "+ c[3]);
		
		
	
		
		
	}
}
