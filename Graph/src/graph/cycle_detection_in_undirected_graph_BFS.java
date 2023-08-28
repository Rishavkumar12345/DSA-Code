package graph;
import java.util.*;

class pair{
	
	int fir;
	int sec;
	
	public pair(int src, int i) {
		fir=src;
		sec=i;
	}
}

public class cycle_detection_in_undirected_graph_BFS{
	
	
	public static void addEdge(int u,int v,ArrayList<ArrayList<Integer>>adj) {
		adj.get(u).add(v);
		adj.get(v).add(u);
		
	}
	
	public static boolean check(int n,ArrayList<ArrayList<Integer>>adj,boolean vis[]) {
		int src=n;
	    vis[src]=true;
	    
	    Queue<pair>q=new LinkedList<>();
	    q.add(new pair(src,-1));
	    
	    while(!q.isEmpty()) {
	    	src=q.peek().fir;
	    	int par=q.peek().sec;
	    	q.poll();
	    	
	    	for(int i:adj.get(src)) {
	    		if(vis[i]==false) {
	    			vis[i]=true;
	    			q.add(new pair(i,src));
	    		}else if(par!=i) {
	    			return true;
	    		}
	    	}
	    	
	    }
	    return false;
	}
	
	public static boolean checkcycle(int v,ArrayList<ArrayList<Integer>>adj) {
		
		boolean vis[]=new boolean[v];
	    
	    for(int i=0;i<v;i++) {
	    	if(vis[i]==false) {
	    		if(check(0,adj,vis)==true) {
			    	return true;
			    }
	    	}
	    	
	    }
	    return false;
	}
	
	public static void main(String args[]) {
			
			int v=7;
			
			ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(v);
			
			for(int i=0;i<v;i++) {
				adj.add(new ArrayList<>());
			}
			
			//cycle is present
			/*addEdge(0, 1,adj);
		    addEdge(0, 2,adj);
		    addEdge(1, 2,adj);
		    addEdge(4, 1,adj);
		    addEdge(6, 4,adj);
		    addEdge(5, 6,adj);
		    addEdge(5, 2,adj);
		    addEdge(6, 0,adj);*/
		    
			//cycle is not present
		    addEdge(0, 1,adj);
		    addEdge(1, 2,adj);
		    
		    if(checkcycle(v,adj)==true) {
		    	System.out.println("cylce is  present");
		    }else {
		    	System.out.println("cylce is not present");
		    }
    
	}
}