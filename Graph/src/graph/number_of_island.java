package graph;
import java.util.*;

public class number_of_island {
	
	static int row[]= {0,0,-1,1,-1,1,-1,1};
	static int col[]= {1,-1,0,0,1,-1,-1,1};
	static int n=5;
	static int m=5;
	//static int count=0;
	
	public static boolean issafe(int mat[][],int i,int j,boolean vis[][]) {
		return (i>=0 && i<n && j>=0 && j<m && (mat[i][j]==1 && vis[i][j]==false));
	}
	
	public static void countisland(int mat[][],int i,int j,boolean vis[][]) {
		
		vis[i][j]=true;
		
		for(int k=0;k<8;k++) {
			int x=i+row[k];
			int y=j+col[k];
			
			if(issafe(mat,x,y,vis)) {
				countisland(mat,x,y,vis);
			}			
		}
	}
	
	public static void main(String args[]) {
		
		int mat[][]= { { 1, 1, 0, 0, 0 },
                	   { 0, 1, 0, 0, 1 },
                	   { 1, 0, 0, 1, 1 },
                	   { 0, 0, 0, 0, 0 },
                	   { 1, 0, 1, 0, 1 } };
		
		boolean vis[][]=new boolean[n][m];
		int count=0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(mat[i][j]==1 && vis[i][j]==false) {
					countisland(mat,i,j,vis);
					count++;
				}
			}
		}
		
		System.out.println("number of island is: "+count);
	}
}
