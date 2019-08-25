package L_ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import org.omg.Messaging.SyncScopeHelper;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo_2
{
	public static void main(String[] args)
		{
			ArrayList<Integer>  li = new ArrayList<>();
			li.add(1);
 			li.add(2);
			li.add(3);
			li.add(4);
			li.add(5);
			li.add(3);
		
			// Iterator (supports: hasNext, next,remove)
			Iterator<Integer> ite = li.iterator();
			while(ite.hasNext())
			{
				System.out.print(ite.next() + " ");
			}
			System.out.print(" :Iterate by using Iterator");
			System.out.println();
			
			//ListIterator(suport: hasNext, next, remove, hasPrevious, previous, add)
			ListIterator<Integer> ite1 = li.listIterator();
			while(ite1.hasNext())
			{
				System.out.print(ite1.next() + " ");
			}
			System.out.print(" :Iterate by using ListIterator");
			
			
			// another way to print( forEach() method)
			   System.out.println();
			   li.forEach(System.out::print);
			
			
			System.out.println();
			//We remove one element form list
			System.out.println();
			Iterator<Integer> ite11 = li.iterator();
			while(ite11.hasNext())
			{
				int element = ite11.next();
				
				if(element == 1)
				{
					ite11.remove();  // for use remove() method we need to call next() method first. 
 					
				}
				System.out.println("element :" + element);
				
			}
		   System.out.println(li);	
		   
		   
		   
		   
	}

}




