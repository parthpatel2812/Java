package Class_10_OOPS_MarkerInterface;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo_2 
{
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream(new File("student.ser"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Student deseriializedStudent = (Student) ois.readObject();
			System.out.println(deseriializedStudent);
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		
		
		
		
		
		/*
		Student s1 = new Student(1000,(new Course(9999)));
		System.out.println("Original Object");
		System.out.println(s1);
		
	
		try {
			File file = new File("student.ser");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		
			oos.writeObject(s1);
			oos.flush();
			oos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}  */
	}

}
