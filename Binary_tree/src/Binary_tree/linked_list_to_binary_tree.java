package Binary_tree;
import java.util.*;

class listnode{
	int data;
	listnode next;
	
	listnode(int x){
		data=x;
		next=null;
	}
}

class binarytreenode{
	int data;
	binarytreenode left,right;
	
	binarytreenode(int x){
		data=x;
		left=right=null; 
	}	
}

public class linked_list_to_binary_tree {
	
	static listnode head;
	static binarytreenode root;
	
	static void push(int val) {
		
		listnode newnode=new listnode(val);
		newnode.next=head;
		head=newnode;
	}
	
	binarytreenode construct(binarytreenode node) {
		
		Queue<binarytreenode>q=new LinkedList<binarytreenode>();
		
		if(head==null) {
			node=null;
			return node;
		}
		
		node=new binarytreenode(head.data);
		q.add(node);
		head=head.next;
		
		while(head!=null) {
			binarytreenode par=q.peek();
			
			binarytreenode leftchild=null;
			binarytreenode rightchild=null;
			
			leftchild=new binarytreenode(head.data);
			q.add(leftchild);
			head=head.next;
			
			if(head!=null) {
				rightchild=new binarytreenode(head.data);
				q.add(rightchild);
				head=head.next;
			}
			par.left=leftchild;
			par.right=rightchild;
			
			q.poll();			
		}
		
		return node;
	}
	
	static void inorderTraversal(binarytreenode node)
    {
        if (node != null)
        {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }
	
	public static void main(String args[]) {
		linked_list_to_binary_tree tree=new linked_list_to_binary_tree();
		tree.push(36); /* Last node of Linked List */
        tree.push(30);
        tree.push(25);
        tree.push(15);
        tree.push(12);
        tree.push(10);/* First node of Linked List */
        
        binarytreenode ans=tree.construct(root);
        
        System.out.println("Inorder Traversal of the"+
                " constructed Binary Tree is:");
        tree.inorderTraversal(ans);
	}
}
