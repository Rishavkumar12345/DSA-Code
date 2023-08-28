//Maximum Sum of nodes in Binary tree such that no two are adjacent 

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

public class dsa_205 {
	
	public static int sumofgrandchild(node root) {
		if(root==null) {
			return 0;
		}
		
		int sum=0;
		if(root.left!=null) {
			sum+=root.data+sumofgrandchild(root.left.left)+sumofgrandchild(root.left.right);
		}
		
		if(root.right!=null) {
			sum+=root.data+sumofgrandchild(root.right.left)+sumofgrandchild(root.right.right);
		}
		
		return sum;
	}
	
	public static int findmaxsumutil(node root,HashMap<node,Integer>hm) {
		
		if(root==null) {
			return 0;
		}
		
		if(hm.containsKey(root)) {
			return hm.get(root);
		}
		
		int curr=root.data+sumofgrandchild(root.left)+sumofgrandchild(root.right);
		
		int exc=findmaxsumutil(root.left,hm)+findmaxsumutil(root.right,hm);
		
		hm.put(root, Math.max(curr,exc));
		
		return hm.get(root);
		
	}

	public static int findmaxsum(node root) {
		
		if(root==null) {
			return 0;
		}
		
		HashMap<node,Integer>hm=new HashMap<>();
		return findmaxsumutil(root,hm);
		
	}
	
	public static void main(String args[]) {
		
		node root=new node(1);
		root.left = new node(2);
        root.right = new node(3);
        root.right.left = new node(4);
        root.right.right = new node(5);
        root.left.left = new node(1);
        
        System.out.println(findmaxsum(root));
	}
}
