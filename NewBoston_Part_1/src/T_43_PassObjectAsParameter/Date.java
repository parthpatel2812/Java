package T_43_PassObjectAsParameter;

public class Date 
{
	private int date , month, year;
	
	public Date(int d,int m, int y)
	{
		date = d;
		month = m;
		year = y;
	
		System.out.println("Constructor is : "+this);
	}

	public String toString()
	{
		return String.format("%d/%d/%d",date,month,year);
	}
	
}
