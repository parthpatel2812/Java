package T_81_ReadingFile;
import java.util.Formatter;

public class Create
{
	private Formatter x;
	
	
	public void openFile()
	{
		try
		{
			x = new Formatter("Chinese.txt");
		}
		catch(Exception e)
		{
			System.out.println("You have an error:");
		}
	}

	public void addRecord()
	{
		x.format("%s%s%s", "10\t" ,"Parth\t", "Patel\n");
		x.format("%s%s%s", "20\t" ,"Urvesh\t", "Raj\n");
		x.format("%s%s%s", "30\t" ,"nalin\t", "Makawna\n");
	}
	
	public void closeFile()
	{
		x.close();
	}
}
