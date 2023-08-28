package array;
import java.util.*;

public class roatate_matirix_180 {
	public static void main(String args[]) {
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n/2;j++) {
				int k=n-j-1;
				int temp=arr[i][j];
				arr[i][j]=arr[i][k];
				arr[i][k]=temp;
			}
		}
		
		for(int i=0;i<n/2;i++) {
			int j=n-i-1;
			for(int k=0;k<n;k++) {
				int temp=arr[i][k];
				arr[i][k]=arr[j][k];
				arr[j][k]=temp;
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
