package BST;
import java.util.*;

class Node{
	int data;
	Node left;
	Node right;
	
	Node(int val){
		data=val;
		left=null;
		right=null;
	}
}
public class check_BST {
	
	public static boolean check(Node root,int min,int max) {
		
		if(root==null) {
			return true;
		}
		
		if(root.data>=max || root.data<=min) {
			return false;
		}
		
		return check(root.left,min,root.data)||check(root.right,root.data,max);
	}
	
	public static void main(String args[]) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		root.left.left.left=new Node(8);
		root.right.left.right=new Node(9);
		boolean ans=check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		System.out.println(ans);
	}
}
