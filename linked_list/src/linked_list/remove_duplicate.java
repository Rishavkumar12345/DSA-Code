package linked_list;

import linked_list.swap.node;

public class remove_duplicate {
	node head;
	
	class node{
		int data;
		node next;
		
		node(int x){
			data=x;
			next=null;
		}
	};
	
	public void push(int val) {
		node newnode=new node(val);
		newnode.next=null;
		if(head==null) {
			head=newnode;
			return;
		}else {
			node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}
	
	public void delDuplicate() {
		node curr=head;
		while(curr!=null) {
			node temp=curr;
			while(temp!=null && temp.data==curr.data) {
				temp=temp.next;
			}
			curr.next=temp;
			curr=curr.next;
		}	
	}
	
	
	
	public void display(){
		node n=head;
		while(n!=null) {
			System.out.print(n.data + " ");
			n=n.next;
		}
		System.out.println();
	}
	
	public static void main(String arg[]) {
		remove_duplicate ll=new remove_duplicate();
		ll.push(1);
		ll.push(2);
		ll.push(2);
		ll.push(4);
		ll.push(5);
		ll.push(5);
		System.out.println("inital list: ");
		ll.display();
		ll.delDuplicate();
		System.out.println("final list: ");
		ll.display();
		
	}
}
