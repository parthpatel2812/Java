package Class_8;

public class Demo_3 {
	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("xyz");
		String s5 = new String("xyz");
		
		System.out.println(s1.hashCode()); // It proves that both value store in same memory location in string pool
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
	}

}
