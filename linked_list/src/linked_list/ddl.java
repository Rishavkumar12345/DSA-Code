package linked_list;

import java.util.*;

class node{
    int data;
    node next;
    node prev;
 
    node(int val){
        data=val;
        next=prev=null;
    }   
}

public class ddl
{
    static node head=null;
    
    public static void insert(int val){
        node new_node=new node(val);
        if(head==null){
            head=new_node;
            return;
        }
        
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        
        new_node.prev=temp;
        temp.next=new_node;
        return;
    }
    
    public static void deletelast(){
        
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        
        node last=head.next;
        node slast=head;
        while(last.next!=null){
            last=last.next;
            slast=slast.next;
        }
        last.prev=null;
        slast.next=null;
        return;
    }
    
    public static void deletemid(int val){
        
        if(head==null){
            return;
        }
        
        node last=head.next;
        node slast=head;
        
        while(last!=null && last.data!=val){
            last=last.next;
            slast=slast.next;
        }
        
        slast.next=last.next;
        last.next.prev=slast;
    }
    
    public static node reverse(){
        node temp=null;
        node curr=head;
        
        while(curr!=null){
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;
        }
        
        if(temp!=null){
            head=temp.prev;
            return head;
        }
        return temp;
    }
    
    public static void display(){
        node n=head;
        
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println();
    }
    
	public static void main(String[] args) {
	    insert(11);
	    insert(12);
	    insert(14);
	    insert(15);
	    insert(16);
	    display();
	    //deletelast();
	    //display();
	    //deletemid(14);
	    //display();
	    head=reverse();
	    display();
	}
}

