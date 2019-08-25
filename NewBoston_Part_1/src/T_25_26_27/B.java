package T_25_26_27;

public class B {
	public static void main(String[] args) {
		
		int a[] = {2,5,4,6,8,9};
		int total=0;
		for (int i=0;i<a.length;i++)
		{
			int c = a[i];
			total = total + c;
			System.out.print(c + " ");
		}
		System.out.println("\n\nTotal is :"+total);
	}
}
