package Dynamic_programming;
import java.util.*;

public class Longest_Bitonic_Subsequence {
	public static void main(String args[]) {
		
		int arr[]= {1,11,2,10,4,5,2,1};
		int n=arr.length;
		
		int dp[]=new int[n];
		int dp1[]=new int[n];
		
		Arrays.fill(dp, 1);
		Arrays.fill(dp1, 1);
		
		for(int i=0;i<n;i++) {
			for(int p=0;p<=i-1;p++) {
				if(arr[i]>arr[p] && dp[i]<1+dp[p]) {
					dp[i]= 1+dp[p];
				}
			}
		}
		
		for(int i=n-1;i>=0;i--) {
			for(int p=n-1;p>i;p--) {
				if(arr[i]>arr[p] && dp1[i]<1+dp1[p]) {
					dp1[i]= 1+dp1[p];
				}
			}
		}

		int ans=0;
		for(int i=0;i<n;i++) {
			ans=Math.max(ans, dp1[i]+dp[i]-1);
		}
		
		System.out.println("longest bitonic subsequence length is "+ans);
	}
}
