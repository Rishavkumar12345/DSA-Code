package binarysearch;
import java.util.*;

public class page_allocation {
	
	public static boolean check(int arr[],int page,int student) {
		
		int allocation=0,cnt=0;
		
		for(int i=0;i<arr.length;i++) {
			if(allocation+arr[i]>page) {
				cnt++;
				allocation=arr[i];
				if(allocation>page) {
					return false;
				}
			}else {
				allocation+=arr[i];
			}
		}
		if(cnt<student) {
			return true;
		}
		return false;
	}
	
	public static int book(int arr[],int n,int b) {
		
		if(b>n) {
			return -1;
		}
		
		int low=Integer.MAX_VALUE;
		int high=0;
		for(int i=0;i<n;i++) {
			high+=arr[i];
			low=Math.min(arr[i], low);
		}
		
		int res=-1;
		int mid;
		while(low<=high) {
			mid=(low+high)/2;
			if(check(arr,mid,b)) {
				res=mid;
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return low;
	}
	
	public static void main(String args[]) {
		
		int arr[]= {12,34,67,90};
		int n=arr.length;
		int ans=book(arr,n,2);
		System.out.print(ans);
	}
}
