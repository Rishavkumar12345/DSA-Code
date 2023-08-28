//print longest common subsequence

package Dynamic_programming;
import java.util.*;

public class Print_LCS {
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
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j]=1+dp[i-1][j-1];
				}else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		//System.out.println("longest common sunsequence length is "+dp[n][m]);
		
		int len=dp[n][m];
		char ans[]=new char[len];
		int index=len-1;
		
		int i=n,j=m;
		
		while(i>0 && j>0) {
			
			if(s1.charAt(i-1)==s2.charAt(j-1)) {
				ans[index]=s1.charAt(i-1);
				index--;
				i--;
				j--;
			}else if(s1.charAt(i-1)>s2.charAt(j-1)) {
				i--;
			}else {
				j--;
			}
		}
		
		System.out.print("longest common sunsequence is ");
		for(int a=0;a<len;a++) {
			System.out.print(ans[a]);
		}
	}

}
