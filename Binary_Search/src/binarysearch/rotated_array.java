//find no. of time sorted array is rotated

package binarysearch;
import java.util.*;

public class rotated_array {
	public static void main(String args[]) {
		
		int arr[]= {6,7,8,9,1,2,3,4};
		int n=arr.length;
		
		int mid;
		int low=0,high=n-1;
		
		while(low<high) {
			mid=(low+high)/2;
			if(arr[mid]>arr[high]) {
				low=mid+1;
			}else if(arr[mid]<arr[high]) {
				high=mid;
			}
		}
		System.out.println("array rotated "+low+" no. of time");
	}
}
