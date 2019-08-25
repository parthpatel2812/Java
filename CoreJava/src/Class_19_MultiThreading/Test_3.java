package Class_19_MultiThreading;

public class Test_3 {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Hello :" + i);

					try {
						Thread.sleep(2000);
						System.out.println("hi");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}

		});
		
		t1.start();
	}

}
