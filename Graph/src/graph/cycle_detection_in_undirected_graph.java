package graph;
import java.util.*;

public class cycle_detection_in_undirected_graph {
	
	public static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v) {
		
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	public static boolean iscycle(ArrayList<ArrayList<Integer>>adj,int src,boolean vis[],int par) {
		
		vis[src]=true;
		
		for(int it:adj.get(src)) {
			
			//to avoid going from 0->1 and 1->0 repeatedly
			if(it!=par) {
				if(vis[it]) {
					return true;
				}
			}
			
			if(vis[it]==false) {
				if(iscycle(adj,it,vis,src)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String args[]) {
		
		int v=5;
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(v);
		
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		addEdge(adj,1, 0);
        addEdge(adj,0, 2);
        addEdge(adj,2, 1);
        addEdge(adj,0, 3);
        addEdge(adj,3, 4);
        
        boolean vis[]=new boolean[v];
        boolean cycle=false;
        
        for(int i=0;i<v;i++) {
        	if(vis[i]==false)
        		cycle=iscycle(adj,i,vis,-1);
        }
        
        if(cycle) {
        	System.out.print("cycle is present");
        }else {
        	System.out.print("cycle is not present");
        }
	}
}
