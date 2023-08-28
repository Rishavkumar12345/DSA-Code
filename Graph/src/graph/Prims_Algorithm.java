package graph;
import java.util.*;

class Node{
	private int u;
	private int wt;
	
	Node(int x,int y){
		u=x;
		wt=y;
	}
	
	Node(){}
	
	int getu() {
		return u;
	}
	
	int getw() {
		return wt;
	}
}

public class Prims_Algorithm {
	
	public static void primalgo(ArrayList<ArrayList<Node>>adj,int v) {
		
		int key[]=new int[v];
		int par[]=new int[v];
		boolean mst[]=new boolean[v];
		
		for(int i=0;i<v;i++) {
			key[i]=1000000;
			mst[i]=false;
			par[i]=-1;
		}
		
		key[0]=0;
		par[0]=-1;
		
		for(int i=0;i<v-1;i++) {
			int mini=1000000,u=0;
			
			for(int j=0;j<v;j++) {
				if(mst[j]==false && key[j]<mini) {
					mini=key[j];
					u=j;
				}
			}
			
			mst[u]=true;
			
			for(Node it:adj.get(u)) {
				if(mst[it.getu()]==false && key[it.getu()]>it.getw()) {
					key[it.getu()]=it.getw();
					par[it.getu()]=u;
				}
			}
		}
		
		for(int i=1;i<v;i++) {
			System.out.println(key[i]+ " "+ i);
		}
	}
	
	public static void main(String args[]) {
		int v=5;
		
		ArrayList<ArrayList<Node>>adj=new ArrayList<ArrayList<Node>>(v);
		
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<Node>());
		}
		
		adj.get(0).add(new Node(1, 2));
		adj.get(1).add(new Node(0, 2));
		
		adj.get(1).add(new Node(2, 3));
		adj.get(2).add(new Node(1, 3));
		
		adj.get(0).add(new Node(3, 6));
		adj.get(3).add(new Node(0, 6));
		
		adj.get(1).add(new Node(3, 8));
		adj.get(3).add(new Node(1, 8));
		
		adj.get(1).add(new Node(4, 5));
		adj.get(4).add(new Node(1, 5));
		
		adj.get(2).add(new Node(4, 7));
		adj.get(4).add(new Node(2, 7));
		
		primalgo(adj,v);
	}
}
