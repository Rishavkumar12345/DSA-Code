package linked_list;
import java.util.*;

class link{
	int data;
	link next;
	
	link(int val){
		data=val;
		next=null;
	}
}

public class reverse_k {
	
	public static void append(link root,int val) {
		
		link new_node=new link(val);
		new_node.next=null;
		
		if(root==null) {
			root=new_node;
			return;
		}
		link temp=root;
		while(temp.next!=null) {
			temp=temp.next;
		}
		
		temp.next=new_node;
		
	}
	
	public static link reverse(link root,int k) {
		
		if(root==null) {
			return null;
		}
		
		link curr=root;
		link prev=null;
		link upn=null;
		
		int count=0;
		
		while(count<k && curr!=null) {
			
			upn=curr.next;
			curr.next=prev;
			
			prev=curr;
			curr=upn;
			count++;
		}
		
		if(upn!=null) {
			root.next=reverse(upn,k);
		}
		return prev;
	}
	
	public static void display(link root) {
		link n=root;
		
		while(n!=null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
		//System.out.print("null");
		//System.out.println();
	}
	
	public static void main(String args[]) {
		
		link root=null;
		append(root,1);
		append(root,2);
		append(root,3);
		append(root,4);
		append(root,5);
		append(root,6);
		append(root,7);
		append(root,8);
		append(root,9);
		append(root,10);
		append(root,11);
		display(root);
		
		link node=reverse(root,3);
		
		display(node);
	}
}
