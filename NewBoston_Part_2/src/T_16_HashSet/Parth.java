package T_16_HashSet;
import java.util.*;

public class Parth 
{
	public static void main(String args[])
	{
		 String[] arr = {"parth", "jigar", "parth" ,"nalin"};
		 List<String> li = Arrays.asList(arr);
		 
		 System.out.println(li);
		 
		 Set<String> se = new HashSet<String>(li);
		 System.out.println(se);		 
	}
}
