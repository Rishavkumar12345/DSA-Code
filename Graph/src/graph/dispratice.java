package graph;
import java.util.*;


class node{
	int u;
	int wt;
	
	node(int a,int c){
		u=a;
		wt=c;
	}
	
	int getu() {
		return u;
	}
	
	int getwt() {
		return wt;
	}
}

public class dispratice {
	
	public static void find(ArrayList<ArrayList<node>>adj,int v) {
		
		int dis[]=new int[v];
		
		Arrays.fill(dis, Integer.MAX_VALUE);
		
		PriorityQueue<node>pq=new PriorityQueue<node>();
		
		dis[0]=0;
		pq.add(new node(0,0));
		
		while(!pq.isEmpty()) {
			
			node p=pq.poll();
			int u=p.getu();
			
			for(node it:adj.get(u)) {
				if(dis[it.getu()]>dis[u]+it.getwt()) {
					dis[it.getu()]=dis[u]+it.getwt();
					pq.add(new node(it.getu(),dis[it.getwt()]));
				}
			}
		}
		
		for(int i=0;i<v;i++) {
			System.out.println(dis[i]+" ");
		}
	}
	
	public static void main(String args[]) {
		
		int v=5;
		ArrayList<ArrayList<node>>adj=new ArrayList<ArrayList<node>>();
		
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<node>());
		}
		
		adj.get(0).add(new node(1, 2));
		adj.get(1).add(new node(0, 2));
		
		adj.get(1).add(new node(2, 4));
		adj.get(2).add(new node(1, 4));
		
		adj.get(0).add(new node(3, 1));
		adj.get(3).add(new node(0, 1));
		
		adj.get(3).add(new node(2, 3));
		adj.get(2).add(new node(3, 3));
		
		adj.get(1).add(new node(4, 5));
		adj.get(4).add(new node(1, 5));
		
		adj.get(2).add(new node(4, 1));
		adj.get(4).add(new node(2, 1));
		
		find(adj,v);
	}
}
