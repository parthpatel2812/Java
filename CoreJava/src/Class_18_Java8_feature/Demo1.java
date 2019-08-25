package Class_18_Java8_feature;

public class Demo1 {
	public static void main(String[] args) {
		
		Abc ob = new Abc()
				{

					@Override
					public void show() {
						
					System.out.println("method Show()");	
					}

					@Override
					public void met() {
						System.out.println("method met()");
						
					}
					
				};
				
				ob.show();
				ob.met();
		
	}

}

interface Abc
{
	
	void show();
	
	void met();
}

//  Type of interface
//1.Normal (morethen one method)
//2. functional (only one method) -- > Lamada Expression( Scala lungage)
//3. Markar Interface(no methods,no fields) 