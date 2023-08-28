package BST;
import java.util.*;

import Binary_tree.node;

class node{
	int data;
	node right;
	node left;
	
	node(int val){
		data=val;
		right=left=null;
	}
}

public class built_BST {
	
	public static node built_tree(node root,int x) {
		
		if(root==null) {
			return new node(x);
		}
		if(x>root.data) {
			root.right=built_tree(root.right,x);
		}else if(x<root.data) {
			root.left=built_tree(root.left,x);
		}
		return root;
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
		
		node root=null;
		root=built_tree(root,5);
		built_tree(root,15);
		built_tree(root,2);
		built_tree(root,3);
		built_tree(root,10);
		built_tree(root,20);
		built_tree(root,16);
		built_tree(root,8);
		inorder(root);
	}
}
