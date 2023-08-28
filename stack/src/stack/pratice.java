package stack;
import java.util.*;

class node{
	int key;
	int value;
	node next;
	node prev;
	
	node(int a,int b){
		key=a;
		value=b;
		next=prev=null;
	}
}

class lru{
	node head=new node(0,0);
	node tail=new node(0,0);
	HashMap<Integer,node>hm=new HashMap<>();
	int capacity;
	
	lru(int c){
		capacity=c;
	}
	
	public  void insert(node temp) {
		hm.put(temp.key, temp);
		node n=head.next;
		head.next=temp;
		temp.prev=head;
		temp.next=n;		
		n.prev=temp;
		
	}
	
	public int get(int k) {
		if(hm.containsKey(k)) {
			node temp=hm.get(k);
			remove(temp);
			insert(temp);
			return temp.value;
		}
		return -1;
	}
	
	public void remove(node temp) {
		hm.remove(temp.value);
		temp.prev.next=temp.next;
		temp.next.prev=temp.prev;
	}
	
	public void put(int k,int v) {
		if(hm.containsKey(k)) {
			hm.remove(hm.get(k));
		}
		
		if(hm.size()==capacity) {
			remove(tail.prev);
		}
		insert(new node(k,v));
	}
}

public class pratice {
	public static void main(String args[]) {
		lru cache = new lru(2);
		cache.put(1, 1); // cache is {1=1}
		cache.put(2, 2); // cache is {1=1, 2=2}
		System.out.println(cache.get(1));    // return 1
		cache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
		System.out.println(cache.get(2));   // returns -1 (not found)
		cache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
		System.out.println(cache.get(1));    // return -1 (not found)
		System.out.println(cache.get(3));    // return 3
		System.out.println(cache.get(4)); 
	}
}
