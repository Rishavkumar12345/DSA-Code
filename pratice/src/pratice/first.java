package pratice;
import java.util.*;


class pair{
	int u;
	int wt;
	
	pair(int a,int c){
		u=a;
		wt=c;
	}
	
	int getu() {
		return u;
	}
	
	int getwt() {
		return wt;
	}
}

public class first {
	
	public static void find(ArrayList<ArrayList<pair>>adj,int v) {
		
		int dis[]=new int[v];
		
		Arrays.fill(dis, Integer.MAX_VALUE);
		
		PriorityQueue<pair>pq=new PriorityQueue<pair>();
		
		dis[0]=0;
		pq.add(new pair(0,0));
		
		while(!pq.isEmpty()) {
			
			pair p=pq.poll();
			int u=p.getu();
			
			for(pair it:adj.get(u)) {
				if(dis[it.getu()]>dis[u]+it.getwt()) {
					dis[it.getu()]=dis[u]+it.getwt();
					pq.add(new pair(it.getu(),dis[it.getwt()]));
				}
			}
		}
		
		for(int i=0;i<v;i++) {
			System.out.println(dis[i]+" ");
		}
	}
	
	public static void main(String args[]) {
		
		int v=5;
		ArrayList<ArrayList<pair>>adj=new ArrayList<ArrayList<pair>>();
		
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<pair>());
		}
		
		adj.get(0).add(new pair(1, 2));
		adj.get(1).add(new pair(0, 2));
		
		adj.get(1).add(new pair(2, 4));
		adj.get(2).add(new pair(1, 4));
		
		adj.get(0).add(new pair(3, 1));
		adj.get(3).add(new pair(0, 1));
		
		adj.get(3).add(new pair(2, 3));
		adj.get(2).add(new pair(3, 3));
		
		adj.get(1).add(new pair(4, 5));
		adj.get(4).add(new pair(1, 5));
		
		adj.get(2).add(new pair(4, 1));
		adj.get(4).add(new pair(2, 1));
		
		find(adj,v);
	}
}
