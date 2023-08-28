//count subset with given sum

package Dynamic_programming;
import java.util.*;

public class Count_subset_with_sum_k {
	
	//tabulation
	public static int count(int n,int arr[],int k) {
		
		int dp[][]=new int[n][k+1];
		
		for(int i=0;i<n;i++) {
			dp[i][k]=1;
		}
		
		if(arr[0]<=k) {
			return dp[0][arr[0]]=1;
		}
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<=k;j++) {
				
				int nottaken=dp[i][j]+dp[i-1][j];
				
				int taken=0;
				if(arr[i]<=j) {
					taken=dp[i][j]+dp[i-1][j-arr[i]];
				}
				
				dp[i][j]=taken+nottaken;
			}
		}
		return dp[n-1][k];
		
	}
	
	//memoaizatation
	/*public static int count(int i,int arr[],int k,int dp[][]) {
		
		if(k==0) {
			return 1;
		}
		
		if(i==0) {
			return arr[0]==k?1:0;
		}
		
		if(dp[i][k]!=-1) {
			return dp[i][k];
		}
		
		int nottaken=count(i-1,arr,k,dp);
		
		int taken=0;
		if(arr[i]<=k) {
			taken=count(i-1,arr,k-arr[i],dp);
		}
		
		return dp[i][k]=taken+nottaken;
	}*/
	
	//recursion
	/*public static int count(int n,int arr[],int sum) {
		
		if(sum==0) {
			return 1;
		}
		
		if(n==0) {
			return arr[0]==sum?1:0;
		}
		
		int nottaken=count(n-1,arr,sum);
		
		int taken=0;
		if(arr[n]<=sum) {
			taken=count(n-1,arr,sum-arr[n]);
		}
		
		return taken+nottaken;
	}*/
	
	public static void main(String args[]) {
		
		int n=4;
		int sum=3;
		int arr[]= {1,2,2,3};
		
		int dp[][]=new int[n+1][sum+1];
		for(int[] row:dp) {
			Arrays.fill(row, -1);
		}
		
		int ans=count(n,arr,sum);
		System.out.println("total subset with given sum is "+ans);
	}
}
