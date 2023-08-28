package array;
import java.util.*;

public class first_and_last_occurance {
	
	public static int firstocc(int arr[],int start,int end,int k) {
		
		int ans=-1;
		
		while(start<end) {
			int mid=(start+end)/2;
			
			if(arr[mid]==k) {
				ans=mid;
				end=mid;
			}else if(arr[mid]<k) {
				start=mid+1;
			}else {
				end=mid;
			}
			
		}
		return ans;
	}
	
public static int lastocc(int arr[],int start,int end,int k) {
		
		int ans=-1;
		
		while(start<end) {
			int mid=(start+end)/2;
			
			if(arr[mid]==k) {
				ans=mid;
				start=mid+1;
			}else if(arr[mid]<k) {
				start=mid+1;
			}else {
				end=mid;
			}
			
		}
		return ans;
	}
	
	public static void main(String args[]) {
		
		int arr[]= {1,3,5,5,5,5,67,123,125};
		int n=arr.length;
		int k=5;
		
		int fist=firstocc(arr,0,n,k);
		int last=lastocc(arr,0,n,k);
		System.out.println(fist);
		System.out.println(last);
	}
}
