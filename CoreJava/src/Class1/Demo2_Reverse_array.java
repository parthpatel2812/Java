package Class1;

import java.util.Scanner;

public class Demo2_Reverse_array 
{
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[5];
		
		System.out.println("Enter Five name I will revese for you :");
		for(int i=0; i<name.length ; i++)
		{
			name[i] = sc.next();
		}
		
		
		
		String[] reversName = new String[5];
	
		
		
		int j = 4;
		for(int i=0 ; i<reversName.length ; i++)
		{
			reversName[i] = name[j];
			j--;
		}
	
		for(String x: reversName)
		{
			System.out.print(x + "  ");
		}
	}	
}
