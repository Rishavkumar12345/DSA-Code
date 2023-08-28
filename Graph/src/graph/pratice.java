package graph;
import java.util.*;

public class pratice {
	
	public static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	public static void dfs(ArrayList<ArrayList<Integer>>adj,int src,boolean vis[]) {
		
		System.out.print(src+" ");
		vis[src]=true;
		
		for(int it:adj.get(src)) {
			if(vis[it]==false) {
				dfs(adj,it,vis);
			}
		}
	}
	
	public static void main(String args[]) {
		
		int v=5;
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(v);
		
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        
        boolean vis[]=new boolean[v];
        
        //dfs(adj,0,vis);
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()) {
        	int node=q.poll();
        	System.out.print(node+" ");
        	
        	for(int it:adj.get(node)) {
        		if(vis[it]==false) {
        			vis[it]=true;
        			q.add(it);
        		}
        	}
        }
	}
}
