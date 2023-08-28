package stack;

public class array_impliment {
	int n=10;
	int arr[]=new int[n];
	int top=-1;
	
	public void push(int val) {
		if(top==n-1) {
			System.out.println("stack overflow");
			return;
		}
		arr[++top]=val;
		
	}
	public void pop() {
		if(top==-1) {
			System.out.println("stack is empty");
			return;
		}
		int x=arr[top--];
		System.out.println("poped element is "+ x);
	}
	
	public void peak() {
		if(top==-1) {
			System.out.println("stack is empty");
			return;
		}
		int x=arr[top];
		System.out.println("peaked element is "+ x);
	}
	
	public static void main(String arg[]) {
		array_impliment st=new array_impliment();
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.pop();
		st.peak();
	}
}
