package T_4_Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class linkedlist 
{
	public static void main(String[] args) 
	{
		String[] arr1 = {"parth" , "jiger" , "nalin" , "atit" , "rippal" };
		List<String> li1 = new LinkedList<String>();
		
		for(String x : arr1)
			li1.add(x);
		
		String[] arr2 = {"nisha","abc","xyz","prq" };
		List<String> li2 = new LinkedList<String>();
	
		for(String y : arr2)
			li2.add(y);
		
		li1.addAll(li2);
		li2 = null;
		
		printMe(li1);          //printing the list element
		removeStuff(li1,1,4);  // removing the element form list
		printMe(li1);
		reverseMe(li1);			// place elements in to reverse order
	}
	
	// printMe method
	
	private static void printMe(List<String> l)
	{
		for(String b : l)
			System.out.printf("%s  ", b);
		System.out.println();
	}
	
	// removeStuff methos
	 private static void removeStuff(List<String> l , int form ,int to)
	 {
		l.subList(form, to).clear();
	 }
	 //reversMe
	 private static void reverseMe(List<String> l)
	 {
		 ListIterator<String> par = l.listIterator(l.size());
		 while(par.hasPrevious())
			 System.out.print(par.previous() +" ");
			 
			// System.out.printf(" %s ", par.previous());
	 }
	
	
	
	
}
