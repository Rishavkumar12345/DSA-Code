package Dynamic_programming;
import java.util.*;

public class Longest_Increasing_Subsequence {
	
	//tabulation
	public static int count1(int arr[],int n) {
		
		int dp[][]=new int[n+1][n+1];
		
		for(int[] row:dp) {
			Arrays.fill(row, 0);
		}
		
		for(int i=n-1;i>=0;i--) {
			for(int p=i-1;p>=-1;p--) {
				int nottake=0+dp[i+1][p+1];
				int take=0;
				
				if(p==-1 || arr[i]>arr[p]) {
					take=1+dp[i+1][i+1];
				}
				dp[i][p+1]=Math.max(nottake, take);
			}			
		}
		return dp[0][0];
	}
	
	//memoization
	public static int count(int arr[],int i,int prev,int dp[][]) {
			
		if(i==arr.length) {
			return 0;
		}
		
		if(dp[i][prev+1]!=-1) {
			return dp[i][prev+1];
		}
		
		int nottake=0+count(arr,i+1,prev,dp);
		int take=0;
		if(prev==-1 || arr[i]>arr[prev]) {
			take=1+count(arr,i+1,i,dp);
		}
			
		return dp[i][prev+1]=Math.max(nottake, take);
	}
	
	//recursion
	/*public static int count(int arr[],int i,int prev) {
		
		if(i==arr.length) {
			return 0;
		}
		
		int nottake=0+count(arr,i+1,prev);
		int take=0;
		
		if(prev==-1 || arr[i]>arr[prev]) {
			take=1+count(arr,i+1,i);
		}
		
		return Math.max(nottake, take);
	}*/
	
	public static void main(String args[]) {
		
		int arr[]= {1,8,5,6,4,9};
		int n=arr.length;
		int dp[][]=new int[n][n+1];
		
		for(int[] row:dp) {
			Arrays.fill(row, -1);
		}
		
		int ans=count(arr,0,-1,dp);
		
		System.out.println("longest increasing subsequence having length "+ans);
		
		/*int ans=count1(arr,n);
		
		System.out.println("longest increasing subsequence having length "+ans);*/
	}
}
