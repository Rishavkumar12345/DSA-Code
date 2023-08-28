package graph;
import java.util.*;

public class topological_sort_dfs {
	
	public static void addEdge(int u,int v,ArrayList<ArrayList<Integer>>adj) {
		
		adj.get(u).add(v);
	}
	
	public static void check(int src,ArrayList<ArrayList<Integer>>adj,boolean vis[],Stack<Integer>st) {
		
		vis[src]=true;
		
		for(int i:adj.get(src)) {
			if(vis[i]==false) {
				check(i,adj,vis,st);
				
			}
		}
		st.add(src);
	}
	
	public static void main(String args[]) {
		
		int v=6;
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(v);
		
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<>());
		}
		
		 addEdge(5,2,adj);
		 addEdge(5,0,adj);
		 addEdge(4,0,adj);
		 addEdge(4,1,adj);
		 addEdge(2,3,adj);
		 addEdge(3,1,adj);
		 
		 boolean vis[]=new boolean[v];
		 
		 Stack<Integer>st=new Stack<>();
		 
		 for(int i=0;i<v;i++) {
			 if(vis[i]==false) {
				 //st.add(i);
				 check(i,adj,vis,st);
			 }
		 }
		 
		 System.out.println("topological sort of given graph is: ");
		 while(!st.isEmpty()) {
			 System.out.print(st.pop()+" ");
		 }
	}
}
