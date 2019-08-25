package Collections_Class;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo1 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Raj");
		list.add("John");
		list.add("John");
		System.out.println(list);
		
		String[] array = {"Anita","Parth"};
		
		Collections.addAll(list, array);  // .addAll() method(Add array in to list) 
		
		System.out.println("list + array : "+list);
		
		Collections.sort(list);
		System.out.println("Sortrd List: " +list);
		
		System.out.println("Is Parth there ?: " + Collections.binarySearch(list, "Parth"));
		
		Collections.reverse(list);
		System.out.println("Reverse Liat: "+ list);
		
		Collections.swap(list, 0, 3);
		System.out.println("After swaping: "+list);
		
		System.out.println("# John's: " + Collections.frequency(list, "John"));
		
		Collections.shuffle(list);
		System.out.println("Suffle list: "+list);
		
		System.out.println("Max: "+ Collections.max(list));
		System.out.println("Min: "+ Collections.min(list));
		
		list.removeAll(Collections.singleton("John"));
		System.out.println(list);
		
		Collection<String> unmodifiable = Collections.unmodifiableCollection(list);
		System.out.println("unmodifiable: "+unmodifiable);
		System.out.println("Is Parth there?: " +unmodifiable.contains("Parth"));
		//unmodifiable.add("a");
	}

}
