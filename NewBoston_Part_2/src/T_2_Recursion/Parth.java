package T_2_Recursion;

public class Parth
{	
	public static void main(String[] args) 
	{
	
		System.out.println(fact(5)); //This program finds FACTORIAL
	}
	
	public static long fact(long n)
	{
		if(n<=1)
			return 1;
		else
			return n*fact(n-1);  // calling same method in method
	}
}
