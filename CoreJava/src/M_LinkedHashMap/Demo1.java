package M_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo1
{
	public static void main(String[] args) 
	{
		Map<String,String> map = new LinkedHashMap<>();
		map.put("a", "A");
		map.put("b", "B");
		map.put("c", "c");
		System.out.println(map);
		
		System.out.println(map.get("a"));
		System.out.println(map.get("a"));
		System.out.println(map.get("a"));
		System.out.println(map);
		
	}

}
