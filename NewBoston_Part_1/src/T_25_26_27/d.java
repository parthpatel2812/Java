package T_25_26_27;

public class d {
	public static void main(String[] args) {
		int a[]={1,2,4,5,6};
		int tot = 0;
		for(int x: a)
		{
			System.out.print(x + " ");
		}
		
		for(int x: a)
		{
			tot+=x;
		}
		System.out.println("\nTOTAL IS : " +tot );
		
	}

}
