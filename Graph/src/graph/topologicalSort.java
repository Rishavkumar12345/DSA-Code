//BFS = Kahn Algorithm's

package graph;
import java.util.*;

public class topologicalSort {
	
	public static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v,int in[]) {
		adj.get(u).add(v);
		in[v]++;
	}
	
	public static void main(String arg[]) {
		
		int v=6;
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(v);
		
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		int in[]=new int[v];
		
		addEdge(adj,5, 2,in);
        addEdge(adj,5, 0,in);
        addEdge(adj,4, 0,in);
        addEdge(adj,4, 1,in);
        addEdge(adj,2, 3,in);
        addEdge(adj,3, 1,in);
        
        Queue<Integer>q=new LinkedList<>();
        
        for(int i=0;i<v;i++) {
        	if(in[i]==0) {
        		q.add(i);
        	}
        }
		
		while(!q.isEmpty()) {
			int x=q.peek();
			q.remove();
			
			System.out.print(x + " ");
			
			for(int it:adj.get(x)) {
				in[it]--;
				if(in[it]==0) {
					q.add(it);
				}
			}
		}
	}
}
