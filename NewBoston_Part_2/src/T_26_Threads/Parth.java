package T_26_Threads;
import java.util.*;

public class Parth implements Runnable
{
	String name;
	int time;
	Random r = new Random();
	
	public Parth(String x)
	{
		 name = x;
		 time = r.nextInt(999); 
	}
	
	public void run()
	{
		try
		{
		System.out.println(name +" is sleeping for :" + time  );	
		Thread.sleep(time);
		System.out.println(name + " is wack up " +name);
		}
		catch(Exception e)
		{
			
		}
	}
}
