package T_17_GenericMethod;
import java.util.*;

public class Parth 
{
	public static void main(String[] args)
	{
		Integer[] in = {1,2,3,4};
		Character[] ch = {'b','u','c','y'};
		
		printMe(in);
		

		
		printMe(ch);
	}
	
	public static void printMe(Integer[] i)
	{
		for(Integer x : i)
			System.out.print(x +" ");
	}
	public static void printMe(Character[] i)
	{
		for(Character x : i)
			System.out.print(x +" ");
	}
	

}
