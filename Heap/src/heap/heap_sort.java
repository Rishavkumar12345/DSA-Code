package heap;
import java.util.*;

public class heap_sort {
	
	public static void heapify(int arr[],int n,int pos) {
		
		int l=2*pos;
		int r=(2*pos)+1;
		int small=pos;
		
		if(l<n && arr[l]<arr[small]) {
			small=l;
		}
		if(r<n && arr[r]<arr[small]) {
			small=r;
		}
		
		if(small!=pos) {
			int temp=arr[small];
			arr[small]=arr[pos];
			arr[pos]=temp;
			heapify(arr,n,small);
		}		
	}

	public static void sort(int arr[],int n) {
		
		for(int i=(n-1)/2;i>=0;i--) {
			heapify(arr,n,i);
		}
		
		for(int i=n-1;i>=0;i--) {
			int temp=arr[i];
			arr[i]=arr[0];
			arr[0]=temp;
			
			heapify(arr,i,0);
		}	
	}
	
	public static void printArray(int arr[]) {
	      int n = arr.length;
	      for (int i = 0; i < n; ++i)
	        System.out.print(arr[i] + " ");
	      System.out.println();
	    }
	
	public static void main(String args[]) {
		
		int arr[] = { 1, 12, 9, 5, 6, 10 };
		int n=arr.length;
		heap_sort h=new heap_sort();
		h.sort(arr, n);
		System.out.println("sorted array is ");
		h.printArray(arr);
		
	}
}
