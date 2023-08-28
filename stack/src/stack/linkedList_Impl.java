package stack;
import java.util.*;

class stack{
	int data;
	stack next;
	
	stack(int x){
		data=x;
		next=null;
	}
};



public class linkedList_Impl{
	
	static stack root;
	
	public static void push(int val) {
		
		stack newstack=new stack(val);
		if(root==null) {
			root=newstack;
			return;
		}
		stack temp=root;
		root=newstack;
		newstack.next=temp;
	}

	public static void pop() {
		
		if(root==null) {
			System.out.println("stack is empty");
			return;
		}
		
		int x=root.data;
		root=root.next;
		System.out.println("pop element is "+x);
	}

	public static void peek() {
		
		if(root==null) {
			System.out.println("stack is empty");
			return;
		}
		
		int x=root.data;
		System.out.println("top element is "+x);
	}
	
	public static void main(String arg[]) {
		
		linkedList_Impl st=new linkedList_Impl();
		st.push(10);
		st.push(11);
		st.push(18);
		
		st.peek();
		st.pop();
		st.peek();
	}
}