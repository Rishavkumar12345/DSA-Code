package BST;
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

public class BST_to_Balance_BST {
	
	public static node balancetree(int start,int end,ArrayList<node>l) {
		
		if(start>end) {
			return null;
		}
		
		int mid=(start+end)/2;
		node temp=l.get(mid);
		
		temp.left=balancetree(start,mid-1,l);
		temp.right=balancetree(mid+1,end,l);
		
		return temp;
	}
	
	public static void inorder(node root,ArrayList<node>l) {
		
		if(root==null) {
			return;
		}
		
		inorder(root.left,l);
		l.add(root);
		inorder(root.right,l);
	}
	
	public static node buildtree(node root) {
		
		if(root==null) {
			return null;
		}
		
		ArrayList<node>l=new ArrayList<>();
		inorder(root,l);
		
		int n=l.size();
		
		return balancetree(0,n-1,l);
	}
	
	public static void preorder(node n) {
		if(n==null) {
			return;
		}
		
		System.out.print(n.data + " ");
		preorder(n.left);
		preorder(n.right);
	}
	
	public static void main(String args[]) {
		
		node root = new node(10);
        root.left = new node(8);
        root.left.left = new node(7);
        root.left.left.left = new node(6);
        root.left.left.left.left = new node(5);
        
        root=buildtree(root);
        
        System.out.println("preorder of balance bst tree is: ");
        preorder(root);
        
        buildtree(root);
	}
}
