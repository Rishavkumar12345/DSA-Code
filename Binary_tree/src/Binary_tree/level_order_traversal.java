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

public class level_order_traversal {
	
	public static void levelOrder(node root) {
		
		if(root==null) {
			return;
		}
		
		Queue<node>q=new LinkedList<>();
		
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			
			
			
			node temp=q.peek();
			q.remove();
			
			if(temp!=null) {

				System.out.print(temp.data + " ");
				
				if(temp.left!=null) {
					q.add(temp.left);
				}
				
				if(temp.right!=null) {
					q.add(temp.right);
				}
			}else {
				if(!q.isEmpty()) {
					q.add(null);
				}
			}
			
		}
		
	}
	
	public static void main(String arg[]) {
		
		level_order_traversal ll=new level_order_traversal();
		node root=null;
		root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		root.left.left=new node(4);
		root.left.right=new node(5);
		root.right.left=new node(6);
		root.right.right=new node(7);
		ll.levelOrder(root);
	}
}
