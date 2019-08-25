package T_25_26_27;
import java.util.Random;

public class C {
	public static void main(String[] args) {
		Random r = new Random();
		
		int A[] = new int[7];
		
		for(int b = 0;b<1000;b++)
		{
			++A[2+r.nextInt(5)];
		}
		System.out.println("NUMBER\tFrequency" );
		
		for(int fa=0  ; fa<A.length;fa++)
		{
			System.out.println(fa +" \t"+A[fa]);
		}
		
	}
}
