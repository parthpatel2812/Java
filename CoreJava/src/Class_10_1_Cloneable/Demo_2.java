package Class_10_1_Cloneable;

public class Demo_2 {
	public static void main(String[] args) 
	{
		Test t = new Test(10, 20, new Test1(30));
	
		
		try {
			Test t1 = (Test) t.clone();

			t1.setA(100);
			t1.setB(200);
			t1.getTest1().setX(300);
		
			System.out.println(t);
			System.out.println(t1);
			
		} catch (CloneNotSupportedException e) {
	
			e.printStackTrace();
		}

	}

}

class Test implements Cloneable {
	private int a;
	private int b;
	private Test1 test1;




	public Test(int a, int b, Test1 test1) {
		super();
		this.a = a;
		this.b = b;
		this.test1 = test1;
		
	}


	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + ", test1=" + test1 +  "]";
	}


	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Test1 getTest1() {
		return test1;
	}

	public void setTest1(Test test) {
		this.test1 = test1;
	}


	public void setTest1(Test1 test1) {
		this.test1 = test1;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Test1 {
	private int x;

	public Test1(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Test1 [x=" + x + "]";
	}
}