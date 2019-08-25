package L_LinkList;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class L2 
{
	public static void main(String[] args) 
	{
		List<Integer> id = new LinkedList<>();
		id.add(1);
		id.add(2);
		id.add(1);
		
		System.out.println(id);
		
		Set<Integer> id1 = new LinkedHashSet<>(id);
		System.out.println(id1);
 	}
}
