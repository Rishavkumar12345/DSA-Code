package linked_list;

public class pratice {
	
	public class node{
		int data;
		node next;
		
		node(int x){
			data=x;
			next=null;
		}
	};
	
	public void push(node head,int val) {
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
	
	public void display(node head) {
		node n=head;
		while(n!=null) {
			System.out.print(n.data + " ");
			n=n.next;
		}
	}
	
	public static void main(String args[]) {
		node head=null;
		pratice ll=new pratice();
		ll.push(head, 0);
		ll.push(head, 1);
		ll.push(head, 2);
		ll.push(head, 3);
		ll.display(head);
	}
}
