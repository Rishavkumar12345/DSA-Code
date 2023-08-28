package graph;
import java.util.*;

class pair{
	int v;
	int wt;
	
	pair(int a,int w){
		v=a;
		wt=w;
	}
}

public class prims_algorithm_pq {
	
	public static void prismalgo(ArrayList<ArrayList<pair>>adj,int src,int v) {
		
		PriorityQueue<pair>pq=new PriorityQueue<pair>((x,y)-> x.wt-y.wt);
		pq.add(new pair(src,0));
		
		boolean vis[]=new boolean[v];
		int sum=0;
	
		while(!pq.isEmpty()) {
			
			int w=pq.peek().wt;
			int node=pq.peek().v;
			pq.poll();
			
			if(vis[node]==true) {
				continue;
			}
			
			vis[node]=true;
			sum+=w;
			
			for(pair i:adj.get(node)) {
				
				int x=i.v;
				int y=i.wt;
				
				if(vis[x]==false) {
					pq.add(new pair(x,y));
				}				
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String args[]) {
		
		int v=9;
		ArrayList<ArrayList<pair>>adj=new ArrayList<ArrayList<pair>>(v);
		
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<pair>());
		}
		
		adj.get(0).add(new pair(1, 2));
		adj.get(1).add(new pair(0, 2));
		
		adj.get(1).add(new pair(2, 3));
		adj.get(2).add(new pair(1, 3));
		
		adj.get(0).add(new pair(3, 6));
		adj.get(3).add(new pair(0, 6));
		
		adj.get(1).add(new pair(3, 8));
		adj.get(3).add(new pair(1, 8));
		
		adj.get(1).add(new pair(4, 5));
		adj.get(4).add(new pair(1, 5));
		
		adj.get(2).add(new pair(4, 7));
		adj.get(4).add(new pair(2, 7));
		
		prismalgo(adj,0,v);
	}
}
