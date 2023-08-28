//Maximum Sum of Non-Adjacent Elements 

package Dynamic_programming;
import java.util.*;

public class Maximum_sum_of_non_adjacent {
	
	//time complexity=O(n),space complexity=O(n)
	public static int fun(int arr[],int dp[],int n) {
		
		if(n==0) {
			return arr[0];
		}
		if(n<1) {
			return 0;
		}
		
		if(dp[n]!=-1) {
			return dp[n];
		}
		
		int pick=arr[n]+fun(arr,dp,n-2);
		int notpick=0+fun(arr,dp,n-1);
		dp[n]=Math.max(pick, notpick);
		return dp[n];
	}
	
	//time complexity=O(n),space complexity=O(1)
	public static int nonAjacent(int arr[],int n) {
		
		int prev2=0;
		int prev=arr[0];
		
		for(int i=1;i<n;i++) {
			int take=arr[i];
			if(i>1) {
				take+=prev2;
			}
			int notake=prev;
			int curri=Math.max(take,notake);
			
			prev2=prev;
			prev=curri;
		}
		return prev;
	}
	
	public static void main(String args[]) {
		int n=3;
		int arr[]= {2,1,4,9};
		int dp[]=new int[n+1];
		
		for(int i=0;i<=n;i++) {
			dp[i]=-1;
		}
		
		System.out.println(fun(arr,dp,n));
		System.out.println(nonAjacent(arr,n));
	}
}
