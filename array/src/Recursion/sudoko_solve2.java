package Recursion;
import java.util.*;

public class sudoko_solve2 {
	
	public static boolean issafe(int grid[][],int x,int y,int num) {
		
		//check in row;
		for(int i=0;i<grid[0].length;i++) {
			if(grid[x][i]==num) {
				return false;
			}
		}
		
		//check in col;
		for(int i=0;i<grid.length;i++) {
			if(grid[i][y]==num) {
				return false;
			}
		}
		
		//check in sub-matrix;
		int inr=x/3 * 3;
		int inc=y/3 * 3;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(grid[i+inr][j+inc]==num) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void solve(int grid[][],int row,int col) {
		
		if(row==grid.length-1) {
			display(grid);
			return;
		}
		
		int ni=0,nj=0;
		if(col==grid[0].length-1) {
			ni=row+1;
			nj=0;
		}else {
			ni=row;
			nj=col+1;
		}
		
		if(grid[row][col]!=0) {
			solve(grid,ni,nj);
		}
		for(int pos=1;pos<=9;pos++) {
			
			if(issafe(grid,row,col,pos)) {
				grid[row][col]=pos;
				solve(grid,ni,nj);
				grid[row][col]=0;
			}
		}
	}
	
	public static void display(int grid[][]) {
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				System.out.print(grid[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		
		int grid[][] = { {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
		         {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
		         {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
		         {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
		         {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
		         {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
		         {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
		         {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
		         {0, 0, 5, 2, 0, 6, 3, 0, 0} };
	
		solve(grid,0,0);
	}
}
