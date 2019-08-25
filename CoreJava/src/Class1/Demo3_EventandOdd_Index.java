package Class1;

public class Demo3_EventandOdd_Index
{
	 public static void main(String arg[])
	 {
		 int[] numbers = {0,1,2,3,4,5,6,7,8,9,10};
		 
		 System.out.print("Even: ");
		 for(int i=0; i<numbers.length ; i=i+2)
		 {
			 System.out.print(numbers[i]+" ");
		 }
		 System.out.println();
		 System.out.print("Odd:  ");
		 for(int i=1;i<numbers.length;i = i+2)
		 {
			 System.out.print(+numbers[i] +" ");
		 }
 	 }
}
