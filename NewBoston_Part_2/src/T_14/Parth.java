package T_14;
import java.util.*;

public class Parth 
{
	public static void main(String[] args) 
	{
		Stack<String> st = new Stack<String>();
		st.push("first");
		System.out.println(st);
		st.push("second");
		System.out.println(st);
		st.push("third");
		System.out.println(st);
		
		st.pop();
		System.out.println(st);
		st.pop();
		System.out.println(st);
		st.pop();
		System.out.println(st);
	}

	
}
