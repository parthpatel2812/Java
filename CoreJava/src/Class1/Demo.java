package Class1;
import java.util.Random;

public class Demo 
{
	private int id;
	private String name;
	
	public Demo(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Demo(String name) {
		this.id = new Random().nextInt(2000);
		this.name = name;
	}
	
	public Demo() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) 
	{
		Demo demo = new Demo();
		
		demo.setId(1001);
		demo.setName("Parth");
	
		
//		Demo demo = new Demo(1005 , "PATEL");
		
//		Demo demo = new Demo("NALIN");
		
		System.out.println(demo.getId() + " "+demo.getName());
	}

}
