package Class_18_Java8_feature;

public class AuonymousInnerClass2 {
	public static void main(String[] args) {

		C obj = new C() // Alos you can create object of INTERFACE by using
						// AuonymousInnerClass
		{

			@Override
			public void interfaceMethod3() {
				System.out.println("I am form class'AuonymousInnerClass' method().");

			}

			@Override
			public void n() {
				// TODO Auto-generated method stub

			}
		};

		obj.interfaceMethod1();
		C.interfaceMethod2();
		obj.interfaceMethod3();

	}

}

interface C {

	default void interfaceMethod1() // must be default or static
	{
		System.out.println("I am form Interface interfaceMethod1()");
	}

	static void interfaceMethod2() {
		System.out.println("I am form Interface interfaceMethod2()");
	}

	void interfaceMethod3();

	void n();
}
