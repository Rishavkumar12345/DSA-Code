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

public class subtree {
	
	node root1;
	node root2;
	
	public static boolean isIdentical(node root,node sroot) {
		
		if(root==null && sroot==null) {
			return true;
		}
		
		if(root==null || sroot==null) {
			return false;
		}
		
		return ((root.data==sroot.data) && isIdentical(root.left,sroot.left) && isIdentical(root.right,sroot.right));
			
	}
	
	public static boolean isSubtree(node t,node s) {
		
		if(s==null) {
			return true;
		}
		
		if(t==null) {
			return false;
		}
		
		//check from node is there is substree
		if(isIdentical(t,s)) {
			return true;
		}
		
		/* If the tree with root as current node doesn't match then
        try left and right subtrees one by one */
		return isSubtree(t.left,s) || isSubtree(t.right,s);
	}
	
	public static void main(String args[]) {
		subtree tree=new subtree();
		
		//tree1
		tree.root1 = new node(26);
        tree.root1.right = new node(3);
        tree.root1.right.right = new node(3);
        tree.root1.left = new node(10);
        tree.root1.left.left = new node(4);
        tree.root1.left.left.right = new node(30);
        tree.root1.left.right = new node(6);
        
        //tree2
        tree.root2 = new node(10);
        tree.root2.right = new node(6);
        tree.root2.left = new node(4);
        tree.root2.left.right = new node(30);
		
        
        if (tree.isSubtree(tree.root1, tree.root1))
            System.out.println("Tree 2 is subtree of Tree 1 ");
        else
            System.out.println("Tree 2 is not a subtree of Tree 1");
    	
	}
}
