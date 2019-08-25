package Class1;

public class Demo4_ReverseString 
{
	public static void main(String[] args) {
	
		String s = "Somthing have happened Since the last time";
		
		String[] string = s.split(" ");
		
	
		String[] reversString = new String[string.length];

		int j = string.length-1;
		for(int i=0 ; i<reversString.length ; i++)
		{
			reversString[i] = string[j];
			j--;
		}
	
		System.out.println(s);
		for(String x: reversString)
		{
			System.out.print(x + "  ");
		}
		
	}
}
