package T_46_staticVeriable;

public class Main 
{
	public static void main(String args[])
	{
		Club ob1 = new Club("Parth","Patel");
		Club ob2 = new Club("Urvesh","Raj");
		Club ob3 = new Club("Atit","Patl");
		Club ob4 = new Club("Nalin","Makwana");
		
		System.out.println("Total Numbers of members : "+ Club.getMembers());
	}

}
