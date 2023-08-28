package array;
import java.util.*;

public class spiral_traversal_of_matrix {
	public static void main(String args[]) {
		
		int arr[][]= { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
		
		int minr=0;
		int maxr=arr.length-1;
		int minc=0;
		int maxc=arr[0].length-1;
		int count=0;
		int ele=(arr.length)*(arr[0].length);
		
		while(count<ele) {
			
			for(int i=minr,j=minc;i<=maxr && count<ele;i++) {
				System.out.print(arr[i][j]+" ");
				count++;
			}
			minc++;
			
			for(int i=maxr,j=minc;j<=maxc && count<ele;j++) {
				System.out.print(arr[i][j]+" ");
				count++;
			}
			maxr--;
			
			for(int i=maxr,j=maxc;i>=minr && count<ele;i--) {
				System.out.print(arr[i][j]+" ");
				count++;
			}
			maxc--;
			
			for(int i=minr,j=maxc;j>=minc && count<ele;j--) {
				System.out.print(arr[i][j]+" ");
				count++;
			}
			minr++;
		}
	}
}
