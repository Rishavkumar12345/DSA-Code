package graph;
import java.util.*;

public class BFS {
	
	public static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	public static void bfa(ArrayList<ArrayList<Integer>>adj,int x) {
		
		boolean vis[]=new boolean[5];
		Queue<Integer>q=new LinkedList<>();
		
		q.add(x);
		vis[x]=true;
		
		while(!q.isEmpty()) {
			int node=q.poll();
			System.out.print(node+" ");
			
			for(Integer it:adj.get(node)) {
				if(vis[it]==false) {
					vis[it]=true;
					q.add(it);
				}
			}
		}
	}
	
	public static void main(String args[]) {
		
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>();
		
		int v=5;
		for(int i=0;i<5;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		addEdge(adj,1,0);
	    addEdge(adj,1,2);
	    addEdge(adj,2,0);
	    addEdge(adj,0,3);
	    addEdge(adj,3,4);
	    bfa(adj,0);
	}
}
