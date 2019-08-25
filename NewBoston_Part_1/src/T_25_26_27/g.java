package T_25_26_27;

public class g {
	public static void main(String[] args)
	{
		System.out.println(average(1,2,3,4,5));
	}
	
	public static int average(int...num)
	{
		int total = 0;

		for(int x:num)
			total+=x;	
	
		return total/num.length;
	}
}
