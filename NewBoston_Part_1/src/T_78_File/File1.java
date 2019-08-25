package T_78_File;
import java.io.File;

public class File1
{
	public static void main (String args[])
	{
	File x = new File("/Users/parthpatel/Desktop/prog.txt");	
	
	if (x.exists())
		System.out.println(x.getName() + " exist !");
	else
		System.out.println("NOt exist");
	
	}
}
