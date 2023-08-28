package stack;
import java.util.*;

class node{
	int key;
	int value;
	node next;
	node prev;
	
	node(int k,int v){
		key=k;
		value=v;
		next=prev=null;
	}
}

class LRUCache{
	node head=new node(0,0);
	node tail=new node(0,0);
	HashMap<Integer,node>hm=new HashMap<>();
	int capacity;
	
	LRUCache(int c){
		capacity=c;
		head.next=tail;
		tail.prev=head;
	}
	
	public int get(int n) {
		
		if(hm.containsKey(n)) {
			node temp=hm.get(n);
			remove(temp);
			insert(temp);
			return temp.value;
		}else {
			return -1;
		}
	}
	
	public void remove(node temp) {
		hm.remove(temp.value);
		temp.prev.next=temp.next;
		temp.next.prev=temp.prev;
	}
	
	public void insert(node temp) {
		
		hm.put(temp.key, temp);
		node n=head.next;
		head.next=temp;
		temp.prev=head;
		temp.next=n;
		n.prev=temp;
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

public class least_recent_use {
	public static void main(String args[]) {
		
		LRUCache lRUCache = new LRUCache(2);
		lRUCache.put(1, 1); // cache is {1=1}
		lRUCache.put(2, 2); // cache is {1=1, 2=2}
		System.out.println(lRUCache.get(1));    // return 1
		lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
		System.out.println(lRUCache.get(2));   // returns -1 (not found)
		lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
		System.out.println(lRUCache.get(1));    // return -1 (not found)
		System.out.println(lRUCache.get(3));    // return 3
		System.out.println(lRUCache.get(4));    // return 4
	}
}
