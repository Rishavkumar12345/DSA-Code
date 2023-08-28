//deletion of node;

package linked_list;

public class circular_insertion {
    
    node head;

    circular_insertion(){
        head=null;
    }

    public class node{
        int data;
        node next;

        node(int val){
            data=val;
            next=null;
        }
    };

    public void addFirst(int val){

        node newnode=new node(val);
        newnode.next=head;
        head=newnode;
        return;
    }

    public void addLast(int val){

        node m=new node(val);

        if(head==null){
            head=m;
            return;
        }else{
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=m;
        }
        return;
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        node temp=head;
        head=temp.next;
        return;
    }

    public int leng(){
        int count=0;
        node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public void removeMiddle(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }

        int len=leng();

        node temp=head;
        int x=0;
        while(temp.next!=null && x<len/2-1){
            temp=temp.next;
            x++;
        }
        temp.next=temp.next.next;
    }

    public void removeLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }

        node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    public void display(){
        node n=head;
        while(n!=null){
            System.out.print(n.data + " ");
            n=n.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
    	circular_insertion ll=new circular_insertion();

        ll.addFirst(5);
        ll.addLast(15);
        ll.addLast(25);
        ll.addLast(35);
        ll.addLast(45);
        ll.addLast(55);
        ll.display();
        ll.removeLast();
        ll.display();
        
    }
}
