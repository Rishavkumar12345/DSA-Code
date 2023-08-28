package graph;
import java.util.*;


public class Bipertite{
	
	public static void addEdge(int u,int v,ArrayList<ArrayList<Integer>>adj) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	public static boolean isbipertite(ArrayList<ArrayList<Integer>>adj,int color[],int src) {
		
		color[src]=1;
		Queue<Integer>q=new LinkedList<>();
		q.add(src);
		
		while(!q.isEmpty()) {
			int node=q.poll();
			
			for(int it:adj.get(node)) {
				if(color[it]==-1) {
					color[it]=1-color[node];
					q.add(it);
				}else if(color[it]==color[node]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		
		int v=7;
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(v);
		
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		addEdge(0, 1,adj);
	    addEdge(0, 2,adj);
	    addEdge(1, 2,adj);
	    addEdge(4, 1,adj);
	    addEdge(6, 4,adj);
	    addEdge(5, 6,adj);
	    addEdge(5, 2,adj);
	    addEdge(6, 0,adj);
	    
	    int color[]=new int[v];
	    Arrays.fill(color, -1);

	    
	    boolean check=false;
	    
	    for(int i=0;i<v;i++){
	    	if(color[i]==-1) {
	    		if(isbipertite(adj,color,i)) {
	    			check=true;
	    		}else {
	    			break;
	    		}
	    	}
	    }
	    
	    if(check) {
	    	System.out.println("Graph is bipertite");
	    }else {
	    	System.out.println("Graph is not bipertite");
	    }
	}
}