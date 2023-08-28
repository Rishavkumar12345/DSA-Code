//Minimum insertion/deletion require to convert s1 into s2
//number of insertion=length of s2-lenth of longest common subsequence
//number of deletion=length of s1-length of longest common subsequence
//total operation require=length of s1+length of s2-2(longest common subsequence)

package Dynamic_programming;
import java.util.*;

public class Minimum_insertion_deletion {
	public static void main(String args[]) {
		
		String s1="abcd";
		String s2="anc";
		
		int n=s1.length();
		int m=s2.length();
		
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
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		int lca=dp[n][m];
		int ans=n+m-2*lca;
		
		System.out.println("Minimum insertion/deletion require to convert s1 into s2 is "+ans);
	}

}
