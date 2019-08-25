package T_44;

import java.util.EnumSet;

public class mainClass 
{
	public static void main(String args[])
	{
	for(DESC people : DESC.values()) 
		System.out.printf("%s\t%s\t%s\n",people,people.getDescription(),people.getYear());

	System.out.println("\nNow we use range of CONSTANTS !!! \n");
	
	for(DESC people : EnumSet.range(DESC.Urvesh , DESC.Dhruval))
		System.out.printf("%s\t%s\t%s\n",people,people.getDescription(),people.getYear());
	}
}
