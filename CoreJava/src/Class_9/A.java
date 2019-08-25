package Class_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {

		try {
			BufferedWriter test1 = new BufferedWriter(new FileWriter("Test1.txt"));

			test1.write("hello Parth");
			test1.write(" hello Prashant");
			test1.write(" hi Pigar");
			test1.write(" by Nalin");

			test1.flush();
			test1.close();

			BufferedWriter test2 = new BufferedWriter(new FileWriter("Test2.txt"));

			test2.write("hello");
			test2.write(" hi");
			test2.write(" by");

			test2.flush();
			test2.close();

			BufferedReader read1 = new BufferedReader(new FileReader("Test1.txt"));
			BufferedReader read2 = new BufferedReader(new FileReader("Test2.txt"));

			String l1 = "";
			while (read1.ready()) {
				l1 = read1.readLine();
			}
			
			
			String l2 = "";
			while (read2.ready()) {
				l2 = read2.readLine();
			}


			String[] a1 = l1.split(" ");
			String[] a2 = l2.split(" ");

			String[] a3 = new String[a1.length];

			int x = 0;

			for (int i = 0; i < a2.length; i++) {
				for (int j = 0; j < a1.length; j++) {
					if (a2[i].equals(a1[j])) {
						a1[j] = "";
					}
				}

			}

			
			for (int i = 0; i < a1.length; i++) {
				if (a1[i] == null) {
					a3[i] = "";
				} else {
					a3[i] = a1[i];
				}
			}

			BufferedWriter test3 = new BufferedWriter(new FileWriter("Test3.txt"));
			for (int i = 0; i < a3.length; i++) {
				test3.write(a3[i] + " ");
			}
			test3.flush();
			test3.close();

			BufferedReader read3 = new BufferedReader(new FileReader("Test3.txt"));

			System.out.println("File 1: " + l1);
			System.out.println("File 2: " + l2);
			System.out.println("File 3:" + read3.readLine());

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
