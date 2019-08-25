package Class_19_MultiThreading;

public class Test_9_Thread_Priority {
	public static void main(String[] args) {
		
		Test9 t1 = new Test9();
		Test9 t2 = new Test9();
		Test9 t3 = new Test9(); 
		t1.setName("MIN");
		t2.setName("NORM");
		t3.setName("MAX");
		
		t3.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY); // there is no poin to give NORM_PRIORITY BZ Default priority is NORM.
		t1.setPriority(Thread.MIN_PRIORITY);
	
		t1.start();
		t2.start();
		t3.start();

	}

}


class Test9 extends Thread
{
	public void run()
	{
		System.out.println("running.." + Thread.currentThread().getName() +"   "+Thread.currentThread().getPriority());
	}
}