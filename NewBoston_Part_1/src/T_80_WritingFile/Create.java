package T_80_WritingFile;
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
		x.format("%s%s%s", "20 " ,"Parth ", "Patel");
	}
	
	public void closeFile()
	{
		x.close();
	}
}
