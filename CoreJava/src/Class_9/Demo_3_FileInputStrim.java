package Class_9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Demo_3_FileInputStrim 
{
	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream(new File("test.txt"));
			int i = 0;
			while((i = is.read()) != -1)
			{
				System.out.print((char)i);
			}
	
			
		
		
		
		
		} catch (FileNotFoundException e) {
						e.printStackTrace();
		} catch (IOException e) {
	
			e.printStackTrace();
		}
	}

}
