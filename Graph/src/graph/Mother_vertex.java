package graph;
import java.util.*;

public class Mother_vertex {
	
	public static void addEdge(int u,int v,ArrayList<ArrayList<Integer>>adj) {
		
		adj.get(u).add(v);
		//adj.get(v).add(u);
	}
	
	public static void dfa(ArrayList<ArrayList<Integer>>adj,int node,boolean vis[]) {
		
		vis[node]=true;
		
		for(Integer it:adj.get(node)) {
			if(vis[it]==false) {
				dfa(adj,it,vis);
			}
		}
	}
	
	public static void main(String args[]) {
		
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>();
		
		int v=7;
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		boolean vis[]=new boolean[v];
		
		addEdge(0, 1,adj);
	    addEdge(0, 2,adj);
	    addEdge(1, 3,adj);
	    addEdge(4, 1,adj);
	    addEdge(6, 4,adj);
	    addEdge(5, 6,adj);
	    addEdge(5, 2,adj);
	    addEdge(6, 0,adj);
	    
	    int ans = 0;
	    for(int i=0;i<v;i++) {
	    	if(vis[i]==false) {
	    		dfa(adj,i,vis);
	    		ans=i;
	    	}
	    }

	    boolean checkvis[]=new boolean[v];
	    dfa(adj,ans,checkvis);
	    
	    for(int i=0;i<v;i++) {
	    	if(checkvis[i]==false) {
	    		System.out.print("No mother vertex exists");
	    		return;
	    	}
	    }
	    System.out.print(ans + " is the mother vertex");
	    
	}
}
