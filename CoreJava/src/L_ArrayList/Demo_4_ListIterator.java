package L_ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo_4_ListIterator 
{
	public static void main(String args[])
	{
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list);
		ListIterator<String> iterator = list.listIterator();
		
		System.out.println();
		while(iterator.hasNext()){
			if(iterator.nextIndex() == 2){iterator.add("best");}
			iterator.next();
		}
		list.forEach(System.out::println);
		
	// we also can remove , and set..
		
		
	}

}
