package T_25_26_27;

public class e {
	public static void main(String[] args) 
	{
		
		int A[] = {1,2,3,4,5};
		
		for(int y:A)
			System.out.print(y +"  ");
		
		chang(A);
		
		System.out.println();
		for(int y:A)
			System.out.print(y +"  ");
	}
	
	public static void chang(int b[])
	{
	for(int x=0;x<b.length;x++)
		b[x] +=5;
	}
	

}
