//subset sum rqual to target

package Dynamic_programming;
import java.util.*;

public class Subset_sum_equal_to_target {
	
	//space optimization=O(target)
	public static boolean checksubset3(int n,int target,int arr[]) {
	
		boolean prev[]=new boolean[target+1];
		boolean curr[]=new boolean[target+1];
		
		prev[0]=curr[0]=true;
		prev[arr[0]]=true;
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<target;j++) {
				boolean nottake=prev[i];
				boolean take=false;
				
				if(arr[i]<j) {
					take=prev[j-arr[i]];
				}
				
				curr[j]=take||nottake;
			}
			prev=curr;
		}
		return curr[target];
	}
	
	//tabulation
	/*public static boolean checksubset2(int n,int target,int arr[]) {
		
		boolean dp[][]=new boolean[n+1][target+1];
		
		for(int i=0;i<=n;i++) {
			dp[i][0]=true;
		}
		
		if(arr[0]<=target) {
			dp[0][arr[0]]=true;
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=target;j++) {
				
				boolean nottake=dp[i-1][j];
				boolean take=false;
				if(arr[i]<=j) {
					take=dp[i-1][j-arr[i]];
				}
				
				dp[i][j]=take||nottake;
			}
		}
		return dp[n][target];
	}*/
	
	//time complexcity=O(n*k)
	/*public static boolean checksubset1(int i,int target,int arr[],int dp[][]) {
		
		if(target==0) {
			return true;
		}
		
		if(i==0) {
			return arr[i]==target;
		}
		
		if(dp[i][target]!=-1) {
			return dp[i][target]==0?false:true;
		}
		
		boolean nottake=checksubset1(i-1,target,arr,dp);
		
		boolean take=false;
		if(arr[i]<=target) {
			take=checksubset1(i-1,target-arr[i],arr,dp);
			dp[i][target]=take||nottake?1:0;
		}
		
		return take||nottake;
	}*/
	
	//time complexity=O(2^n)
	/*public static boolean checksubset(int arr[],int target,int i) {
		
		if(target==0) {
			return true;
		}
		
		if(i==0) {
			return arr[i]==target;
		}
		
		boolean nottake=checksubset(arr,target,i-1);
		
		boolean take=false;
		if(arr[i]<target) {
			take=checksubset(arr,target-arr[i],i-1);
		}
		
		return take||nottake;		
	}*/
	
	public static void main(String args[]) {
		
		int arr[]={2,5,1,6,7};
		int k=4;
		int n=arr.length;
		
		int dp[][]=new int[n][k+1];
		for(int[] row:dp) {
			Arrays.fill(row, -1);
		}
		
		/*System.out.println("is there any subset exist with sum equal to k: "+checksubset(arr,k,n-1));*/
		System.out.println("is there any subset exist with sum equal to k: "+checksubset3(n-1,k,arr));
	}
}
