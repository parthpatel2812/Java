package T_43_PassObjectAsParameter;

public class NameDob 
{
	private String name;
	private Date dob;
	
	public NameDob(String n, Date d)
	{
		name = n;
		dob = d;
	
		System.out.println(this);
	}

	public String toString()
	{
		return String.format("My name is %s ,My DOB is %s ", name , dob);
	}
	

}
