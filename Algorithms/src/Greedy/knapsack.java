//knapsack second approach using profit/weight

package Greedy;
import java.util.*;

class pair{
	int wt;
	int pt;
	
	pair(int a,int b){
		wt=a;
		pt=b;
	}
}

public class knapsack {
	
	/*public static int findmaxval(pair[] arr,int cap) {
		
		Arrays.sort(arr,new Comparator<pair>() {

			@Override
			public int compare(pair p1, pair p2) {
				
				double cp1=(double)((double)p1.pt/p1.wt);
				double cp2=(double)((double)p2.pt/p2.wt);
				
				if(cp1>cp2) {
					return -1;
				}else {
					return 1;
				}
				
			}
			
		});
		
		int totalval=0;
		
		for(pair it:arr) {
			int x=it.wt;
			int y=it.pt;
			
			if(cap-x>=0) {
				cap-=x;
				totalval+=y;
			}
		}
		return totalval;
	}*/
	
	public static void main(String args[]) {
		
		int weight[]= {2,3,5,7,1,4,1};
		int profit[]= {10,5,15,7,6,18,3};
		int maxw=15;
		
		ArrayList<pair>list=new ArrayList<>();
		for(int i=0;i<weight.length;i++) {
			list.add( new pair(weight[i],profit[i]));
		}
		
		Collections.sort(list,new Comparator<pair>() {
			@Override
			public int compare(pair p1, pair p2) {
				
				double cp1=(double)((double)p1.pt/p1.wt);
				double cp2=(double)((double)p2.pt/p2.wt);
				
				if(cp1>cp2) {
					return -1;
				}else {
					return 1;
				}
				
			}
		});
		
		
		int totalval=0;
		
		for(pair it:list) {
			int x=it.wt;
			int y=it.pt;
			
			if(maxw-x>=0) {
				maxw-=x;
				totalval+=y;
			}
		}
		System.out.println(totalval);
	}
}
