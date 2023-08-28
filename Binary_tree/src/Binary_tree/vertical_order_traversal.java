package Binary_tree;
import java.util.*;

class node{
	int data;
	node left,right;
	
	node(int val){
		data=val;
		left=right=null;
	}
}

class pair{
	int h;
	node pt;
	
	pair(int x,node hr){
		h=x;
		pt=hr;
	}
}

public static void traverse(node root) {
	Queue<pair>q=new ArrayDeque<>();
	Map<Integer,ArrayList<Integer>>map=new TreeMap<>();
	q.add(new pair(0,root));
	
	while(!q.isEmpty()) {
		pair curr=q.poll();
		if(map.containsKey(curr.h)) {
			map.get(curr.h).add(curr.pt.data);
		}else {
			ArrayList<Integer>temp=new ArrayList<>();
			temp.add(curr.pt.data);
			map.put(curr.h,temp);
		}
		if(curr.pt.left!=null) {
			q.add(new pair(curr.h-1,curr.pt.left));
		}
		if(curr.pt.right!=null) {
			q.add(new pair(curr.h+1,curr.pt.right));
		}
	}
	
	ArrayList<Integer>ans=new ArrayList<>();
	for(Map.Entry<Integer,ArrayList<Integer>>entry:map.entrySet()) {
		ans.addAll(entry.getValue());
	}
	
	for(int i=0;i<ans.size();i++) {
		System.out.print(ans.get(i)+" ");
	}
}

public class vertical_order_traversal {
	public static void main(String args[]) {
		node root=new node(1);
		root.left=new node(2);
		root.right=new node(3);
		root.left.left=new node(4);
		root.left.right=new node(5);
		root.right.left=new node(6);
		root.right.right=new node(7);
		root.right.left.right = new node(8);
		root.right.right.right = new node(9);
		traverse(root);
	}
}
