package stack;

import java.util.Stack;

public class implementation {
	
	public static void stack_push(Stack<Integer>st) {
		for(int i=1;i<=5;i++) {
			st.push(i);
		}
	}
	
	public static void stack_pop(Stack<Integer>st) {
		
		if(st.isEmpty()) {
			System.out.println("stack is empty");
			return;
		}
		int x=st.pop();
		System.out.println("poped element is: " + x);
	}
	
	public static void stack_peak(Stack<Integer>st) {
		
		if(st.isEmpty()) {
			System.out.println("stack is empty");
			return;
		}
		int x=st.peek();
		System.out.println("peak element is: " + x);
	}
	
	public static void main(String arg[]) {
		
		Stack<Integer>st=new Stack<Integer>();
		stack_push(st);
		stack_pop(st);
		stack_peak(st);
	}
	
}
