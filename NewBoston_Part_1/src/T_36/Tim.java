package T_36;

public class Tim 
{

	private int hour,minute,second;
	
	public void setTime(int h,int m,int s)
	{
		hour   = ((h>=0 && h<25) ? h : 0);
		minute = ((m>=0 && m<61) ? m : 0);
		second = ((s>=0 && s<61) ? s : 0);
	}


	public String toMilitary()
	{
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}
	
	public String toReguler()
	{
		return String.format("%02d:%02d:%02d %s"
				             ,((hour==0||hour==12) ? 12: hour%12)
				             ,minute
				             ,second
				             ,((hour>12) ? "PM" : "AM"));
	}
	
}
