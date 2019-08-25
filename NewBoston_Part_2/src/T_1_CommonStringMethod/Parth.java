package T_1_CommonStringMethod;

public class Parth 
{
	public static void main(String[] args) 
	{
		String[] words = {"parth","urvesh","patel","nalin","sidhant"};
		
		for(String x : words)
			if(x.startsWith("pa"))
				System.out.println(x +" : Starts with pa");
		
		System.out.println();
		
		for(String x : words)
			if(x.endsWith("h"))
				System.out.println(x +" : ends with h");
	}
}
