package stack;
import java.util.*;

class stack{
	stack prev;
	int data;
	stack next;
	
	stack(int val){
		prev=next=null;
		data=val;
	}
}

public class operation_on_middle_element {
	
	static stack head;
	static stack mid;
	static int size=0;
	
	public static void push(int val) {
		
		stack new_node=new stack(val);
		
		if(size==0) {
			head=new_node;
			mid=new_node;
			size++;
			return;
		}
		
		head.next=new_node;
		new_node.prev=head;
		
		head=head.next;
		if(size%2==0) {
			mid=mid.next;
		}
		size++;
		
	}
	
	public static void deletemidelement() {
		
		if(size==0) {
			System.out.println("stack is empty");
			return;
		}
		
		if(size==1) {
			head=null;
			mid=null;
			size=0;
		}else if(size==2){
			head=head.prev;
			mid=mid.prev;
			size--;
		}else {
			mid.next.prev=mid.prev;
			mid.prev.next=mid.next.prev;
			if(size%2==0) {
				mid=mid.prev;
			}else {
				mid=mid.next;
			}
		}
	}
	
	public static void midelement() {
		
		if(size==0) {
			System.out.println("stack is empty");
			return;
		}
		
		System.out.println("middle element is "+mid.data);
	}
	
	public static void main(String args[]) {
		operation_on_middle_element ms=new operation_on_middle_element();
		ms.push(11);
        ms.push(22);
        ms.push(33);
        ms.push(44);
        ms.push(55);
        ms.push(66);
        ms.push(77);
        ms.push(88);
        ms.push(99);
        
        ms.midelement();
        ms.deletemidelement();
        ms.midelement();
	}
}
