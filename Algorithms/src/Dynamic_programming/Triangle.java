//Triangle | Fixed Starting Point and Variable Ending Point 

package Dynamic_programming;
import java.util.*;

public class Triangle {
	
	//time complexity=0(n*n) space complextiy=O(n*n)
	public static int minipathsum1(int n,int t[][],int dp[][]) {
		
		for(int j=0;j<n;j++) {
			dp[n-1][j]=t[n-1][j];
		}
		
		for(int i=n-2;i>=0;i--) {
			for(int j=i;j>=0;j--) {
				
				int down=t[i][j]+dp[i+1][j];
				int downr=t[i][j]+dp[i+1][j+1];
				
				dp[i][j]=Math.min(down, downr);
			}
		}
		
		return dp[0][0];
	}
	
	//time complexity=0(n*n) space complextiy=O(n*n)+O(2*(n-1))
	/*public static int minipathsum(int i,int j,int n,int t[][],int dp[][]) {
		
		if(i==n-1) {
			return t[i][j];
		}
		
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		
		int down=t[i][j]+minipathsum(i+1,j,n,t,dp);
		int downr=t[i][j]+minipathsum(i+1,j+1,n,t,dp);
		
		return dp[i][j]=Math.min(down,downr);
		
	}*/
	
	public static void main(String args[]) {
		 int triangle [][] = 	{{1},
                 				{2,3},
                 				{3,6,7},
                 				{8,9,6,10}};
		 
		 int n=triangle.length;
		 
		 int[][] dp=new int[n][n];
		 
		 for(int[] row:dp) {
			 Arrays.fill(row, -1);
		 }
		 /*int ans=minipathsum(0,0,n,triangle,dp);
		 System.out.println("minimum sum of path is "+ans);*/
		 
		 int ans=minipathsum1(n,triangle,dp);
		 System.out.println("minimum sum of path is "+ans);
	}
}
