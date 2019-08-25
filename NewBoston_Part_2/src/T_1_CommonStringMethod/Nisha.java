package T_1_CommonStringMethod;

public class Nisha 
{
	public static void main(String[] args) 
	{
		String s = "parthpatelparthpatelparthpatel";
		System.out.println(s.indexOf("l"));
		System.out.println(s.indexOf("patel"));
		System.out.println(s.indexOf("x"));
		
		System.out.println();
		
		String a = "Bacon";
		String d = "monstor";
		
		System.out.println(a.concat(d));
		System.out.println(d.toUpperCase());
		
		System.out.println();
		String x = "nalin";
		String y = "urvesh";
		
		System.out.println(x.replace("n", "P"));
		System.out.println(y.replace("u", "z"));
		
		System.out.println();
		
		String z = "      removeSpace ";
		System.out.println(z.trim());
		
	}
	
}
