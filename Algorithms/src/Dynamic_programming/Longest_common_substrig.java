//longest common substring

package Dynamic_programming;
import java.util.*;

public class Longest_common_substrig {
	public static void main(String args[]) {
		
		String s1="adebc";
		String s2="dcadb";
		
		int n=s1.length();
		int m=s2.length();
		
		int dp[][]=new int[n+1][m+1];
		
		for(int i=0;i<=n;i++) {
			dp[i][0]=0;
		}
		
		for(int j=0;j<=m;j++) {
			dp[0][j]=0;
		}
		int ans1=Integer.MIN_VALUE;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j]=1+dp[i-1][j-1];
					ans1=Math.max(ans1, dp[i][j]);
				}else {
					dp[i][j]=0;
				}
			}
		}
		System.out.println("longest common substring length is "+ans1);
	}

}
