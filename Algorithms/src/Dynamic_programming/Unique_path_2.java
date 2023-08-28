//Unique Paths  on Grid with  Obstacles in Maze

package Dynamic_programming;
import java.util.*;

public class Unique_path_2 {
	
	public static int find_path(int i,int j,int dp[][],int maze[][]) {
		
		if(i==0 && j==0) {
			return 1;
		}
		
		if(i>0 && j>0 && maze[i][j]==-1) {
			return 0;
		}
		
		if(i<0 || j<0) {
			return 0;
		}
		
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		
		int up=find_path(i-1,j,dp,maze);
		int left=find_path(i,j-1,dp,maze);
		
		dp[i][j]=up+left;
		
		return dp[i][j];
	}
	
	public static void main(String args[]) {
		
		int maze[][]= {{0,0,0},
						{0,-1,0},
						{0,0,0}};
		
		int n=maze.length;
		int m=maze.length;
		int dp[][]=new int[n][m];
		
		for(int[] row:dp) {
			Arrays.fill(row, -1);
		}
		
		int ans=find_path(n-1,m-1,dp,maze);
		System.out.println("total number of unique path is "+ans);
	}
}
