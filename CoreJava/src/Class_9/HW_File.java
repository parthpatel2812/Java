package Class_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HW_File 
{
	public static void main(String[] args)
	{
		
		
		try {
			BufferedWriter test1 = new BufferedWriter(new FileWriter("Test1.txt"));
		
			test1.write("hello parth");
			test1.flush();
			test1.close();
		
			BufferedWriter test2 = new BufferedWriter(new FileWriter("Test2.txt"));
		
			test2.write("hello");
			test2.flush();
			test2.close();
			
			BufferedReader read1 = new BufferedReader(new FileReader("Test1.txt"));
			BufferedReader read2 = new BufferedReader(new FileReader("Test2.txt"));
		
			//read1.lines().forEach(str-> System.out.println(str));
			//read2.lines().forEach(str-> System.out.println(str));
			
			String[] ar1 = new String[50];
			
			int i =0;
			while(read1.ready())
			{
				ar1[i] = read1.readLine();
				i++;
			}
			
			String[] ar2 = new String[50];
			
			int j =0;
			while(read2.ready())
			{
				ar2[j] = read2.readLine();
				j++;
			}
			
			
			
			
			for(String x : ar1)
			{
				if(x == null)
				{
					x = "";
				}
				else{
					System.out.println(x);
				}
			}
			
			for(String x : ar2)
			{
				if(x == null)
				{
					x = "";
				}
				else{
					System.out.println(x);
				}
			}
			
			
			String[] s3 =method(ar1,ar2);
			for (String y : s3)
				System.out.print(y + " ");
			
			
			
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	

	
	
	public static String[] method(String[] b1, String[] b2) {
	
		String[] a1 = b1;
		String[] a2 = b2;

		String[] a3 = new String[50];

		int x = 0;

		for (int i = 0; i < a2.length; i++) {
			for (int j = 0; j < a1.length; j++) {
				if (a2[i].equals(a1[j])) {
					a1[j] = null;
				}
			}

		}

		for (int i = 0; i < 5; i++) {
			if (a1[i] == null) {
				a3[i] = "";
			} else {
				a3[i] = a1[i];
			}
		}

		return a3;

	}

}
