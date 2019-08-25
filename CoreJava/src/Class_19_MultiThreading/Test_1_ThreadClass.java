package Class_19_MultiThreading;

public class Test_1_ThreadClass {

	public static void main(String[] args) {
		Test  t1 =  new Test();
		Test  t2 =  new Test();	
		Testy  t11 =  new Testy();
		Testy  t22 =  new Testy();	
		
/*		t1.run();
		t2.run();*/
		
		t1.start();
		//t1.start();  // Will give Error::java.lang.IllegalThreadStateException
		t2.start();	
		t11.start();
		t22.start();
	}
}

class Test extends Thread
{

	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello :"+Thread.currentThread() + i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}

class Testy extends Thread
{

	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi :"+ Thread.currentThread()  + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}