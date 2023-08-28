package Binary_tree;
import java.util.*;

import Binary_tree.insertion.node;
import java.util.*;

public class deletion {
	static class node{
		int data;
		node left;
		node right;
		
		node(int x){
			data=x;
			left=right=null;
		}
	};
	
	//function to delete deepest node;
	public static void deleteDeepestNode(node root,node delnode) {
		
		Queue<node>q=new LinkedList<node>();
		node temp=null;
		
		while(!q.isEmpty()) {
			temp=q.peek();
			q.remove();
			
			if(temp==delnode) {
				temp=null;
				return;
			}
			
			if(temp.left!=null) {
				if(temp.left==delnode) {
					temp.left=null;
					return;
				}else {
					q.add(temp.left);
				}
			}
			
			if(temp.right!=null) {
				if(temp.right==delnode) {
					temp.right=null;
					return;
				}else {
					q.add(temp.right);
				}
			}
		}
		
	}
	
	//function to delete given node
	public static void remove(node root,int val) {
		
		if(root==null){
			return;
		}
		
		if(root.left==null && root.right==null) {
			if(root.data==val) {
				root=null;
				return;
			}
		}
		
		node last=null;
		node keynode=null;
		
		Queue<node>q=new LinkedList<node>();
		q.add(root);
		
		while(!q.isEmpty()) {
			last=q.peek();
			q.remove();
			
			if(last.data==val) {
				keynode=last;
			}
			
			if(last.left!=null) {
				q.add(last.left);
			}
			
			if(last.right!=null) {
				q.add(last.right);
			}
		}
		
		if(keynode!=null) {
			int x=last.data;		//value of deepest node is assign to x;
			deleteDeepestNode(root,last);	//function to delete deepest node;
			keynode.data=x;
		}
	}
	
	public static void inorder(node root) {
		node n=root;
		
		if(n==null) {
			return;
		}
		inorder(n.left);
		System.out.print(n.data + " ");
		inorder(n.right);
	}
	
	public static void main(String args[]) {
		node root=null;
		root = new node(10);
		root.left = new node(11);
		root.left.left = new node(7);
		root.left.right = new node(12);
		root.right = new node(9);
		root.right.left = new node(15);
		root.right.right = new node(8);
        
        System.out.println("initial tree: ");
        inorder(root);
        System.out.println();
        
        remove(root,11);
        
        System.out.println("final tree: ");
        inorder(root);
        System.out.println();
	}
}
