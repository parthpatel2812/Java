package T_61;

public class Main 
{

	public static void main(String args[])
	{
		Animal[] list = new Animal[2];
		
		Dog d = new Dog();
		Fish f = new Fish();
		
		list[0] = d;
		list[1] = f;
		
		for(Animal x : list)
			x.noise();
		
	}
}
