package T_55_2;

public class CheckPolymorphism 
{
	public static void main(String[] args) 
	{
			Shape ob;
		 	
		 	ob = new Rectangle();
		 	ob.draw();
		 	
		 	ob = new Circle();
		 	ob.draw();
		 	
		 	ob = new Triangle();
		 	ob.draw();
		 	
	}
}
