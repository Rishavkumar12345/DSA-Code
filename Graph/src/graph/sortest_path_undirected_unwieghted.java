package graph;
import java.util.*;

public class sortest_path_undirected_unwieghted {
	
	public static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	public static void sortest(ArrayList<ArrayList<Integer>>adj,int src,int v) {
		
		int dis[]=new int[v];
		
		for(int i=0;i<v;i++) {
			dis[i]=Integer.MAX_VALUE;
		}
		
		Queue<Integer>q=new LinkedList<>();
		q.add(src);
		dis[src]=0;
		
		while(!q.isEmpty()) {
			int node=q.poll();
			
			for(int it:adj.get(node)) {
				if(dis[node]+1<dis[it]) {
					dis[it]=dis[node]+1;
					q.add(it);
				}
			}
		}
		
		for(int i=0;i<v;i++) {
			System.out.print(dis[i]+ " ");
		}
	}

	public static void main(String arg[]) {
		
		int v=8;
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(v);
		
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		addEdge(adj, 0, 1);
        addEdge(adj, 0, 3);
        addEdge(adj, 1, 2);
        addEdge(adj, 3, 4);
        addEdge(adj, 3, 7);
        addEdge(adj, 4, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 4, 7);
        addEdge(adj, 5, 6);
        addEdge(adj, 6, 7);
        
        sortest(adj,0,v);
	}
}
