package Recursion;
import java.util.*;

public class ncolour_graph {
	
	static int color[]=new int[5];
	
	public static void addEdge(int u,int v,ArrayList<ArrayList<Integer>>adj) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	public static boolean issafe(ArrayList<ArrayList<Integer>>adj,int col,int i) {
		
		for(Integer it:adj.get(i)) {
			if(color[it]==col) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean solve(ArrayList<ArrayList<Integer>>adj,int M,int n,int i) {
		if(i==n) {
			return true;
		}
		
		for(int col=1;col<=M;col++) {
			
			if(issafe(adj,col,i)) {
				color[i]=col;
				if(solve(adj,M,n,i+1)) {
					return true;
				}else {
					color[i]=0;
				}
			}
		}
		return false;
	}
	
	public static void main(String args[]) {
		
		int v=4,M=3;
		ArrayList<ArrayList<Integer>>adj=new ArrayList<>(v);
		
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		
		addEdge(0,1,adj);
		addEdge(1,0,adj);
		addEdge(1,2,adj);
		addEdge(2,1,adj);
		addEdge(2,3,adj);
		addEdge(3,2,adj);
		addEdge(3,0,adj);
		addEdge(0,3,adj);
		addEdge(0,2,adj);
		addEdge(2,0,adj);
		
		boolean ans=solve(adj,M,v,0);
		if(ans==true) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}
