package Binary_tree;
import java.util.*;

class node{
	int data;
	node left,right;
	
	node(int x){
		data=x;
		left=right=null;
	}
}
public class iterative_traversal {
	
	public static void preorder(node root) {
		Stack<node>st=new Stack<>();
		node curr=root;
		
		while(!st.isEmpty() || curr!=null) {
			
			while(curr!=null) {
				System.out.print(curr.data + " ");
				st.push(curr);
				curr=curr.left;
			}
			curr=st.pop();
			curr=curr.right;
		}
		System.out.println();
	}
	
	public static void inorder(node root) {
		Stack<node>st=new Stack<>();
		node curr=root;
		
		while(!st.isEmpty() || curr!=null) {
			while(curr!=null) {
				st.push(curr);
				curr=curr.left;
			}
			curr=st.pop();
			System.out.print(curr.data + " ");
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
				temp=st.pop();
				System.out.print(temp.data+ " ");
				while(!st.empty() && temp==st.peek().right) {
					temp=st.pop();
					System.out.print(temp.data+ " ");
				}
			}else {
				curr=temp;
			}
		}
	}
	
	public static void main(String args[]) {
		
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
		inorder(root);
		postorder(root);
	}
}
