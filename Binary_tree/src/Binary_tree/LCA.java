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

public class LCA {
	
	public static node Lowest_common_ancesstor(node root,int n1,int n2) {
		node temp=root;
		
		if(temp==null) {
			return null;
		}
		
		if(root.data==n1 && root.data==n2) {
			return root;
		}
		
		node leftlca=Lowest_common_ancesstor(temp.left,n1,n2);
		node rightlca=Lowest_common_ancesstor(temp.right,n1,n2);
		
		if(leftlca!=null && rightlca!=null) {
			return temp;
		}
		
		if(leftlca!=null) {
			return Lowest_common_ancesstor(root.left,n1,n2);
		}else {
			return Lowest_common_ancesstor(root.right,n1,n2);
		}
	}
	
	public static void main(String arg[]) {
		
		//LCA l=new LCA();
		node root=null;
	    root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		root.left.left=new node(4);
		root.left.right=new node(5);
		root.right.left=new node(6);
		root.right.right=new node(7);
		
		node lca=Lowest_common_ancesstor(root,2,3);
		if(lca!=null) {
			System.out.println("LCA IS: " + lca.data);
		}else {
			System.out.println("LCA does not exists");
		}
		
	}
}
