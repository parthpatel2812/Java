package Class_11_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo_2
{
	public static void main(String[] args) {
		
		/*Course c1 = new Course(10);
		System.out.println(c1);
	
		ArrayList<Integer> is = new ArrayList<>();
		Collections.synchronizedCollection(is); // Collections.synchronizedCollection(); :We can synchronize 
		
		*/
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(1);
		list.add(2);
		list.add(20);
		list.add(15);
		list.add(7);
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		
		
	}

}
