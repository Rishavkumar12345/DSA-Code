package pratice;
import java.util.*;

class Node{
	int data;
	Node next;
	
	Node(int x){
		data=x;
		next=null;
	}
}

public class pratice1 {
	
	public static void append(Node head,int val) {
		Node newnode=new Node(val);
		newnode.next=null;
		
		if(head==null) {
			head=newnode;
			return;
		}
		
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
		return;
	}
	
	public static void printl(Node root) {
		while(root!=null) {
			System.out.print(root.data+" ");
			root=root.next;
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		
		Node root=null;
		append(root,1);
		append(root,2);
		printl(root);
	}
}
