package T_81_ReadingFile;
import java.io.File;
import java.util.Scanner;

public class ReadFile 
{
	private Scanner s;
	
	public void openFile()
	{
		try
		{
			 s = new Scanner(new File("Chinese.txt"));
		}
		catch(Exception e)
		{
			System.out.println("Coudent find file");
		}
	}
	
	public void readFile()
	{
		while(s.hasNext())
		{
			String a = s.next();
			String b = s.next();
			String c = s.next();
			
			System.out.printf("%s\t %s\t %s\t\n",a,b,c);
		}
	}
	public void closeFile()
	{
		s.close();
	}

}
