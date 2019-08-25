package Class_19_MultiThreading;

import java.util.Scanner;

public class Test_4 {
	public static void main(String[] args) {

		Processor p1 = new Processor();
		p1.start();
		
		System.out.println("press enter to stop....");
		
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		
		p1.sutdowm();		
	}
}

class Processor extends Thread {
	
	private volatile  boolean running = true;

	@Override
	public void run() {

		while (running) {
			System.out.println("Hello");

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

	public void sutdowm() {
		running = false;
	}

}