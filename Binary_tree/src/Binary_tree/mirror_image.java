package Binary_tree;
import java.util.*;

class node{
	int data;
	node right;
	node left;
	
	node(int val){
		data=val;
		left=null;
		right=null;
	}
}

public class mirror_image {
	
	public static node image(node rot) {
		
		if(rot==null) {
			return null;
		}
		
		node li=image(rot.left);
		node ri=image(rot.right);
		
		rot.left=ri;
		rot.right=li;
		
		return rot;
	}
	
	public static void inorder(node n) {
		if(n==null) {
			return;
		}
		inorder(n.left);
		System.out.print(n.data + " ");
		inorder(n.right);
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
		inorder(root);
		System.out.println();
		node ans=image(root);
		inorder(ans);
	}
}
