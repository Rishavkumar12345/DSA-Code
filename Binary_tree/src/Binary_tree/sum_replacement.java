package Binary_tree;
import java.util.*;

class node{
	int data;
	node left;
	node right;
	
	node(int val){
		data=val;
		left=right=null;
	}
}

public class sum_replacement {
	
	public static int sum_replace(node root) {
		
		if(root==null) {
			return 0;
		}
		
		int temp=root.data;
		
		int lh=sum_replace(root.left);
		int rh=sum_replace(root.right);
		
		root.data=temp+lh+rh;
		
		return temp+lh+rh;
	}
	
	public static void inorder(node root) {
		
		if(root==null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	public static void main(String args[]) {
		
		node root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		root.left.left=new node(4);
		root.left.right=new node(5);
		root.right.left=new node(6);
		root.right.right=new node(7);
		
		inorder(root);
		
		System.out.println();
		sum_replace(root);
		
		inorder(root);
	}
}
