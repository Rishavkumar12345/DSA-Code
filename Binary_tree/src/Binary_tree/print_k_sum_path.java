package Binary_tree;
import java.util.*;

class node{
	int data;
	node left;
	node right;
	
	node(int val){
		data=val;
		left=right=null;
	}
}

public class print_k_sum_path {
	
	public static void printpath(ArrayList<Integer>l,int i) {
		for(int j=i;j<l.size();j++) {
			System.out.print(l.get(j)+ " ");
		}
		System.out.println();
	}
	
	public static void printkvalue(node root,int k,ArrayList<Integer>l) {
		
		if(root==null) {
			return;
		}
		
		l.add(root.data);
		
		printkvalue(root.left,k,l);
		printkvalue(root.right,k,l);
		
		int f=0;
		for(int i=l.size()-1;i>=0;i--) {
			f+=l.get(i);
			
			if(f==k) {
				printpath(l,i);
			}
			
		}
		l.remove(l.size()-1);
	}
	
	public static void main(String args[]) {
		
		node root = new node(1);
        root.left = new node(3);
        root.left.left = new node(2);
        root.left.right = new node(1);
        root.left.right.left = new node(1);
        root.right = new node(-1);
        root.right.left = new node(4);
        root.right.left.left = new node(1);
        root.right.left.right = new node(2);
        root.right.right = new node(5);
        root.right.right.right = new node(2);
        
        int k=5;
        ArrayList<Integer>l=new ArrayList<>();
        printkvalue(root,k,l);
	}
}
