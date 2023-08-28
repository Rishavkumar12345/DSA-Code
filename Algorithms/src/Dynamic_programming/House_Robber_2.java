// House Robber

package Dynamic_programming;
import java.util.*;

public class House_Robber_2 {
	
	public static int non_adjacent(ArrayList<Integer>l) {
		
		int n=l.size();
		int prev=l.get(0);
		int prev2=0;
		
		for(int i=1;i<n;i++) {
			int pick=l.get(i);
			if(i>1) {
				pick+=prev2;
			}
			int not_pick=prev;
			int curri=Math.max(pick, not_pick);
			prev2=prev;
			prev=curri;
		}
		return prev;
	}
	
	public static void main(String args[]) {
		int arr[]= {2,3,2};
		int n=arr.length;
		
		ArrayList<Integer>l1=new ArrayList<>();
		ArrayList<Integer>l2=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			if(i!=0) {
				l1.add(arr[i]);
			}
			if(i!=n-1) {
				l2.add(arr[i]);
			}
		}
		
		int ans1=non_adjacent(l1);     //excluding last index;
		int ans2=non_adjacent(l2);	   //exculding first index;
		
		int ans=Math.max(ans1, ans2);
		System.out.println(ans);
	}
}
