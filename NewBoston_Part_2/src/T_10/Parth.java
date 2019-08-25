package T_10;
import java.util.*;

public class Parth
{
	public static void main(String[] args) 
	{
		//create an array and convert in to list
		Character[] ar = {'p','w','n'};
		List<Character> li = Arrays.asList(ar);  // convert array in to list 
		
		System.out.println("List is : ");
		output(li); 
		
		// reverse and print out the list
		Collections.reverse(li );
		System.out.println("After reverse : ");
		output(li);
		
		//create new array and a new list
		Character[]  arnew = new Character[3];
		List<Character> licopy = Arrays.asList(arnew);
		
		//copy contents of li into licopy
		Collections.copy(licopy, li);
		System.out.println("Copy of list : ");
		output(licopy);
		
		// fill collection with crap
		Collections.fill(li, 'Y');
		System.out.println("After filling the list : ");
		output(li);
	}
	
	// output method
	
	private static void output(List<Character> thelist)
	{
		for(Character thing : thelist)
			System.out.printf("%s ",thing);
		
		System.out.println();
		System.out.println();
	}

}
