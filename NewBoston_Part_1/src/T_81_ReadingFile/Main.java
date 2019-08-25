package T_81_ReadingFile;

public class Main 
{
	public static void main(String args[])
	{
		/*
		Create ob = new Create();
		
		ob.openFile();
		ob.addRecord();
		ob.closeFile();
		*/
		ReadFile rob = new ReadFile();
		
		rob.openFile();
		rob.readFile();
		rob.closeFile();
		
		
	}

}
