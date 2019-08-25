package L_ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ector 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v = new Vector(3,2);
		System.out.println("size "+v.size());
		System.out.println("size "+v.capacity());
		
		
		v.addElement(new Integer(1));
		v.addElement(new Integer(2));
		v.addElement(new Integer(3));
		v.addElement(new Integer(4));
		v.addElement(new Integer(5));
		
		v.elements();
		
		Enumeration<Integer> a = v.elements();
		
		
		v.iterator();
		Iterator<Integer> i = v.iterator();
		
		v.listIterator();
		ListIterator<Integer> j = v.listIterator();
			
		
	}

}
