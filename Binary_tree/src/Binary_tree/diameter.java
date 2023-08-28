package Binary_tree;
import java.util.*;

class node{
	int data;
	node left;
	node right;
	
	node(int x){
		data=x;
		left=null;
		right=null;
	}
}

class height{
	static int h;
}

public class diameter {
	
	node root;
	
	public int calcDia(node root,height h) {
		
		if(root==null) {
			height.h=0;
			return 0;
		}
		
		height lh=new height();
		height rh=new height();
		
		int ld=calcDia(root.left,lh);
		int rd=calcDia(root.right,rh);
		
		int currDia=lh.h+rh.h+1;
		height.h=Math.max(lh.h, rh.h)+1;
		
		return Math.max(currDia, Math.max(ld, rd));
	}
	
	public static void main(String args[]) {
		diameter tree=new diameter();
		tree.root=new node(1);
		tree.root.left=new node(2);
		tree.root.right=new node(3);
		tree.root.left.left=new node(4);
		tree.root.left.right=new node(5);
		tree.root.right.left=new node(6);
		tree.root.right.right=new node(7);
		System.out.print("Diameter of above tree is : ");
		
		height h=new height();
		System.out.print(tree.calcDia(tree.root, h));
		
	}
}
