package Class_19_MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test_10_3 
{
	public static void main(String[] args) {
		
	ExecutorService exe = Executors.newSingleThreadExecutor();
		
		for(int i = 0; i<5 ;i++)
		{
	
			exe.execute(new Task103());
		}
 	}

}

class Task103 implements Runnable
{
	public void run() {
		System.out.println(Thread.currentThread().getName() +" Start");
		System.out.println(Thread.currentThread().getName() +" End");
			
		}
}