//Minimum coin

package Dynamic_programming;
import java.util.*;

public class Minimum_coin {
	
	//tabulation
	public static int find(int coin[],int n,int k) {
		
		int dp[][]=new int[n+1][k+1];
		
		for(int i=0;i<=k;i++) {
			if(i%coin[0]==0) {
				dp[0][i]=i/coin[0];
			}else {
				dp[0][i]=(int) 1e9;
			}
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=k;j++) {
				int nottake=0+dp[i-1][j];
				int take=(int)1e9;
				
				if(coin[i]<=j) {
					take=1+dp[i][j-coin[i]];
				}
				dp[i][j]=Math.min(nottake, take);
			}
		}
		return dp[n][k];
	}
	
	//memoization
	/*public static int find(int coin[],int n,int k,int dp[][]) {
		
		if(n==0) {
			if(k%coin[0]==0) {
				return k/coin[0];
			}else {
				return (int) 1e9;
			}
		}
		
		if(dp[n][k]!=-1) {
			return dp[n][k];
		}
		
		int nottake=0+find(coin,n-1,k,dp);
		int take=Integer.MAX_VALUE;
		
		if(coin[n]<=k) {
			take=1+find(coin,n,k-coin[n],dp);
		}
		
		return dp[n][k]=Math.min(nottake, take);
		
	}*/
	
	//recursion
	/*public static int find(int coin[],int n,int k) {
		
		if(n==0) {
			if(k%coin[0]==0) {
				return k/coin[0];
			}else {
				return (int) 1e9;
			}
		}
		
		int nottake=0+find(coin,n-1,k);
		int take=Integer.MAX_VALUE;
		
		if(coin[n]<=k) {
			take=1+find(coin,n,k-coin[n]);
		}
		
		return Math.min(nottake, take);
	}*/
	
	public static void main(String args[]) {
		
		int coin[]= {1,2,3};
		int target=7;
		int n=coin.length;
		
		int dp[][]=new int[n][target+1];
		for(int[] row:dp) {
			Arrays.fill(row, -1);
		}
		
		int ans=find(coin,n-1,target);
		System.out.println("minimum number of coin require is "+ans);
	}
}
