package T_12;
import java.util.*;

public class Parth 
{
	public static void main(String[] args) 
	{
		// convert arrray to list
		String[] ary = {"apple" , "beef", "corn" , "ham"};
		List<String> li = Arrays.asList(ary);
		
		ArrayList<String> li2 = new ArrayList<String>();
		li2.add("youtube");
		li2.add("google");
		li2.add("digg");
		
		for(String x : li2)
			System.out.print(x + " ");
		
		Collections.addAll(li2, ary); // add first array in to li2
		
		System.out.println();
		for(String x : li2)
			System.out.print(x +" ");
		
		
	}
}
