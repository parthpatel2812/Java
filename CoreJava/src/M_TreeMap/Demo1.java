package M_TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 
{
	public static void main(String[] args) {
		TreeMap<String ,Integer> map = new TreeMap<>();
		map.put("John", 25);
		map.put("Raj", 29);
		map.put("Anita", 23);
		
		System.out.println(map);
		
		System.out.println();
		System.out.println("Iterating using entrySet...");
		Set<Map.Entry<String, Integer>> se = map.entrySet();
		for(Map.Entry<String, Integer> x: se){
		System.out.println("name: "+x.getKey() + " ,Age: "+x.getValue());
		
		if(x.getKey().equals("John"))
			x.setValue(100);
		}
		System.out.println(map);
		
	//	map.floorEntry("Raj").setValue(200);
		
		System.out.println(map);
	}
}
