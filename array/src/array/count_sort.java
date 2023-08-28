package array;
import java.util.*;

public class count_sort {
	
	public static void countSort(int arr[],int n) {
		
		int m=arr[0];
		for(int i=1;i<n;i++) {
			if(m<arr[i]) {
				m=arr[i];
			}
		}
		//System.out.print(m);
		int count[]=new int[m+1];
		
		for(int i=0;i<n;i++) {
			count[arr[i]]++;
		}
		
		for(int i=1;i<m+1;i++) {
			count[i]=count[i]+count[i-1];
		}
		int output[]=new int[n];
		
		for(int i=n-1;i>=0;i--) {
			output[--count[arr[i]]]=arr[i];
		}
		
		for(int i=0;i<n;i++) {
			arr[i]=output[i];
		}
	}
	
		public static void main(String args[]) {
			
			int arr[]= {1,4,1,2,7,5,2};
			int n=arr.length;
			
			countSort(arr,n);
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
		}
}
