//Put Even Position Nodes after Odd Position Nodes

package linked_list;
import java.util.*;

public class even_odd_1 {
	
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
		
		node odd=head;
		node even=head.next;
		node evenstart=even;
		
		while(odd.next!=null && even.next!=null) {
			odd.next=even.next;
			odd=odd.next;
			even.next=odd.next;
			even=even.next;
		}
		
		odd.next=evenstart;
		if(odd.next!=null) {
			even.next=null;
		}
	}
	
	public static void display() {
		
		node n=head;
		while(n!=null) {
			System.out.print(n.data + " -> ");
			n=n.next;
		}
		System.out.print("null");
	}
	
	public static void main(String args[]) {
		
		even_odd_1 li=new even_odd_1();
		
		li.push(1);
		li.push(2);
		li.push(3);
		li.push(4);
		li.push(5);
		li.push(6);
		
		li.display();
		even_odd();
		System.out.println();
		li.display();
		
	}
}
