package pratice;
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

public class bca {
	
	public node Lowest_common_ancesstor(node root,int n1,int n2) {
		
		if(root==null) {
			return null;
		}
		
		if(root.data==n1 && root.data==n2) {
			return root;
		}
		
		node leftlca=Lowest_common_ancesstor(root.left,n1,n2);
		node rightlca=Lowest_common_ancesstor(root.right,n1,n2);
		
		if(leftlca!=null && rightlca!=null) {
			return root;
		}
		
		if(leftlca!=null) {
			return Lowest_common_ancesstor(root.left,n1,n2);
		}else {
			return Lowest_common_ancesstor(root.right,n1,n2);
		}
	}
	
	public static void main(String arg[]) {
		
		bca l=new bca();
		node root=null;
		root=null;
	    root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		root.left.left=new node(4);
		root.left.right=new node(5);
		root.right.left=new node(6);
		root.right.right=new node(7);

		
		node temp=l.Lowest_common_ancesstor(root,2,3);
		if(temp!=null) {
			System.out.println("LCA is: " + temp.data);
		}else {
			System.out.println("LCA does not exists");
		}
		
	}
}
