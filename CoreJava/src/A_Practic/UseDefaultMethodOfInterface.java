package A_Practic;

public class UseDefaultMethodOfInterface implements TestInterface2,TestInterface1
{
	public static void main(String[] args) {
		
		UseDefaultMethodOfInterface  ob = new UseDefaultMethodOfInterface ();
	
		ob.doTask();
	}

	@Override
	public void doTask() {
		System.out.println("Main method");
						}

/*	@Override
	public void doTask() {
		TestInterface2.super.doTask();
		System.out.println("Override method");
	}*/
	
/*	@Override
	public void doTask() {
		TestInterface1.super.doTask();
		System.out.println();
	}
*/


}

