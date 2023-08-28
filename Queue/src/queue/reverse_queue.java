package queue;
import java.util.*;

public class reverse_queue {
	
	public static void insert(Queue<Integer>q,int x) {
		
		q.add(x);
	}
	
	public static void reverse(Queue<Integer>q) {
		if(q.isEmpty()) {
			return;
		}
		
		int x=q.peek();
		q.poll();
		reverse(q);
		insert(q,x);
	}
	
	public static void main(String args[]) {
		
		Queue<Integer>q=new LinkedList<>();
		q.add(10);
		q.add(5);
		q.add(15);
		q.add(20);
		
		reverse(q);
		
		while(q.size()>0) {
			System.out.print(q.poll() + " ");
		}
	}
}
