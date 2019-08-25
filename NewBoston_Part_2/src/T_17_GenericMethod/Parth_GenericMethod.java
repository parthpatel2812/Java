package T_17_GenericMethod;


public class Parth_GenericMethod 
{
	public static void main(String[] args)
	{
		Integer[] in = {1,2,3,4};
		Character[] ch = {'b','u','c','y'};
		String[] st = {"ABC","XYZ","PQR","MAN"};
		
		
		printMe(in);
		printMe(ch);
		printMe(st);
	}
	
	// generic method (The method which can take any type of data) 	
	public static <T> void printMe(T[] x)
	{
		for(T p : x)
			System.out.print(p + " ");
		
		System.out.println();
	}
}
