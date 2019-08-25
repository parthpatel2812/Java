package T_16;

public class A {
	
	private String GF;
	
	public void setName(String name)
	{
		GF = name;
	}
	public String getName()
	{
		return GF;
	}
	
	public void PrintGFname()
	{
		System.out.println("Your First GierFriend is "+getName());
	}
}
