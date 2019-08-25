package M_HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class Demo5 
{
	public static void main(String[] args) {
		
		Demo5Employee e1 = new Demo5Employee(101,"Parth","Patel");
		Demo5Employee e2 = new Demo5Employee(102,"Kishan","Patel");
		Demo5Employee e3 = new Demo5Employee(103,"Nalin","Makwana");

		HashMap<Demo5Employee,Integer> map = new HashMap<>();
		
		map.put(e1, 1);
		map.put(e2, 2);
		map.put(e3, 1);
		System.out.println(map);
	
	System.out.println(e1);
	System.out.println(e3);
	{
		
	}
	}

}
