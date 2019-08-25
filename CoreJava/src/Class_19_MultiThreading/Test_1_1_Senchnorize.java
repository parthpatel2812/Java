package Class_19_MultiThreading;


public class Test_1_1_Senchnorize {

	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new Test112());
		Thread t2 = new Thread(new Test112());
		Thread t3 = new Thread(new Test112());
		Thread t4 = new Thread(new Test112());
		Thread t5 = new Thread(new Test112());
		Thread t6 = new Thread(new Test112());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	
		
	}

}

class Test112 implements Runnable
{
	int i;
	
	@Override
	public synchronized  void run() {
	for(int x =0; x<100000 ;x++)
	{
		i++;
		System.out.println( Thread.currentThread().getName()+" "+i);
	}
		System.out.println(i);
	}
}