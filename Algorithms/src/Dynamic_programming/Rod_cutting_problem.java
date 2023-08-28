//Rod cutting problem

package Dynamic_programming;
import java.util.*;

public class Rod_cutting_problem {
	
	//memoiazation
	public static int find(int p[],int i,int n,int dp[][]) {
		
		if(i==0) {
			return n*p[0];
		}
		
		if(dp[i][n]!=-1) {
			return dp[i][n];
		}
		
		int nottake=0+find(p,i-1,n,dp);
		int take=Integer.MIN_VALUE;
		
		int rodlen=i+1;
		if(rodlen<=n) {
			take=p[i]+find(p,i,n-rodlen,dp);
		}
		
		return dp[i][n]=Math.max(take, nottake);
	}
	
	//recursion
	/*public static int find(int price[],int i,int N) {
		
		if(i==0) {
			return N*price[0];
		}
		
		int nottake=0+find(price,i-1,N);
		int take=Integer.MIN_VALUE;
		
		int rodlen=i+1;
		if(rodlen<=N) {
			take=price[i]+find(price,i,N-rodlen);
		}
		
		return Math.max(take, nottake);
	}*/
	
	public static void main(String args[]) {
		
		int price[]= {2,5,7,8,10};
		int n=price.length;
		
		int dp[][]=new int[n][n+1];
		for(int[] row:dp) {
			Arrays.fill(row, -1);
		}
		
		int ans=find(price,n-1,n,dp);
		System.out.println("Maximum price of rod he can get is "+ans);
	}
}
