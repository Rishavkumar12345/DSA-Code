package Dynamic_programming;
import java.util.*;

public class Buy_and_sell_stock2 {
	
	//memoiazation
	public static int profit(int arr[],int i,int n,int buy,int dp[][]) {
		
		if(i==n) {
			return 0;
		}
		
		if(dp[i][buy]!=-1) {
			return dp[i][buy];
		}
		
		int p=0;
		
		if(buy==0) {
			p=Math.max(0+profit(arr,i+1,n,0,dp),-arr[i]+profit(arr,i+1,n,1,dp));
		}
		
		if(buy==1) {
			p=Math.max(0+profit(arr,i+1,n,1,dp),arr[i]+profit(arr,i+1,n,0,dp));
		}
		return dp[i][buy]=p;
	}
	
	//recursion
	/*public static int profit(int arr[],int i,int n,int buy) {
		
		if(i==n) {
			return 0;
		}
		
		int p=0;
		
		if(buy==0) {
			p=Math.max(0+profit(arr,i+1,n,0),-arr[i]+profit(arr,i+1,n,1));
		}
		
		if(buy==1) {
			p=Math.max(0+profit(arr,i+1,n,1),arr[i]+profit(arr,i+1,n,0));
		}
		return p;
	}*/
	
	public static void main(String args[]) {
		
		int arr[]=  {7,1,5,3,6,4};
		int n=arr.length;
		
		int dp[][]=new int[n][2];
		for(int[] row:dp) {
			Arrays.fill(row, -1);
		}
		
		int ans=profit(arr,0,n-1,0,dp);  //0-buy , 1-sell;
		System.out.println("maximum profit he can make "+ans);
	}
}
