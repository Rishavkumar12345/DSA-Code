//Segregate even and odd nodes in a Linked List

package linked_list;
import java.util.*;

public class even_odd_2 {
	
static node head=null;
	
	public class node{
	
		int data;
		node next;
		
		node(int x){
			data=x;
			next=null;
		}
	};
	
	public  void push(int val) {
		
		node new_node=new node(val);
		new_node.next=null;
		
		if(head==null) {
			head=new_node;
			return;
		}else {
			node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=new_node;
		}		
	}
	
	public static void even_odd() {
		
		node evenstart=null;
		node evenend=null;
		node oddstart=null;
		node oddend=null;
		node curr=head;
		
		while(curr!=null) {
			
			int n=curr.data;
			
			if(n%2==0) {
				
				if(evenstart==null) {
					evenstart=curr;
					evenend=evenstart;
				}else {
					evenend.next=curr;
					evenend=evenend.next;
				}
			}else {
				
				if(oddstart==null) {
					oddstart=curr;
					oddend=oddstart;
				}else {
					oddend.next=curr;
					oddend=oddend.next;
				}
			}
			curr=curr.next;
		}
		
		if(oddstart==null || evenstart==null) {
			return;
		}
		
		evenend.next=oddstart;
		oddend.next=null;
		head=evenstart;
		
	}
	
	 public static void printList()
	    {
	        node temp = head;
	        while(temp != null)
	        {
	            System.out.print(temp.data+" ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
	 
	 public static void main(String args[]) {
		 
		 even_odd_2 llist=new even_odd_2();
		 
		 	llist.push(11);
	        llist.push(10);
	        llist.push(9);
	        llist.push(6);
	        llist.push(4);
	        llist.push(1);
	        llist.push(0);
	        System.out.println("Original Linked List");
	        llist.printList();
	        
	        llist.even_odd();
	        System.out.println("Modified Linked List");
	        llist.printList();
	 }
}
