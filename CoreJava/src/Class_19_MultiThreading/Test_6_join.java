package Class_19_MultiThreading;

public class Test_6_join {
	public static void main(String[] args) {

		Test6 t1 = new Test6();
		Test6 t2 = new Test6();
		Test6 t3 = new Test6();
		System.out.println("Name " + "     : " + "Thread ID");
		t1.start();

		// TRY TO EXECUTE PROGRAM WITH COMMENT AND WITHOUT COMMENT.
		// If you do t1.join() : t1 will complet hole work first and give
		// resourse to other thread.

		try {
			t1.join();
			// t1.join(100000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.start();
		t3.start();

	}
}

class Test6 extends Thread {
	@Override
	public void run() {

		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + "  : " + Thread.currentThread().getId());
		}
	}
}