package Class_19_MultiThreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test_10_2 
{
	public static void main(String[] args) {
		
		ScheduledExecutorService exe = Executors.newScheduledThreadPool(4);
		
		for(int i = 0; i<10 ;i++)
		{
	
			/*// Task to run after 10 second delay..
			exe.schedule(new Task102(), 10, TimeUnit.SECONDS);*/
			
		
		  /*// Task to run repeatedly every 10 second but initalDelay of 15 sec (command, initialDelay, period, unit)
			exe.scheduleAtFixedRate(new Task102(), 10, 5, TimeUnit.SECONDS); */
			
			
          /*//Task to run repeately 10 sec after previous task completes (command, initialDelay, delay, unit)
			exe.scheduleWithFixedDelay(new Task102(), 15, 10, TimeUnit.SECONDS); */
		}
 	}

}

class Task102 implements Runnable
{
	public void run() {
		System.out.println(Thread.currentThread().getName() +" Start");
		System.out.println(Thread.currentThread().getName() +" End");
			
		}
}