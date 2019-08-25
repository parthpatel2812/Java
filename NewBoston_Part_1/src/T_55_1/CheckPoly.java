package T_55_1;

class CheckPoly 
{
	public static void main(String[] args) 
	{
	Bank  ob;
	
	ob = new SBI();
	System.out.println("SBI intrest rate is   :"+ob.getIntretofrate());
 
	ob = new ICICI();
	System.out.println("ICICI intrest rate is :"+ob.getIntretofrate());
	
	ob = new AXIS();
	System.out.println("AXIS intrest rate is  :"+ob.getIntretofrate());
	}
}
