package T_59;

public class AnimalList
{
	private Animal[] list = new Animal[5];
	private int i =0;
	
	public void add(Animal a)
	{
		if(i<list.length)
		{
			list[i] = a;
			System.out.println("Animal added at index :" +i);
			i++;
		}
		
	}
	
}
