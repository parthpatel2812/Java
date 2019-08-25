package Class_19_MultiThreading;

public class Test_1_1_volatile 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new Test11());
		Thread t2 = new Thread(new Test11());
		Thread t3 = new Thread(new Test11());
		Thread t4 = new Thread(new Test11());
		Thread t5 = new Thread(new Test11());
		Thread t6 = new Thread(new Test11());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	
		
	}

}

class Test11 implements Runnable
{
   volatile int i = 0;
	
	@Override
	public void run() {
	for(int x =0; x<100000 ;x++)
	{
		i++;
		System.out.println( Thread.currentThread().getName()+" "+i);
	}
		System.out.println(i);
	}
	
}