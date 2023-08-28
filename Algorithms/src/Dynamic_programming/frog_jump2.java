//time-complexity=O(n);
//space-complexity=O(1);

package Dynamic_programming;
import java.util.*;

public class frog_jump2 {
	public static void main(String args[]) {
		int height[]= {30,10,60 , 10 , 60 , 50};
		int n=height.length;
		int prev=0;
		int prev2=0;
		
		for(int i=1;i<n;i++) {
			int jumptwo=Integer.MAX_VALUE;
			int jumpone=prev+Math.abs(height[i]-height[i-1]);
			
			if(i>1) {
				jumptwo=prev2+Math.abs(height[i]-height[i-2]);
			}
			int curr_i=Math.min(jumpone, jumptwo);
			prev2=prev;
			prev=curr_i;
		}
		System.out.println(prev);
	}
	
}
