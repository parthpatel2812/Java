package T_8_ListToArray;
import java.util.Arrays;
import java.util.LinkedList;

public class parth 
{
	public static void main(String[] args)
	{
		String[] arr = {"parth","nalin","urvesh","jigar","ripple","masud"};
		LinkedList<String> li = new LinkedList<String>(Arrays.asList(arr));  //we create list and store array elements in list
		
		li.add("MUKESH");      // add value to list
		li.addFirst("VINOD");  // add value to first position in list
		 
		
		arr = li.toArray(new String[li.size()]); //cnovert list in to array
		
		for(String x :arr)
			System.out.print(" "+ x);
	}

}
