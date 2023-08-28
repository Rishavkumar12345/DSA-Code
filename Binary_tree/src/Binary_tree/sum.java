//Find Largest subtree sum in a tree;

package Binary_tree;
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

public class sum {
	node root;
	static int ans=Integer.MIN_VALUE;
	
	public static int findSum(node root) {
		
		if(root==null) {
			return 0;
		}
		
		int l=findSum(root.left);
		int r=findSum(root.right);
		
		ans=Math.max(ans, root.data+l+r);
		
		return(root.data+l+r);
	}
	
	public static void main(String args[]) {
		
		sum tree=new sum();
		tree.root=new node(1);
		tree.root.left=new node(-2);
		tree.root.right=new node(3);
		tree.root.left.left=new node(4);
		tree.root.left.right=new node(5);
		tree.root.right.left=new node(-6);
		tree.root.right.right=new node(2);
		
		//int ans=Integer.MIN_VALUE;
		int a=findSum(tree.root);
		System.out.println(ans);
	}
}
