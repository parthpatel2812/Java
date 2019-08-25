package T_38;

public class A 
{
	private int x = 4;
	private int y = 5;
	private int z = 6;
	
	public void setVariable(int x,int y,int z)
	{
		this.x = x;
		this.y = y;
		this.z = z; 
	}
	
	public String display()
	{
		return String.format("%02d:%02d:%02d",x, y, z);
	}
	
			

}
