package Class_19_MultiThreading;

public class Test_5
{
	public static void main(String[] args) {
		

		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
			
				System.out.println(Thread.currentThread().getName() + "  ");
			}
		});
		 
		t1.run(); 	// If you call run it acts as simple mthod calling,
		t1.run(); // you can do this
		t1.start(); // If you call start it acts as Thread
	//	t1.start();// you can't do this
		
	}
}
