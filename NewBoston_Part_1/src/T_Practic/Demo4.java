package T_Practic;
import java.util.HashMap;
import java.util.Set;

public class Demo4 extends AA
{
	public static void main(String[] args) {
	
		String a = "A";
		String b = "B";
		String c = "C";
		
		
		HashMap<String ,Integer> myHashmap = new HashMap<>();
		myHashmap.put(a, 1001);
		myHashmap.put(b, 1002);
		myHashmap.put(c, 1003);
		
		System.out.println(myHashmap);
		myHashmap.entrySet().forEach(x->System.out.println(x.getKey() + " "+ x.getValue()));
		
		Set<String> name = myHashmap.keySet();
		name.forEach(System.out::println);
		
	}


}
