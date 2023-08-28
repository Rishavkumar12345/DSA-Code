package graph;
import java.util.*;

public class DFS {
	
	public static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	public static void dfa(ArrayList<ArrayList<Integer>>adj,int node,boolean vis[]) {
		
		vis[node]=true;
		System.out.print(node+" ");
		
		for(Integer it:adj.get(node)) {
			if(vis[it]==false) {
				dfa(adj,it,vis);
			}
		}
	}
	
	public static void main(String args[]) {
			
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>();
			
		int v=5;
		for(int i=0;i<5;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		boolean vis[]=new boolean[v];
		
		addEdge(adj,1,0);
	    addEdge(adj,1,2);
	    addEdge(adj,2,0);
	    addEdge(adj,0,3);
	    addEdge(adj,3,4);
	    
	    dfa(adj,0,vis);
	}
	
}
