//time-complexity=O(n);
//space-complexity=O(n)+O(n);

package Dynamic_programming;
import java.util.*;

public class frog_jump {
	
	public static int jump(int height[],int i,int dp[]) {
		
		if(i==0) {
			return 0;
		}
		
		if(dp[i]!=-1) {
			return dp[i];
		}
		
		int jumptwo=Integer.MAX_VALUE;
		int jumpone=jump(height,i-1,dp)+Math.abs(height[i]-height[i-1]);
		
		if(i>1) {
			jumptwo=jump(height,i-2,dp)+Math.abs(height[i]-height[i-2]);
		}
		
		return dp[i]=Math.min(jumptwo, jumpone);
	}
	
	public static void main(String args[]) {
		
		int height[]= {30,10,60 , 10 , 60 , 50};
		int n=height.length;
		int dp[]=new int[n];
		Arrays.fill(dp, -1);
		System.out.println(jump(height,n-1,dp));
	}
}
