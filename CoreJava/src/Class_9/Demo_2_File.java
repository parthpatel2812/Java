package Class_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class Demo_2_File 
{
	public static void main(String[] args) {
		/*
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
			bw.write("Hello World");
			bw.newLine();
			bw.write("My name is Parth");
			bw.newLine();
			bw.write("This is a butiful life");
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		*/
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("test.txt"));
			//System.out.println(br.readLine());
			
	/*		while(br.ready())
			{
				System.out.println(br.readLine());
			} */
			
			br.lines().forEach(str-> System.out.println(str));
	
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
