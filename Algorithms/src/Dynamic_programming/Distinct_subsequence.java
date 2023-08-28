package Dynamic_programming;
import java.util.*;

public class Distinct_subsequence {
	
	//tabulation
	public static int count1(String s1,String s2,int n,int m) {
		
		int dp[][]=new int[n+1][m+1];
		
		for(int i=0;i<=n;i++) {
			dp[i][0]=1;
		}
		
		for(int j=1;j<=m;j++) {
			dp[0][j]=0;
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
				}else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		return dp[n][m];
	}
	
	//memoaization
	/*public static int count(String s1,String s2,int i,int j,int dp[][]) {
		if(j<0) {
			return 1;
		}
		
		if(i<0) {
			return 0;
		}
		
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		
		if(s1.charAt(i)==s2.charAt(j)) {
			return dp[i][j]=count(s1,s2,i-1,j-1,dp)+count(s1,s2,i-1,j,dp);
		}
		return dp[i][j]=count(s1,s2,i-1,j,dp);
	}*/
	
	//recursion;
	/*public static int count(String s1,String s2,int i,int j) {
		
		if(j<0) {
			return 1;
		}
		
		if(i<0) {
			return 0;
		}
		
		if(s1.charAt(i)==s2.charAt(j)) {
			return count(s1,s2,i-1,j-1)+count(s1,s2,i-1,j);
		}
		return count(s1,s2,i-1,j);
	}*/
	
	public static void main(String args[]) {
		
		String s1="babgbag";
		String s2="bag";
		
		int n=s1.length();
		int m=s2.length();
		
		/*int dp[][]=new int[n+1][m+1];
		for(int[] row:dp) {
			Arrays.fill(row, -1);
		}
		
		int ans=count(s1,s2,n-1,m-1,dp);
		System.out.println("length of distinct subsequence is "+ans);*/
		
		int ans=count1(s1,s2,n,m);
		System.out.println("length of distinct subsequence is "+ans);
		
	}
}
