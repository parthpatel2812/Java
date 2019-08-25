package S_TreeSet;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Demo3 
{
	public static void main(String[] args) {
		NavigableSet<Integer> set = new TreeSet<>();
		set.add(5);
		set.add(23);
		set.add(74);
		set.add(89);
	
		System.out.println(set);
		
		System.out.println("lower " + set.lower(74));
		System.out.println("floor " + set.floor(74));
		System.out.println("ceiling " + set.ceiling(74));
		System.out.println("higher " + set.higher(74));
		System.out.println("first " + set.first());
		System.out.println("last " + set.last());
		
		NavigableSet<Integer> desendingset = set.descendingSet();
		System.out.println("descendingSet :"+desendingset);

		//headSet
		NavigableSet<Integer> headSet = set.headSet(74,true);
		System.out.println("headSet :" + headSet);
		headSet.add(6);
		System.out.println("headSet "+ headSet);
		System.out.println("set :"+set);
	//	headSet.add(75);
		
		//subSet
		SortedSet<Integer> subSet = set.subSet(5 , 74);
		//subSet.add(2)
		
		set.add(25);
		System.out.println("subSet : " +subSet);
		
		
		
		
	}

}
