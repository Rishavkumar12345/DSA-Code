package graph;
import java.util.*;

public class cycle_detection_in_directed_graph_kahnalgo {
	
	static int ind[]=new int[4];
	
	public static void addEdge(int u,int v,ArrayList<ArrayList<Integer>>adj) {
		
		adj.get(u).add(v);
		ind[v]++;
	}
	
	public static void main(String args[]) {
		
		int v=4;
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(v);
		
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<>());
		}
		
		 addEdge(0, 1,adj);
		 addEdge(0, 2,adj);
		 addEdge(1, 2,adj);
		 addEdge(2, 0,adj);
		 addEdge(2, 3,adj);
		 addEdge(3, 3,adj);
		 
		 Queue<Integer>q=new LinkedList<>();
		 
		 for(int i=0;i<v;i++) {
			 if(ind[i]==0) {
				 q.add(i);
			 }
		 }
		 
		 int count=0;
		 while(!q.isEmpty()) {
			 
			 int node=q.poll();
			 count++;
			 
			 for(int i:adj.get(node)) {
				 ind[i]--;
				 if(ind[i]==0) {
					 q.add(i);
				 }
			 }
		 }
		 
		 if(count==v) {
			 System.out.println("cylce is not present");
		 }else {
			 System.out.println("cylce is present");
		 }
	}
}
