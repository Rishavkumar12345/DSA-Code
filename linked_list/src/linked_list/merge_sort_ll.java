package linked_list;
import java.util.*;

public class merge_sort_ll {
	
	node head;
	
	class node{
		
		int data;
		node next;
		
		node(int x){
			data=x;
		}
	};
	
	public void push(int val) {
		
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
	
	public static node merge(node a,node b) {
		
		if(a==null) {
			return b;
		}
		
		if(b==null) {
			return a;
		}
		
		node result=null;
		
		if(a.data<=b.data) {
			result=a;
			result.next=merge(a.next,b);
		}else {
			result=b;
			result.next=merge(a,b.next);
		}
		return result;
	}
	
	public static node mergesort(node head) {
		
		if(head==null || head.next==null) {
			return head;
		}
		node middle=getmid(head);
		node aftermid=middle.next;
		
		middle.next=null;
		
		node left=mergesort(head);
		
		node right=mergesort(aftermid);
		
		node finallist=merge(left,right);
		
		return finallist;
	}
	
	public static node getmid(node temp) {
		
		if(temp==null) {
			return null;
		}
		
		node slow=temp;
		node fast=temp;
		
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	public static void printlist(node n) {
		
		while(n!=null) {
			System.out.print(n.data + " -> ");
			n=n.next;
		}
		System.out.print("null");
	}
	
	public static void main(String args[]) {
		
		merge_sort_ll li=new merge_sort_ll();
		
		li.push(15);
		li.push(1);
		li.push(10);
		li.push(5);
		li.push(9);
		li.push(20);
		li.push(2);
		
		
		node root=li.mergesort(li.head);
		li.printlist(root);
	}
}
