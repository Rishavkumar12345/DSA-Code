//Grid Unique Path

package Dynamic_programming;
import java.util.*;

public class Grid_unique_Path {
	
	public static int find_path3(int n,int m,int dp1[][]) {
		
		int up=0,left=0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				
				if(i==0 && j==0) {
					dp1[i][j]=1;
					continue;
				}
				
				if(i>0) {
					up=dp1[i-1][j];
				}
				if(j>0) {
					left=dp1[i][j-1];
				}
				
				dp1[i][j]=left+up;
			}
		}
		
		return dp1[n-1][m-1];
	}
	
	//time complexity=O(n*m) space complexity=O(n*m)+O(n+m)
	public static int find_path2(int i,int j,int dp[][]) {
		
		if(i==1 && j==1) {
			return 1;
		}
		
		if(i<0 || j<0) {
			return 0;
		}
		
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		
		int up=find_path2(i-1,j,dp);
		int down=find_path2(i,j-1,dp);
		
		dp[i][j]=up+down;
		
		return dp[i][j];
	}
	
	//time complexity=O(2^(n*m))
	public static int find_path1(int i,int j) {
		
		if(i==1 && j==1) {
			return 1;
		}
		
		if(i<0 || j<0) {
			return 0;
		}
		
		int up=find_path1(i-1,j);
		int down=find_path1(i,j-1);
		
		return up+down;
	}
	
	public static void main(String args[]) {
		
		int n=2,m=2;
		int dp1[][]=new int[n+1][m+1];
		int dp[][]=new int[n+1][m+1];
		
		for(int[] row:dp) {
			Arrays.fill(row, -1);
		}
		
		for(int[] row:dp1) {
			Arrays.fill(row, -1);
		}
		int ans=find_path1(n,m);
		System.out.println("total number of unique path is " +ans);
		int ans1=find_path2(n,m,dp);
		System.out.println("total number of unique path is " +ans1);
		
		int ans2=find_path3(n,m,dp1);
		System.out.println("total number of unique path is " +ans2);
		
	}
}
