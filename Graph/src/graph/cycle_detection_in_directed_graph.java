package graph;
import java.util.*;

public class cycle_detection_in_directed_graph {
	
	public static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v) {
		adj.get(u).add(v);
		
	}
	
	public static boolean iscycle(ArrayList<ArrayList<Integer>>adj,int src,boolean vis[],boolean st[]) {
		vis[src]=true;
		st[src]=true;
		
		for(int it:adj.get(src)) {
			if(vis[it]==false) {
				if(iscycle(adj,it,vis,st))
					return true;
			}else if(st[it]){
				return true;
			}
		}
		st[src]=false;
		return false;
	}
	
	public static void main(String args[]) {
		
		int v=6;
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(v);
		
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		addEdge(adj,0, 1);
        addEdge(adj,0, 2);
        addEdge(adj,1, 2);
        addEdge(adj,2, 0);
        addEdge(adj,2, 3);
        addEdge(adj,3, 3);
       
        
        boolean vis[]=new boolean[v];
        boolean st[]=new boolean[v];
        
        boolean cycle=false;
        
        for(int i=0;i<v;i++) {
        	if(vis[i]==false) {
        		cycle=iscycle(adj,i,vis,st);
        	}
        }
        
        if(cycle) {
        	System.out.print("cycle is present");
        }else {
        	System.out.print("cycle is not present");
        }
	}
}
