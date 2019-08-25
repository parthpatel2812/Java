package M_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo3 
{
	public static void main(String[] args) {
		System.out.println("Inside immutableKeysDemo...");
		List<Integer> list = new ArrayList<>();
		list.add(1);
		
		Map<List<Integer>, Integer> map = new HashMap<>();
		map.put(list, 1);
		
		list.add(2);
		System.out.println(map.get(list));
		
		
		
	}

}
