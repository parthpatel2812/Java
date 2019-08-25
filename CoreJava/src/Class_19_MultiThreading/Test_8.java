package Class_19_MultiThreading;

public class Test_8 {
	
	public static void main(String[] args) {
	
		Test8 t1 = new Test8();
		Test8 t2 = new Test8();
		
		System.out.println("t1 : "+t1.getName()  +"   : "+t1.getId() );
		System.out.println("t2 : "+t2.getName()  +"   : "+t2.getId() );
		
		t1.setName("Parth"); 	// we change the name of therad for thread-0 to parth
		t2.setName("Prashant"); // we change the name of therad for thread-1 to prashant
		
		t1.start();
		t2.start();

	}

}

class Test8 extends Thread
{
	public void run()
	{
		System.out.println("running.." + Thread.currentThread().getName());
	}
}