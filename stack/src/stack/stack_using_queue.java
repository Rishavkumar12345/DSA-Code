package stack;
import java.util.*;

class queue{
	Queue<Integer>q1;
	Queue<Integer>q2;
	
	queue(){
		q1=new LinkedList<>();
		q2=new LinkedList<>();
	}
	
	public void push(int val) {
		q2.add(val);
		while(!q1.isEmpty()) {
			q2.add(q1.poll());
		}
		q1=q2;
		q2=new LinkedList<>();
	}
	
	public void pop() {
		
		if(q1.isEmpty()) {
			System.out.println("stack is empty");
			return;
		}
		
		int x=q1.poll();
		System.out.println("pop element is "+x);
		return;
	}
	
	public void peek() {
		
		if(q1.isEmpty()) {
			System.out.println("stack is empty");
			return;
		}
		
		int x=q1.peek();
		System.out.println("top element is "+x);
		return;
	}
}

public class stack_using_queue {
	public static void main(String args[]) {
		queue st=new queue();
		st.push(1);
		st.push(2);
		st.push(3);
		
		st.peek();
		st.pop();
		st.peek();
	}
}
