package T_13_Frequency_Disjoin;
import java.util.*;

public class Parth 
{
	public static void main(String[] args) 
	{
		// convert arrray to list
		String[] ary = {"apple" , "beef", "corn" , "ham" , "digg"};
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
		
		
		System.out.println();
		System.out.println();
		System.out.println("Frequency of 'digg' in list :");
		System.out.println(Collections.frequency(li2, "digg"));// check the frequency of eliment in list
		
		System.out.println();
		boolean boo = Collections.disjoint(li, li2); // check li and li2  if any elenent is comman in two lists
		System.out.println(boo);
		
		if(boo)
			System.out.println("these list do not have anythign in common");
		else
			System.out.println("These list must have somthing in common");
		
	}
}
