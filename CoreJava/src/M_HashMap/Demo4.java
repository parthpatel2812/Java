package M_HashMap;

import java.util.HashMap;
import java.util.Map;

import TreeCollection.Main;

public class Demo4 
{
	public static void main(String[] args) {
		
		Map<Integer , String> m = new HashMap<>();
		System.out.println(m.put(101, "raj"));
		System.out.println(m.put(102, "nalin"));
		System.out.println(m.put(101, "parth"));
		
		System.out.println(m);
		System.out.println("Map size: "+m.size());
		
		System.out.println(m.remove(102));
		System.out.println(m);
		m.put(103, "Urvesh");
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		
		
		
	}

}
