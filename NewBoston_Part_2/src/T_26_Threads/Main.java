package T_26_Threads;

public class Main 
{
	public static void main(String args[])
	{
		Thread t1 = new Thread(new Parth("one"));
		Thread t2 = new Thread(new Parth("two"));
		Thread t3 = new Thread(new Parth("three"));
		Thread t4 = new Thread(new Parth("four"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
