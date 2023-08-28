//check that rat can move to destination or not;

package Recursion;
import java.util.*;

public class Rat_in_maze {
	
	public static boolean issafe(int arr[][],int x,int y,int n) {
		
		if(x<n && y<n && arr[x][y]==1) {
			return true;
		}
		return false;
	}
	
	public static boolean maze(int arr[][],int row,int col,int n,int solarr[][]) {
		
		if(row==n-1 && col==n-1) {
			solarr[row][col]=1;
			return true;
		}
		
		if(issafe(arr,row,col,n)) {
			solarr[row][col]=1;
			
			if(maze(arr,row+1,col,n,solarr)) {
				return true;
			}
			if(maze(arr,row,col+1,n,solarr)) {
				return true;
			}
			solarr[row][col]=0;
			return false;
		}
		return false;
	}
	
	public static void main(String args[]) {
		
		int n=5;
		
		int solarr[][]=new int[n][n];
		
		int arr[][]= {{1,0,1,0,1},
					  {1,1,1,1,1},
					  {0,1,0,1,0},
					  {1,0,0,1,1},
					  {1,1,1,0,1}};
		
		if(maze(arr,0,0,n,solarr)) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(solarr[i][j]+ " ");
				}
				System.out.println();
			}
		}
	}
}
