// Minimum Path Sum in Grid 

package Dynamic_programming;
import java.util.*;

public class Minimum_path_sum_in_grid {
	
	//time complexity=0(n*m)
	public static int find_path(int i,int j,int a[][],int dp[][]) {
		
		if(i==0 && j==0) {
			return a[i][j];
		}
		
		if(i<0 || j<0) {
			return (int)Math.pow(10, 9);
		}
		
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		
		int up=a[i][j]+find_path(i-1,j,a,dp);
		int left=a[i][j]+find_path(i,j-1,a,dp);
		
		return dp[i][j]=Math.min(up, left);
	}
	
	//time complexity=0(2^(n*m))
	/*public static int find_path(int i,int j,int a[][]) {
		
		if(i==0 && j==0) {
			return a[0][0];
		}
		
		if(i<0 || j<0) {
			return (int)Math.pow(10,9);
		}
		
		int up=a[i][j]+find_path(i-1,j,a);
		int left=a[i][j]+find_path(i,j-1,a);
		
		return Math.min(up, left);
	}*/
	
	public static void main(String args[]) {
		
		int maze[][]={{5,9,6},
                		{11,5,2}};
		
		int n=maze.length;
		int m=maze[0].length;
		
		int dp[][]=new int[n][m];
		
		for(int[] row:dp) {
			Arrays.fill(row, -1);
		}
		
		int ans=find_path(n-1,m-1,maze,dp);
		System.out.println("total number of unique path is "+ans);
	}
}
