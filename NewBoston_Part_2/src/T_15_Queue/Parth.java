package T_15_Queue;
import java.util.*;

public class Parth 
{
	public static void main(String args[])
	{
		PriorityQueue<String> q = new PriorityQueue<String>();
		
		q.offer("first");
		q.offer("second");
		q.offer("third");
		
		System.out.println(q);
		
		System.out.println("Highest priority in QUEUE : "+ q.peek()); 
		
		q.poll();
		System.out.println(q);
	}
}
