package Class_19_MultiThreading;

public class Test_7_Name_Id_methods {
	
	public static void main(String[] args) {
	
		Test7 t1 = new Test7();
		Test7 t2 = new Test7();
		System.out.println("t1 : "+t1.getName()  +"   : "+t1.getId() );
		System.out.println("t2 : "+t2.getName()  +"   : "+t2.getId() );

		t1.start();
		t2.start();
		
		t1.setName("Parth Thread");
		System.out.println("t1 : "+t1.getName()  +"   : "+t1.getId() );
	}

}

class Test7 extends Thread
{
	public void run()
	{
		System.out.println("running.." + Thread.currentThread().getName());
	}
}