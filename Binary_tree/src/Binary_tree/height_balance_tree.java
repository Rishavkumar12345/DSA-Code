package Binary_tree;
import java.util.*;

class node{
	int data;
	node left;
	node right;
	
	node(int x){
		data=x;
		left=right=null;
	};
}



public class height_balance_tree {
	
	public static int check_balance(node root) {
		
		if(root==null) {
			return 0;
		}
		
		int lh=check_balance(root.left);
		int rh=check_balance(root.right);
		
		if(lh==-1 || rh==-1) {
			return -1;
		}
		
		if(Math.abs(rh-lh)>1) {
			return -1;
		}
		
		return Math.max(lh, rh)+1;
	}
	
	static int height(node temp) {
		
		if(temp==null) {
			return 0;
		}
		
		int lh=height(temp.left);
		int rh=height(temp.right);
		return Math.max(lh, rh)+1;
	}
	
	static boolean isBalance(node root) {
		
		node curr=root;
		
		if(curr==null) {
			return true;
		}
		
		if(isBalance(curr.left)==false) {
			return false;
		}
		
		if(isBalance(curr.right)==false) {
			return false;
		}
		
		int lh=height(curr.left);
		int rh=height(curr.right);
		
		if(Math.abs(rh-lh)<=1) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String args[]) {
		node root=null;
		root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		
		if(check_balance(root)!=-1) {
			System.out.print("Balanced tree");
		}else {
			System.out.print("Not balanced tree");
		}
	}
}
