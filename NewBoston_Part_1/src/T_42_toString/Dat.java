package T_42_toString;

public class Dat
{
	private int date,month,year;
	
	public Dat(int d,int m,int y)
	{
		month = m;
		date = d ;
		year = y;
	System.out.println("This constructor "+this);
	}
	
	public String toString()
	{
		return String.format("%d/%d/%d",date,month,year);

	}

}
