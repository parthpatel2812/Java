package T_39_MultipleConstructor;

public class mai
{
	public static void main(String[] args) 
	{
		Tim ob = new Tim();
		Tim ob1 = new Tim(5);
		Tim ob2 = new Tim(5,28);
		Tim ob3 = new Tim(5,29,59);
		
		System.out.println(ob.toMilitary());
		System.out.println(ob1.toMilitary());
		System.out.println(ob2.toMilitary());
		System.out.println(ob3.toMilitary());
		
		
		
	}

}
