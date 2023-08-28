package Binary_tree;
import java.util.*;

public class insertion {
	
	static class node{
		int data;
		node left;
		node right;
		
		node(int x){
			data=x;
			left=right=null;
		}
	}
	
	
	public static void insert_any_node(node root,int val) {
		
		node temp=root;
		if(temp==null) {
			temp=new node(val);
			return;
		}
		
		Queue<node>q=new LinkedList<node>();
		q.add(temp);
		
		while(temp!=null) {
			
			node curr=q.peek();
			q.remove();
			
			if(curr.left==null) {
				curr.left=new node(val);
				break;
			}else {
				q.add(curr.left);
			}
			
			if(curr.right==null) {
				curr.right=new node(val);
				break;
			}else {
				q.add(curr.right);
			}
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
        root.right = new node(9);
        root.right.left = new node(15);
        root.right.right = new node(8);
        
        System.out.println("initial tree: ");
        inorder(root);
        System.out.println();
        
        insert_any_node(root,12);
        System.out.println("final tree: ");
        inorder(root);
        
        
	}
}
