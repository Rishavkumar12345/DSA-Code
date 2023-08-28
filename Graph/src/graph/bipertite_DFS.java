package graph;
import java.util.*;

public class bipertite_DFS {
	
	public static void addEdge(int u,int v,ArrayList<ArrayList<Integer>>adj) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	public static boolean check(int src,ArrayList<ArrayList<Integer>>adj,int color[]) {
		
		//color[src]=1;
		for(int i:adj.get(src)) {
			if(color[i]==-1) {
				color[i]=1-color[src];
				if(!check(i,adj,color)) {
					return false;
				}
			}else if(color[i]==color[src]) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkBipertite(ArrayList<ArrayList<Integer>>adj,int v,int color[]) {
		
		for(int i=0;i<v;i++) {
			if(color[i]==-1) {
				if(!check(i,adj,color)) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void main(String args[]) {
		
		int v=6;
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(v);
		
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		addEdge(0, 1,adj);
	    addEdge(1, 2,adj);
	    addEdge(1, 4,adj);
	    addEdge(1, 5,adj);
	    addEdge(2, 3,adj);
	    addEdge(3, 4,adj);
	    addEdge(3, 5,adj);
	    //addEdge(6, 0,adj);
	    
	    int color[]=new int[v];
	    Arrays.fill(color, -1);
	    
	    boolean ans=checkBipertite(adj,v,color);
	    if(ans) {
	    	System.out.println("Given graph is Bipertite");
	    }else {
	    	System.out.println("Given graph is Bipertite");
	    }
	}
}
