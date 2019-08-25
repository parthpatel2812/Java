package Class_14_equal_hashCode;

public class Demo1 
{
	public static void main(String[] args) {
		String s1 = "Test";
		String s2 = "Test";
		String s3 = new String("Test");
		String s4 = s3;
		String s5 = new String("Test");
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println(s2.equals(s4));
		System.out.println(s3==s5);
		System.out.println(s3.equals(s5));
		
	
	}

}
