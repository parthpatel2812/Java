package Class_8;

public class Application {
	
	public static void main(String[] args) {
		
		String s1 = "Test";
		String s2 = "Test";
		String s3 = new String("Test");
		String s4 = s3.intern();
		
		System.out.println(s4 == s2);
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		System.out.println(s2.equals(s3));
		

	}
	
	

}
