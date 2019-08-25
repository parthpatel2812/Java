package T_21;
import java.util.Scanner;

public class FinfAverage {
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		int total = 0,count;
		count = 0;
		
		System.out.println("Enter 10 numbes");
		while(count<10)
		{
			int a = s.nextInt();
			total = a+total;
			count++;
		}
		
		double avg = total/10;
		
		System.out.println("Average of those 10 number is : "+avg);
		
		
	
		
	}
}
