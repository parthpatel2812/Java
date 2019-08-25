package Class_11_Collection;

import java.util.ArrayList;

public class Demo_1
{
	public static void main(String[] args) {
		
		int x = 21;		// use less memory ,take less time
		Integer x1 = 21; // use more memory,take more time 
		
		ArrayList<Integer> integerList = new ArrayList<>();
		integerList.add(new Integer(20));
		integerList.add(56);
		
		integerList.forEach(i-> System.out.println(i));
		
		integerList.forEach(System.out::println);
		
	}

}
