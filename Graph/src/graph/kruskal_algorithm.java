package graph;
import java.util.*;

class kru{
	int u;
	int v;
	int wt;
	
	kru(int a,int b,int c){
		u=a;
		v=b;
		wt=c;
	}
}

class SortComparator implements Comparator<kru>{
	@Override
	public  int compare(kru n1,kru n2){
		
		if(n1.wt<n2.wt) {
			return -1;
		}else if(n1.wt>n2.wt) {
			return 1;
		}
		return 0;
	}
}

public class kruskal_algorithm{
	
	public static int findpar(int u,int par[]) {
		
		if(u==par[u]) {
			return u;
		}
		return par[u]=findpar(par[u],par);
	}
	
	public static void union(int u,int v,int par[],int rank[]) {
		
		u=findpar(u,par);
		v=findpar(v,par);
		
		if(rank[u]<rank[v]) {
			par[v]=u;
		}else if(rank[v]<rank[u]) {
			par[u]=v;
		}else {
			par[u]=v;
			rank[v]++;
		}
	}
	
	public static void kruskal(ArrayList<kru>adj,int v) {
		
		Collections.sort(adj,new SortComparator());
		
		int par[]=new int[v];
		int rank[]=new int[v];
		
		for(int i=0;i<v;i++) {
			rank[i]=0;
			par[i]=i;
		}
		
		int cost=0;
		ArrayList<kru>mst=new ArrayList<>();
		
		for(kru i:adj) {
			int a=i.u;
			int b=i.v;
			int w=i.wt;
			
			if(findpar(a,par)!=findpar(b,par)) {
				cost+=w;
				mst.add(i);
				union(a,b,par,rank);
			}
		}
		
		System.out.println("Minimum cost: "+cost);
		for(kru i:mst) {
			System.out.println(i.u+" "+i.v);
		}
	}
	
	public static void main(String args[]) {
		int v=5;
		
		ArrayList<kru>adj=new ArrayList<>(v);
		adj.add(new kru(0, 1, 2));
		adj.add(new kru(0, 3, 6));
		adj.add(new kru(1, 3, 8));
		adj.add(new kru(1, 2, 3));
		adj.add(new kru(1, 4, 5));
		adj.add(new kru(2, 4, 7));
		
		kruskal(adj,v);
	}
}
