package Class_19_MultiThreading;

public class Test_2_Runnable
{
	public static void main(String[] args) {
	
		Thread t1 = new Thread(new Tests());
		Thread t2 = new Thread(new Tests());
		Thread t3 = new Thread(new Tests());
		
		t1.start();
		t2.start();
		t3.start();
	}
}

class Tests implements Runnable
{

	@Override
	public void run() {
	
			for(int i=0;i<5;i++)
			{
				System.out.println("Hello :"+ i);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
	}
}
