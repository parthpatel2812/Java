package T_46_staticVeriable;

public class Club 
{
	private String FN,LN;
	private static int member = 0;
	
	public Club(String f,String l)
	{
		FN = f;
		LN = l;
		member++;
		
		System.out.printf("Constructor is : %s  %s , number of member is : %d\n",FN,LN,member);
	}
	
	public String getFirstName()
	{
		return FN;
	}
	public String getLastName()
	{
		return LN;
	}
	public static int getMembers()
	{
		return member;
	}

}
