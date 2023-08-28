package Binary_tree;
import java.util.*;

class node{
	int data;
	node left;
	node right;
	
	node(int x){
		data=x;
		left=right=null;
	}
};

public class binaryTreeToLinkedList {
	
	static node prev=null;
	
	public static void convert(node root) {

		if(root==null) {
			return;
		}
		
		convert(root.right);
		convert(root.left);
		root.right=prev;
		root.left=null;
		
		prev=root;
	}
	
	public static void display(node n) {
		while(n!=null) {
			System.out.print(n.data + " ");
			n=n.right;
		}
	}
	
	public static void main(String args[]) {
		
		node root=null;
		root = new node(10);
        root.left = new node(12);
        root.right = new node(15);
        root.left.left = new node(25);
        root.left.right = new node(30);
        root.right.left = new node(36);
        convert(root);
        display(root);
        
	}
	
}
