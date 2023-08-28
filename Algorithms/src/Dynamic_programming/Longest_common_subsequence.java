//longest common subsequence

package Dynamic_programming;
import java.util.*;

public class Longest_common_subsequence {
	
	//space optimization
	public static int length1(String s1,String s2,int n,int m) {
		
		int prev[]=new int[n+1];
		int curr[]=new int[m+1];
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					curr[j]=1+prev[j-1];
				}else {
					curr[j]=Math.max(prev[j], curr[j-1]);
				}
			}
			prev=curr;
		}
		return curr[m];
	}
	
	//tabulation
	/*public static int length1(String s1,String s2,int n,int m) {
		
		int dp[][]=new int[n+1][m+1];
		
		for(int i=0;i<=n;i++) {
			dp[i][0]=0;
		}
		for(int j=0;j<=m;j++) {
			dp[0][j]=0;
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j]=1+dp[i-1][j-1];
				}else {
					dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		}
		return dp[n][m];
	}*/
	
	//memoiazation
	/*public static int length(String s1,String s2,int i,int j,int dp[][]) {
		
		if(i<0 || j<0) {
			return 0;
		}
		
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		
		if(s1.charAt(i)==s2.charAt(j)) {
			return dp[i][j]=1+length(s1,s2,i-1,j-1,dp);
		}
		
		return dp[i][j]=Math.max(length(s1,s2,i-1,j,dp), length(s1,s2,i,j-1,dp));
	}*/
	
	//recursion
	/*public static int length(String s1,String s2,int i,int j) {
		
		if(i<0 || j<0) {
			return 0;
		}
		
		if(s1.charAt(i)==s2.charAt(j)) {
			return 1+length(s1,s2,i-1,j-1);
		}
		
		return Math.max(length(s1,s2,i-1,j), length(s1,s2,i,j-1));
	}*/
	
	public static void main(String args[]) {
		
		String s1="adebc";
		String s2="dcadb";
		
		int n=s1.length();
		int m=s2.length();
		
		/*int dp[][]=new int[n][m];
		for(int[] row:dp) {
			Arrays.fill(row, -1);
		}
		
		int ans=length(s1,s2,n-1,m-1,dp);
		System.out.println("longest common subsequence having length "+ans);*/
		
		int ans=length1(s1,s2,n,m);
		System.out.println("longest common subsequence having length "+ans);
	}
}
