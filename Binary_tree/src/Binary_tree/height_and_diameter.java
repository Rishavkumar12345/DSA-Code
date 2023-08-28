package Binary_tree;
import java.util.*;

class node{
	int data;
	node left;
	node right;
	
	node(int val){
		data=val;
		left=null;
		right=null;
	}
}
public class height_and_diameter {
	
	public static int height(node root) {
		node temp=root;
		
		if(temp==null) {
			return -1;
		}
		
		int lh=height(temp.left);
		int rh=height(temp.right);
		
		return Math.max(lh, rh)+1;
	}
	
	public static int diameter(node root) {
		
		node temp=root;
		if(temp==null) {
			return 0;
		}
		int lh=height(temp.left);
		int rh=height(temp.right);
		
		int ld=diameter(temp.left);
		int rd=diameter(temp.right);
		
		return Math.max(lh+rh+1,Math.max(ld, rd));
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
		System.out.println("height of tree is "+height(root));
		System.out.println("diameter of tree is "+diameter(root));
	}
}
