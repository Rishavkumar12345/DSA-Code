//knapsack

package Dynamic_programming;
import java.util.*;

public class Knapsack_0_1 {
	
	//tabulation
	public static int find(int w[],int v[],int n,int wt) {
		
		int dp[][]=new int[n][wt+1];
		
		for(int[] row:dp) {
			Arrays.fill(row, 0);
		}
		
		for(int i=w[0];i<=wt;i++) {
			dp[0][i]=v[0];
		}
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<=wt;j++) {
				int nottake=dp[i-1][j];
				
				int take=Integer.MIN_VALUE;
				if(w[i]<=j) {
					take=v[i]+dp[i-1][j-w[i]];
				}
				dp[i][j]=Math.max(take, nottake);
			}
		}
		return dp[n-1][wt];
	}
	
	//memoization
	/*public static int find(int w[],int v[],int i,int wt,int dp[][]) {
		
		if(i==0) {
			if(w[0]<=wt) {
				return v[0];
			}else {
				return 0;
			}
		}
		
		if(dp[i][wt]!=-1) {
			return dp[i][wt];
		}
		
		int nottake=0+find(w,v,i-1,wt,dp);
		int take=Integer.MIN_VALUE;
		
		if(w[i]<=wt) {
			take=v[i]+find(w,v,i-1,wt-w[i],dp);
		}
		
		return dp[i][wt]=Math.max(nottake, take);
	}*/
	
	//recursion
	/*public static int find(int w[],int v[],int i,int wt) {
		
		if(i==0) {
			if(w[0]<=wt) {
				return v[0];
			}else {
				return 0;
			}
		}
		
		int nottake=0+find(w,v,i-1,wt);
		int take=Integer.MIN_VALUE;
		
		if(w[i]<=wt) {
			take=v[i]+find(w,v,i-1,wt-w[i]);
		}
		
		return Math.max(nottake, take);
	}*/
	
	public static void main(String args[]) {
		
		int w[]= {3,2,5};
		int value[]= {30,40,60};
		int wt=6;
		int n=w.length;
		
		/*int dp[][]=new int[n][wt+1];
		
		for(int[] row:dp) {
			Arrays.fill(row, -1);
		}*/
		
		int ans=find(w,value,n-1,wt);
		System.out.println("maximum value thief can take is "+ans);
	}
}
