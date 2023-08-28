//longest pallindrom subsequence

package Dynamic_programming;
import java.util.*;

public class Longest_pallindrom_subsequence {
	public static void main(String args[]) {
		
		String s1="aab";
		int n=s1.length();
		
		String s2="";
		for(int i=n-1;i>=0;i--) {
			s2+=s1.charAt(i);
		}
		
		int dp[][]=new int[n+1][n+1];
		for(int i=0;i<=n;i++) {
			dp[i][0]=0;
		}
		
		for(int j=0;j<=n;j++) {
			dp[0][j]=0;
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j]=1+dp[i-1][j-1];
				}else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		System.out.println("longest pallindrom subsequence length is "+dp[n][n]);
	}

}
