package S_LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo 
{
	public static void main(String args[])
	{
		Set<String> hashSet = new HashSet<>(); // HashSet not gives INSERSION order 
		hashSet.add("Raj");
		hashSet.add("John");
		hashSet.add("Anita");
		hashSet.add("Raj");
		
		System.out.println("hashSet : "+ hashSet);
		
		Set<String> linkedSet = new LinkedHashSet<>(); // LinkedHashSet gives INSERTION order
		linkedSet.add("Raj");
		linkedSet.add("John");
		linkedSet.add("Anita");
		linkedSet.add("Raj");
		
		System.out.println("linkedSet : "+ linkedSet);
		
		Set<String> treeSet = new TreeSet<>(); // TreeSet gives SORTING DATA
		treeSet.add("Raj");
		treeSet.add("John");
		treeSet.add("Anita");
		treeSet.add("Raj");
		
		System.out.println("treeSet : "+ treeSet);
		
	}

}
