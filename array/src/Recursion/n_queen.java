package Recursion;
import java.util.*;

public class n_queen {
	
	public static boolean issafe(int arr[][],int x,int y,int n) {
		
		/* Check this row on left side */
		for(int i=0;i<x;i++) {
			if(arr[i][y]==1) {
				return false;
			}
		}
		
		int row=x;
		int col=y;
		
		//Check upper diagonal on left side
		while(row>=0 && col>=0) {
			if(arr[row][col]==1) {
				return false;
			}
			row--;
			col--;
		}
		
		row=x;
		col=y;
		
		//Check upper diagonal on right side
		while(row>=0 && col<n) {
			if(arr[row][col]==1) {
				return false;
			}
			row--;
			col++;
		}
		return true;
	}
	
	public static boolean nqueen(int arr[][],int row,int n) {
		
		//If all queens are placed then return true
		if(row>=n) {
			return true;
		}
		
		//Consider this column and try placing this queen in all rows one by one
		for(int col=0;col<n;col++) {
			//Check if the queen can be placed on board[i][col] 
			if(issafe(arr,row,col,n)) {
				//Place this queen in board[i][col]
				arr[row][col]=1;
				//check for next row;
				if(nqueen(arr,row+1,n)) {
					return true;
				}
				// If placing queen in board[i][col] doesn't lead to a solution then remove queen from board[i][col]
				arr[row][col]=0;
			}
		}
		//If the queen can not be placed in any row in this column col, then return false
		return false;
	}
	
	public static void main(String args[]) {
		
		int arr[][]= {{0,0,0,0},
					   {0,0,0,0},
					   {0,0,0,0},
					   {0,0,0,0}};
		int n=4;
		if(nqueen(arr,0,n)) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(arr[i][j]+ " ");
				}
				System.out.println();
			}
		}
	}
}
