//sliding maximum window

package array;
import java.util.*;

public class max_subarray_sum {
	
	public static void maxSubarraySum(int arr[],int k,int n,int x) {
		
		int sum=0,ans=0;
		
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		
		ans=sum;
		
		for(int i=k;i<n;i++) {
			sum=sum-arr[i-k];
			sum=sum+arr[i];
			
			if(sum<x) {
				ans=Math.max(ans, sum);
			}
		}
		
		System.out.println(ans);
	}
	
	public static void main(String args[]) {
		
		int arr[]= {7,5,4,6,8,9};
		int k=3;
		int x=20;
		int n=arr.length;
		
		maxSubarraySum(arr,k,n,x);
	}
}
