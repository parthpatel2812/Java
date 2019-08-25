package Q_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue 
{
	public static void main(String args[])
	{
		Deque<String> dq = new ArrayDeque<>();
		// Queue - FIFO
		dq.add("parth");
		dq.add("nalin");
		dq.add("urvesh");
		dq.add("jigar");
		
		System.out.println(dq);
		
		System.out.println(dq.remove()); // remove first
		System.out.println(dq.remove()); // remove second
		
		System.out.println(dq);
		
		// Stack -LIFO
		dq.push("patel");
		dq.push("raj");
		dq.push("pandya");
		
		System.out.println(dq);
		
		System.out.println(dq.pop());
		System.out.println(dq.pop());
		System.out.println(dq);
		
	}
}
