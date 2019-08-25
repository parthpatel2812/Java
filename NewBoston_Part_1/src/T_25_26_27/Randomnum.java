package T_25_26_27;
import java.util.Random;

public class Randomnum {
	public static void main(String[] args) {
		
		Random r = new Random();
	int num ;
	 
	for(int i = 0; i<10;i++)
	{
		num = 1+r.nextInt(5);
		System.out.print(num + " ");
	}
		
	}
}
