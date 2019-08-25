package T_9;
import java.util.Arrays;
import java.util.*;

public class Parth 
{
	public static void main(String[] args) 
	{
		String[] arr ={"y","z","x","b","a"};
		List<String> li1 = Arrays.asList(arr);
		
		Collections.sort(li1);
		System.out.println(li1 + " ");
		
		
		Collections.sort( li1 ,Collections.reverseOrder());
		System.out.println(li1 + " ");
	}

}
