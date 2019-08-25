package Class_19_MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test_10_1 {
	
	public static void main(String[] args) {
		int coreCount = Runtime.getRuntime().availableProcessors(); // gives numbure of available proccessors
	    System.out.println(coreCount);
		ExecutorService exe = Executors.newFixedThreadPool(coreCount); // size is fixe, It uses Blocling queue
	//	ExecutorService exe1 = Executors.newCachedThreadPool(); size is not fixed , It uses Synchronus queue(can hold only 1 task)
		
		
		for(int i=0; i<10 ;i++) // submit 10 task to this thread pool
		{
			exe.execute(new Task());
		}
		System.out.println(Thread.currentThread().getName());
	}

}

class Task implements Runnable
{
	@Override
	public void run() {
	System.out.println(Thread.currentThread().getName() +" Start");
	System.out.println(Thread.currentThread().getName() +" End");
		
	}
	
}