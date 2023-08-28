package Dynamic_programming;
import java.util.*;

public class Edit_Distance {
	
	//tabulation
	public static int count1(String s1,String s2,int n,int m) {
		
		int dp[][]=new int[n+1][m+1];
		
		for(int i=0;i<=n;i++) {
			dp[i][0]=i;
		}
		
		for(int j=0;j<=m;j++) {
			dp[0][j]=j;
		}
		
		for(int i=1;i<n+1;i++){
	        for(int j=1;j<m+1;j++){
	            if(s1.charAt(i-1)==s2.charAt(j-1))
	                dp[i][j] = 0+dp[i-1][j-1];
	            
	            else dp[i][j] = 1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
	        }
	    }
		return dp[n][m];
	}
	
	//memoiazation
	/*public static int count(String s1,String s2,int i,int j,int dp[][]) {
			
		if(i<0) {
			return j+1;
		}
			
		if(j<0) {
			return i+1;
		}
		
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
			
		if(s1.charAt(i)==s2.charAt(j)) {
			return dp[i][j]=0+count(s1,s2,i-1,j-1,dp);
		}else {
			int a=1+count(s1,s2,i-1,j-1,dp);  //editing
			int b=1+count(s1,s2,i-1,j,dp);   //deletion
			int c=1+count(s1,s2,i,j-1,dp);  //insertion
				
			return dp[i][j]=Math.min(a, Math.min(b, c));
		}
	}*/
	
	//recursion
	/*public static int count(String s1,String s2,int i,int j) {
		
		if(i<0) {
			return j+1;
		}
		
		if(j<0) {
			return i+1;
		}
		
		if(s1.charAt(i)==s2.charAt(j)) {
			return 0+count(s1,s2,i-1,j-1);
		}else {
			int a=1+count(s1,s2,i-1,j-1);  //editing
			int b=1+count(s1,s2,i-1,j);   //deletion
			int c=1+count(s1,s2,i,j-1);  //insertion
			
			return Math.min(a, Math.min(b, c));
		}
	}*/
	
	public static void main(String args[]) {
		
		String s1="whgtdwhgtdg";
		String s2="aswcfg";
		
		int n=s1.length();
		int m=s2.length();
		
		/*int dp[][]=new int[n+1][m+1];
		for(int[] row:dp) {
			Arrays.fill(row, -1);
		}
		
		int ans=count(s1,s2,n-1,m-1,dp);
		System.out.println("Edit distance="+ans);*/
		
		int ans=count1(s1,s2,n,m);
		System.out.println("edit distance="+ans);
	}
}
