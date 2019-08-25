package T_15_2;

public class Accouts 
{
	public void adetail(String s)
	{
		if(s == "parth")
		{
			System.out.println("Full Name: Parthkumar Patel");
			System.out.println("Address  : Brownstown");
			System.out.println("Balance  : $1000 ");
		}
		else if(s.equals("nisha"))
		{
			System.out.println("Full Name: Nainisha Patel");
			System.out.println("Address  : Brownstown");
			System.out.println("Balance  : $2000 ");	
		}
		else if(s.equals("zalak"))
		{
			System.out.println("Full Name: Zalak Patel");
			System.out.println("Address  : Brownstown");
			System.out.println("Balance  : $10,000 ");	
		}
		else
		{
			System.out.println("You enered wrong name.");
		}
	}

}
