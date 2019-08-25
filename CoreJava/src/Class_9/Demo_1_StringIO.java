package Class_9;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo_1_StringIO {
	public static void main(String[] args) {
		/*
		 * ArrayList<Integer> myArrayList = new ArrayList<>();
		 * 
		 * myArrayList.add(5); myArrayList.add(10); myArrayList.add(1);
		 * myArrayList.add(1); myArrayList.add(17); myArrayList.add(8);
		 * 
		 * for(Integer x : myArrayList) System.out.println(x);
		 */

		List<Integer> myArrayList = Arrays.asList(new Integer[] { 5, 10, 1, 1, 17, 8 });
		
		for (Integer x : myArrayList)
			System.out.print(x+" ");

//		Integer[] myArray = (Integer[]) myArrayList.toArray();
		Integer[] myArray = myArrayList.toArray(new Integer[myArrayList.size()]);
		
		System.out.println();
		for (Integer x : myArray)
			System.out.print(x+" ");

	}
}
