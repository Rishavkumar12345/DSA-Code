package graph;
import java.util.*;

public class kosaraju_algorithm {
	
	/*public static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v) {
		adj.get(u).add(v);
	}*/
	
	public static void dfs(ArrayList<ArrayList<Integer>>adj,int src,boolean vis[],Stack<Integer>st) {
		
		vis[src]=true;
		
		for(int it:adj.get(src)) {
			if(vis[it]==false) {
				dfs(adj,it,vis,st);
			}
		}
		st.push(src);
	}
	
	public static void revdfs(ArrayList<ArrayList<Integer>>transpose,int src,boolean vis[]) {
		
		vis[src]=true;
		System.out.print(src + " "); 
		for(Integer it : transpose.get(src)) {
			if(vis[it] == false) {
				revdfs(transpose,it, vis); 
			}
		}
	}
	
	public static void kosaraju(ArrayList<ArrayList<Integer>>adj,int v) {
		
		boolean vis[]=new boolean[v];
		Stack<Integer>st=new Stack<>();
		
		for(int i=0;i<v;i++) {
			if(vis[i]==false) {
				dfs(adj,i,vis,st);
			}
		}
		
		ArrayList<ArrayList<Integer>>transpose=new ArrayList<ArrayList<Integer>>(v);
		
		for(int i=0;i<v;i++) {
			transpose.add(new ArrayList<Integer>());
		}
		
		for(int i=0;i<v;i++) {
			vis[i]=false;
			
			for(int it:adj.get(i)) {
				transpose.get(it).add(i);
			}
		}
		
		while(!st.isEmpty()) {
			int node=st.peek();
			st.pop();
			
			for(int it:transpose.get(node)) {
				if(vis[it]==false) {
					System.out.print("scc: ");
					revdfs(transpose,it,vis);
					System.out.println();
				}
			}
		}
	}
	
	
	
	public static void main(String args[]) {
		
		int v=5;
		
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(v);
		
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		/*addEdge(adj,0, 1);
        addEdge(adj,1, 2);
        addEdge(adj,2, 0);
        addEdge(adj,1, 3);
        addEdge(adj,3, 4);*/
		
		adj.get(0).add(1);
		adj.get(1).add(2);
		adj.get(2).add(0);
		adj.get(1).add(3);
		adj.get(3).add(4);
        
        kosaraju(adj,v);
        
	}
}
