package L_ArrayList;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Demo_1 
{
	public static void main(String[] args) 
	{
		
	//	List<int> li = new ArrayList<>();
	//	List<int[]> ll = Arrays.asList(new int[5]); //This is fixed size ArrayList also with primite data type
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(3);
		list1.add(null);
		
		System.out.println("list1 : " + list1);
		System.out.println();
		
		list1.remove(2);
		list1.remove(null);
		System.out.println("list1 : " + list1);
		System.out.println();
		
		list1.add(0, 7);
		System.out.println("list1 : " + list1);
		System.out.println();
		
		list1.set(0, 9);
		System.out.println("list1 : " + list1);
		System.out.println();
		
		
		// Bulk Operatin
		Collection<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(15);
		System.out.println("list2 : " + list2);
		System.out.println();
		
		list1.addAll(list2);
		System.out.println("list1 : " + list1);
		System.out.println();
		
		list1.removeAll(list2);
		System.out.println("list1 : " + list1);
		System.out.println();
		
		list2.add(1);
		System.out.println("list2 : " + list2);
		System.out.println();
		
		list1.retainAll(list2);
		System.out.println("list1 : " + list1);
		System.out.println();
		
		list1.addAll(list2);
		System.out.println("list1 : " + list1);
		System.out.println("list1.set(2,2)  : "  +list1.set(2,2) );
		System.out.println("list1 : " + list1);
		System.out.println();
		
		//Serch 
		
		System.out.println("list1 : " + list1);
		System.out.println("list1.contains(1) : " + list1.contains(1));
		System.out.println("list1.indexOf(1)  : " + list1.indexOf(1));
		System.out.println("list1.lastIndexOf(1) : " + list1.lastIndexOf(1));
		System.out.println("list1 : " + list1);
		System.out.println();

	
		
		//	/*

		
		
//		*/
		
		
	/*
		// RUN THIS CODE BY COMMENT ALL UPER CODE
		//Range-view : sublist(new list is backed by original)

		List<Integer> list1 = new ArrayList<>();
		list1.add(0);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		
		System.out.println("list1 : " + list1);
		System.out.println();
		
		List<Integer> list3 = list1.subList(2,4);
		System.out.println("list1 : " + list1);
		System.out.println("list3 : " + list3);
		System.out.println();
		
		
		list3.set(0, 100);
		System.out.println("list1 : " + list1);
		System.out.println("list3 : " + list3);
		System.out.println();
		
		
		list1.set(3, 200);
		System.out.println("list1 : " + list1);
		System.out.println("list3 : " + list3);
		System.out.println();
		
		list3.add(300);
		System.out.println("list1 : " + list1);
		System.out.println("list3 : " + list3);
	
		
//		list1.add(400);
	//	System.out.println("list1 : " + list1);
//		System.out.println("list3 : " + list3);
		
		
		
		
 //		list1.add(10, 10000);
	//	System.out.println("list1 : " + list1);
	//	System.out.println("list3 : " + list3); 
	*/

	}
}
