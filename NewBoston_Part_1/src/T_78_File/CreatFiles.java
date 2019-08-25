package T_78_File;
import java.util.Formatter;

public class CreatFiles 
{
	public static void main(String[] args) 
	{
		final Formatter x;
		
		try{
			x = new Formatter("par.txt");
			System.out.println("We crated a file.");
		   }
		catch(Exception e)
		{
			System.out.println("You get an error");
		}
	}

}
