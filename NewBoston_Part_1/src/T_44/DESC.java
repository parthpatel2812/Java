package T_44;

public enum DESC 
{
	Nalin("india","28"),
	Urvesh("cananda","4"),
	Atit("canada","4"),
	Dhaval("india","28"),
	Chintan("london","3"),
	Dhruval("melbon","3"),
	Bhumit("NZ","6")
	;
	
	private final String desc,year;
	
   DESC(String d,String y)
   {
	desc = d;
	year = y;
   }
	
  
   public String getDescription()
   {
	   return desc;
   }
   
   public String getYear()
   {
	   return year;
   }
}
