package L_LinkList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class L1 
{
	public static void main(String args[])
	{
		
		List<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.forEach(System.out::print);
		System.out.println();
		System.out.println(list);

		list.add(3, 1000);     // we add 1000 on third position(VERY EASY compar to ArrayList)
		System.out.println(list);
		
		list.remove(3);       // we remove element form third position(VERY EASY compar to ArrayList) 
		System.out.println(list);
		
		
		
	}

}
