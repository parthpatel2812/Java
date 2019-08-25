package Class_8;

public class Demo_4 
{
	public static void main(String[] args) {
		String s1 ="abc";
		String s2 ="abc";
		String s3 ="def";
		String s4 ="ABC";
		
		
		System.out.println(s1.compareTo(s2)); // 0
		System.out.println(s2.compareTo(s3)); //-1
		System.out.println(s1.compareTo(s4)); // +1
		System.out.println(s1.compareToIgnoreCase(s4));//0
		
	}

}
