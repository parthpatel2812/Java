package T_55_3;

class CleckPolymorism 
{
  public static void main(String[] args)
    { 
	 
	  /*Animal ob;
    
	  ob = new Dog();
	  ob.eat();
	  
	  ob = new Cat();
	  ob.eat();
	  
	  ob = new Lion();
	  ob.eat();
	  */
	 
	  Animal ob1[] = new Animal[3];
	  
	  ob1[0] = new Dog();
	  ob1[1] = new Cat();
	  ob1[2] = new Lion();
	  
	  for(int i=0; i<3;i++)
	  {
		  ob1[i].eat();
	  }
	  
	  
	  
	  
	  
	}
}
