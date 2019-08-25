package M_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Demo2_NestedMap
{
	public static void main(String[] args) 
	{/*
		Map<String, Integer> map1 = new HashMap<>();
		
		map1.put("John", 25);
		map1.put("Raj", 29);
		map1.put("Anita", 23);
		*/
		
		Map<String , Map<String, Object>> userProfile = new HashMap<>();
		
		Map<String, Object> profile = new HashMap<>();
		profile.put("age", 29);
		profile.put("dept", "CS");
		profile.put("city", "New York");
		userProfile.put("Parth", profile);
	//	System.out.println(userProfile);
		
		profile = new HashMap<>();
		profile.put("age", 25);
		profile.put("dept", "EC");
		profile.put("city", "California");
		userProfile.put("Nalin", profile);
		System.out.println(userProfile);
	

		
		
	//	System.out.println( userProfile.+ " " + userProfile.get("Parth"));
	//	System.out.println( userProfile.+ " " + userProfile.get("Nalin"));
		
		Map<String ,Object> profile1 = userProfile.get("Parth");
		System.out.println("Age: " + profile1.get("age"));
		System.out.println("dept: " +profile1.get("dept"));
		System.out.println("city: " +profile1.get("city"));
		

		
		
	}
}	
