package Class_19_MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test_10_ExecutorService_Executor 
{
	public static void main(String[] args) {
				
		//int coreCount = Runtime.getRuntime().availableProcessors();
	ExecutorService exe = Executors.newFixedThreadPool(3);
	
		for(int i=0 ;i<10 ; i++)
		{
			Test10 t1 = new Test10("" + i);
			exe.execute(t1);
		}
		
		exe.shutdown();
		
		while(!exe.isTerminated()){}
		
		System.out.println("Finish all tasks");
	}

}

class Test10 extends Thread
{

	private String message;
	
	public Test10(String s)
	{
		this.message = s;
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " (Strat) " + message);
		
		System.out.println(Thread.currentThread().getName() +" (End)   " + message);
	}
}
