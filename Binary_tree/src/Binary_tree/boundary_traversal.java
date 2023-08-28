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

public class boundary_traversal {
	
	node root;
	
	public static void traverseleft(node root,ArrayList<Integer>ans) {
		
		if(root==null || (root.left==null && root.right==null)) {
			return;
		}
		ans.add(root.data);
		
		if(root.left!=null) {
			traverseleft(root.left,ans);
		}else {
			traverseleft(root.right,ans);
		}
	}
	
	public static void traverseleaf(node root,ArrayList<Integer>ans) {
		
		if(root==null) {
			return;
		}
		
		if(root.left==null && root.right==null) {
			ans.add(root.data);
			return;
		}
		
		traverseleaf(root.left,ans);
		traverseleaf(root.right,ans);
	}
	
	public static void traverseright(node root,ArrayList<Integer>ans) {
		
		if(root==null ||  (root.left==null && root.right==null)) {
			return;
		}
		if(root.right!=null) {
			traverseright(root.right,ans);
		}else {
			traverseright(root.left,ans);
		}
			
		ans.add(root.data);
	}
	
	public static void traversal(node root) {
		
		if(root==null) {
			return;
		}
		ArrayList<Integer>ans=new ArrayList<>();
		
		ans.add(root.data);
		
		//for traversing left boundary;
		traverseleft(root.left,ans);
		
		//for traversing leaf node
		traverseleaf(root,ans);
		
		//for traversing right boundary having right child
		traverseright(root.right,ans);
		
		//for traversing right bounadary having left child no right child
		traverseright(root.left,ans);
		
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i) + " ");
		}
	}
	
	public static void main(String args[]) {
		
		boundary_traversal tree=new boundary_traversal();
		tree.root=new node(1);
		tree.root.left=new node(2);
		tree.root.right=new node(3);
		tree.root.left.left=new node(4);
		tree.root.left.right=new node(5);
		tree.root.right.left=new node(6);
		tree.root.right.right=new node(7);
		
		tree.traversal(tree.root);
	}
}
