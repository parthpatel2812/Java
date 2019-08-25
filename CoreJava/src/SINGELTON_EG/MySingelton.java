package SINGELTON_EG;

public class MySingelton
{
	private static MySingelton singeltonOb = new MySingelton(); // 1.Object -> PRIVATE STATIC

	private MySingelton() {} //2. Constructor -> 2.Constructor -> PRIVATE
	
	public static MySingelton getSingelton() //3. STATIC GETINSTANCE METHOD
	{
		return singeltonOb;
	}


	public void method() {
		System.out.println("I am from singelton class");
	}
}

//How to make object Thread safe.
// 1.static public final MySingelton singeltonOb = new MySingelton();

//2.Define Object In Senchnorize Block

//3.use senchnorized keyword whith grtSingelton() method.
