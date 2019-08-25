package Class_18_Java8_feature;

public class LamadaExpression {
	public static void main(String[] args) {

		Abx ob = (i) -> System.out.println("hello " + i);
		ob.met1(1);

	}
}

@FunctionalInterface
interface Abx {

	void met1(int i);
	// void met2();
}