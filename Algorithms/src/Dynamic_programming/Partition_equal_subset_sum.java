 //Partition Equal Subset Sum

package Dynamic_programming;
import java.util.*;

public class Partition_equal_subset_sum {
	
	public static boolean check(int i,int arr[],int target,int dp[][]) {
		
		if(target==0) {
			return true;
		}
		
		if(i==0) {
			return arr[0]==target;
		}
		
		if(dp[i][target]!=-1) {
			return dp[i][target]==0?false:true;
		}
		
		boolean take=false;
		if(arr[i]<target) {
			take=check(i-1,arr,target-arr[0],dp);
		}
		
		boolean nottake=check(i-1,arr,target,dp);
		
		dp[i][target]=take||nottake?1:0;
		
		return take||nottake;
	}
	
	public static void main(String args[]) {
		
		int arr[]= {2,2,1,1,1,1,1,3,3};
		int n=arr.length;
		int sum=0;
		
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		
		if(sum%2==0) {
			int k=sum/2;
			int dp[][]=new int[n][k+1];
			
			for(int[] row:dp) {
				Arrays.fill(row,-1);
			}
			
			System.out.println("is partition of array possibe into two equal subset sum: "+check(n-1,arr,k,dp));
		}else {
			System.out.println("partition does not exist");
		}
	}
}
