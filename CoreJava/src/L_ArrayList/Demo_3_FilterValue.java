package L_ArrayList;
import java.util.ArrayList;

public class Demo_3_FilterValue 
{
	public static void main(String args[])
	{
		ArrayList<Integer>  li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(3);
		
		li.forEach(System.out :: print); // we are printing the list
		
		// we are filter the value from list
		   System.out.println();
		   li.forEach(Filter::filter);
	}
}

class Filter
{
	static void filter(Integer i)
	{
		if(i == 3)
		{
			System.out.println(i);
		}
	}
}
	