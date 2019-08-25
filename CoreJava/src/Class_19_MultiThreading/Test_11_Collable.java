package Class_19_MultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test_11_Collable {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService exe = Executors.newFixedThreadPool(5);
		
		List<Future> allfeu = new ArrayList<>();
		for(int i = 0; i<10 ;i++)
		{
			Future<Integer> feu = exe.submit(new Test111());
			allfeu.add(feu);
		}
		
		for(int i = 0; i<10 ;i++)
		{
			Future<Integer> feu = allfeu.get(i);
			Integer result = feu.get();
			System.out.println("Result of feature # " + i + " = " + result);
		}
		
		exe.shutdown();
	}

}

class Test111 implements Callable<Integer>
{

	@Override
	public Integer call() throws Exception {
		
		Thread.sleep(5000);
		
		return new Random().nextInt();
	}
	
}