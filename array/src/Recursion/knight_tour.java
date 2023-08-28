//print all possible path;

package Recursion;
import java.util.Arrays;

public class knight_tour {
	
	public static void solve(int chess[][],int row,int col,int mov) {
		
		if(row>=chess.length || col>=chess.length || row<0 || col<0 || chess[row][col]>0) {
			return;
		}else {
			if(mov==chess.length * chess.length) {
				chess[row][col]=mov;
				display(chess);
				System.out.println();
				chess[row][col]=0;
				return;
			}
		}
			
		
		chess[row][col]=mov;
		solve(chess,row+2,col+1,mov+1);
		solve(chess,row+1,col+2,mov+1);
		solve(chess,row-2,col+1,mov+1);
		solve(chess,row-1,col+2,mov+1);
		solve(chess,row+2,col-1,mov+1);
		solve(chess,row+1,col-2,mov+1);
		solve(chess,row-2,col-1,mov+1);
		solve(chess,row-1,col-2,mov+1);
		chess[row][col]=0;
	}
	
	public static void display(int chess[][]) {
		for(int i=0;i<chess.length;i++) {
			for(int j=0;j<chess[0].length;j++) {
				System.out.print(chess[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		
		int chess[][]=new int[5][5];
		for(int[] row:chess) {
			Arrays.fill(row, 0);
		}
		
		solve(chess,2,3,0);
	}
}
