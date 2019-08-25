package T_4_Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class arraylist
{
	public static void main(String[] args) 
	{	
		String[] ar1 = {"parth","urvesh","atit","jigar","nalin","rippal" };
		List<String> li1 = new ArrayList<String>();
	
		//add array items to list
		for(String x : ar1)
			li1.add(x);
		
		String[] ar2 = {"urvesh","atit","jigar" };
		List<String> li2 = new ArrayList<String>();
	
		//add array items to list
		for(String x : ar2)
			li2.add(x);
		
		// print first list li1
		for(int i =0;i<li1.size();i++)
			System.out.printf("%s ", li1.get(i));
		System.out.println();
		
		// print second list li2
		for(int i =0;i<li2.size();i++)
			System.out.printf("%s ", li2.get(i));
		
		
		
		
		editlist(li1,li2);   // call method which delete same name from list1 and list2
		System.out.println();
		
		// print first list li1
		for(int i =0;i<li1.size();i++)
			System.out.printf("%s ", li1.get(i));
		System.out.println();
	}
	
	public static void editlist(Collection<String> l1, Collection<String> l2)
	{
		Iterator<String> it = l1.iterator(); // 
		
		while(it.hasNext())
		{
			if(l2.contains(it.next()))
				it.remove();
		}
	}
	
	
}
