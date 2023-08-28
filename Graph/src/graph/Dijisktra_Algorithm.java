package graph;
import java.util.*;

public class Dijisktra_Algorithm {
	
	static class Node{
		int u,wt;
		
		Node(int x,int y){
			u=x;
			wt=y;
		}
		
		int getv() {
			return u; 
		}
	    int getw() {
	    	return wt; 
	    }
	}
	
	public static void shortestPath(ArrayList<ArrayList<Node>>adj,int src,int v) {
		
		int dis[]=new int[v];
		
		for(int i=0;i<v;i++) {
			dis[i]=1000000;
		}
		
		dis[src]=0;
		
		PriorityQueue<Node>pq=new PriorityQueue<Node>();
		pq.add(new Node(src,0));
		
		while(!pq.isEmpty()) {
			Node x=pq.poll();
			
			for(Node it:adj.get(x.getv())) {
				if(dis[x.getv()]+it.getw()<dis[it.getv()]) {
					dis[it.getv()]=dis[x.getv()]+it.getw();
					pq.add(new Node(it.getv(),dis[it.getv()]));
				}
			}
		}
		for(int i=0;i<v;i++) {
			System.out.print(dis[i]+ " ");
		}
	}
	
	public static void main(String args[]) {
		
		int v=5;
		
		ArrayList<ArrayList<Node>>adj=new ArrayList<ArrayList<Node>>();
		
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<Node>());
		}
		
		adj.get(0).add(new Node(1, 2));
		adj.get(1).add(new Node(0, 2));
		
		adj.get(1).add(new Node(2, 4));
		adj.get(2).add(new Node(1, 4));
		
		adj.get(0).add(new Node(3, 1));
		adj.get(3).add(new Node(0, 1));
		
		adj.get(3).add(new Node(2, 3));
		adj.get(2).add(new Node(3, 3));
		
		adj.get(1).add(new Node(4, 5));
		adj.get(4).add(new Node(1, 5));
		
		adj.get(2).add(new Node(4, 1));
		adj.get(4).add(new Node(2, 1));
		
		shortestPath(adj,0,v);
	}
}
