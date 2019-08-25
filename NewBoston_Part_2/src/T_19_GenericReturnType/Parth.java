package T_19_GenericReturnType;
import java.util.*;

public class Parth
{
	public static void main(String[] args) 
	{
		System.out.println(max(23,46,24));
		System.out.println(max("parth", "urvesh","nalin"));
		
	}
	
	public static <T extends Comparable<T>> T max(T a, T b, T c)
	{
		T max = a;
		
		if(b.compareTo(a) > 0)
			max =b;
		
		if(c.compareTo(max)>0)
			max = c;
		
		return max;
	}
}
