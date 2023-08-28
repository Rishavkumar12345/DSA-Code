package linked_list;

import linked_list.pratice.node;

public class swap {
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
	
	public void swaplist(int x,int y) {
		
		if(x==y) {
			return;
		}
		
		node currx=head;
		node prevx=null;
		while(currx!=null && currx.data!=x) {
			prevx=currx;
			currx=currx.next;
		}
		
		node curry=head;
		node prevy=null;
		while(curry!=null && curry.data!=y) {
			prevy=curry;
			curry=curry.next;
		}
		
		if(currx==null && curry==null) {
			return;
		}
		
		if(prevx!=null) {
			prevx.next=curry;
		}else {
			head=curry;
		}
		
		if(prevy!=null) {
			prevy.next=currx;
		}else {
			head=currx;
		}
		
		node temp=curry.next;
		curry.next=currx.next;
		currx.next=temp;
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
		swap ll=new swap();
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		ll.push(5);
		ll.push(6);
		System.out.println("initial list : ");
		ll.display();
		ll.swaplist(3,5);
		System.out.println("final list : ");
		ll.display();
	}
}
