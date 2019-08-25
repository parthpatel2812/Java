package T_55_4;

class MainClass
{
	public static void main(String[] args) 
	{
		Parth obj = new Parth();
		
		Food F = new Food();   // object of Food class
		Food VF = new VegFood(); // object of VegFood class
		Food NV = new NonVegFood(); // object of NonVegFood class
		Food EF = new EagiFood();  // // object of EagiFood class
		
		obj.digest(F);
		obj.digest(VF);
		obj.digest(NV);
		obj.digest(EF);
	}
}
