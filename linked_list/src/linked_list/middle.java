package linked_list;

public class middle {
	node head;
	
	middle(){
		head=null;
	}
	
	public class node{
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
	
	public void split() {
		node fast=head;
		node slow=head;
		
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		node first=head;
		node second=slow.next;
		slow.next=null;
		
		System.out.println("first list is :");
		node n=first;
		while(n!=null) {
			System.out.print(n.data + " ");
			n=n.next;
		}System.out.println();
		
		System.out.println("second list is :");
		node n1=second;
		while(n1!=null) {
			System.out.print(n1.data + " ");
			n1=n1.next;
		}
	}
	
	
	
	public static void main(String arg[]) {
		middle ll=new middle();
		ll.push(2);
		ll.push(3);
		ll.push(4);
		ll.push(5);
		ll.push(6);
		ll.split();
	}
}
