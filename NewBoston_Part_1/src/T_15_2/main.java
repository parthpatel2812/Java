package T_15_2;
import java.util.Scanner;

class main 
{
	 public static void main(String args[])
	 {
		 Scanner s = new Scanner(System.in);
		 
		 Accouts ob = new Accouts(); 
		 
		 System.out.println(" parth \n nisha \n zalak \n You can enter name from above three and see account detail ");
		 
		 String name = s.nextLine();
		 
		 ob.adetail(name);
		 
		
		 String z = new String("pm");
		 
		 if(z =="pm")
		 {
			 System.out.println("true");
		 }
		 else
		 {
			 System.out.println("F");
		 }	 	 
	 }
}
