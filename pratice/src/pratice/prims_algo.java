package pratice;
import java.util.*;


class hode{
	private int u;
	private int wt;
	
	hode(){}
	
	hode(int x,int y){
		this.u=x;
		this.wt=y;
	}
	
	int getu() {
		return u;
	}
	
	int getwt() {
		return wt;
	}
}


public class prims_algo {
	
	public static void find_prims(ArrayList<ArrayList<hode>>adj,int v) {
		int key[]=new int[v];
		boolean[] mst=new boolean[v];
		
		for(int i=0;i<v;i++) {
			key[i]=100000;
			mst[i]=false;
		}
		
		key[0]=0;
		
		for(int i=0;i<v-1;i++) {
			int min=100000;
			int u=0;
			
			for(int j=0;j<v;j++) {
				if(mst[j]==false && key[j]<min) {
					min=key[j];
					u=j;
				}
			}
			
			mst[u]=true;
			
			for(hode it:adj.get(u)) {
				if(mst[it.getu()]==false && key[it.getu()]>it.getwt()) {
					key[it.getu()]=it.getwt();
				}
			}
		}
		
		for(int i=1;i<v;i++) {
			System.out.println(key[i]+ " "+ i);
		}
		
	}
	
	public static void main(String arg[]) {
		
		int v=5;
		
		ArrayList<ArrayList<hode>>adj=new ArrayList<ArrayList<hode>>(v);
		
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<>());
		}
		
		adj.get(0).add(new hode(1, 2));
		adj.get(1).add(new hode(0, 2));
		
		adj.get(1).add(new hode(2, 3));
		adj.get(2).add(new hode(1, 3));
		
		adj.get(0).add(new hode(3, 6));
		adj.get(3).add(new hode(0, 6));
		
		adj.get(1).add(new hode(3, 8));
		adj.get(3).add(new hode(1, 8));
		
		adj.get(1).add(new hode(4, 5));
		adj.get(4).add(new hode(1, 5));
		
		adj.get(2).add(new hode(4, 7));
		adj.get(4).add(new hode(2, 7));
		
		
		find_prims(adj,v);
	}

}
