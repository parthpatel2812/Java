package T_36;

public class Mai 
{
	public static void main(String[] args)
	{
		Tim ob = new Tim();
		
		System.out.println(ob.toMilitary());
		System.out.println(ob.toReguler());
		
		ob.setTime(8,56,34);
		System.out.println("\nfor 8:56:34");
		System.out.println(ob.toMilitary());
		System.out.println(ob.toReguler());
	
		ob.setTime(22,56,34);
		System.out.println("\nfor 22:56:34");
		System.out.println(ob.toMilitary());
		System.out.println(ob.toReguler());
		
		
	}

}
