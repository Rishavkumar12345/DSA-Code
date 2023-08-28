package pratice;
import java.util.*;

//import Binary_tree.node;

class node{
	int data;
	node right;
	node left;
	
	node(int x){
		data=x;
		left=null;
		right=null;
	}
}

public class flatten_binary_tree {
	
	static node prev=null;
	
	public static void flatten(node root) {
		
		if(root==null) {
			return;
		}
		
		
		flatten(root.right);
		flatten(root.left);
		root.right=prev;
		root.left=null;
			
		prev=root;
		
	}
	
	public static void inorder(node root) {
		Stack<node>st=new Stack<>();
		node curr=root;
		
		while(curr!=null || !st.isEmpty()) {
			while(curr!=null) {
				st.push(curr);
				curr=curr.left;
			}
			curr=st.peek();
			st.pop();
			System.out.print(curr.data + " ");
			curr=curr.right;
		}
	}
	
	public static void preorder(node root) {
		Stack<node>st=new Stack<>();
		node curr=root;
		
		while(curr!=null || !st.isEmpty()) {
			while(curr!=null) {
				System.out.print(curr.data + " ");
				st.push(curr);
				curr=curr.left;
			}
			curr=st.peek();
			st.pop();
			curr=curr.right;
		}
		System.out.println();
	}
	
	public static void postorder(node root) {
		Stack<node>st=new Stack<>();
		node curr=root;
		node temp;
		while(curr!=null || !st.isEmpty()) {
			
			while(curr!=null) {
				st.push(curr);
				curr=curr.left;
			}
			temp=st.peek().right;
			if(temp==null) {
				temp=st.peek();
				st.pop();
				System.out.print(temp.data + " ");
				
				while(!st.isEmpty() && temp==st.peek().right) {
					temp=st.pop();
					System.out.print(temp.data+" ");
				}
			}else {
				curr=temp;
			}
		}
		System.out.println();
	}
	
	
	public static void main(String arg[]) {
		
		node root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		root.left.left=new node(4);
		root.left.right=new node(5);
		root.right.left=new node(6);
		root.right.right=new node(7);
		root.left.left.left=new node(8);
		root.right.left.right=new node(9);
		preorder(root);
		postorder(root);
		flatten(root);
		inorder(root);
	}
}
