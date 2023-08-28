//sliding maximum window

package array;
import java.util.*;

public class minimum_subarray_size {
	
	public static int minimumSubarraySize(int arr[],int n,int x) {
		
		int sum=0,minidx=n+1,start=0,end=0;
		
		while(end<n) {
			while(sum<=x && end<n) {
				sum+=arr[end++];
			}
			
			while(sum>x && start<n) {
				if(end-start<minidx) {
					minidx=end-start;
				}
				sum-=arr[start++];
			}
		}
		
		return minidx;
	}
	
	public static void main(String args[]) {
		
		int arr[]= {1,4,45,6,10,19};
		int n=arr.length;
		int x=51;
		
		int result=minimumSubarraySize(arr,n,x);
		
		if(result==n+1) {
			System.out.println("no subarray exist with sum less than x");
		}else {
			System.out.println("minimum subarray size with sum less than x is "+result);
		}
	}
}
