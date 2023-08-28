//sliding maximum window

package array;
import java.util.*;

public class Subarray_with_pallindrom {
	
	public static boolean ispallindrom(int num) {
		int n=num;
		int d=0;
		while(n>0) {
			d=d*10+n%10;
			n=n/10;
		}
		
		if(d==num) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int subarraypallindrom(int arr[],int k) {
		
		int num=0;
		for(int i=0;i<k;i++) {
			num=num*10+arr[i];
		}
		
		if(ispallindrom(num)) {
			return 0;
		}
		
		for(int i=k;i<arr.length;i++) {
			num=(num%(int)Math.pow(10, k-1))*10+arr[i];
			
			if(ispallindrom(num)) {
				return i-k+1;
			}
		}
		return -1;
	}
	
	public static void main(String args[]) {
		
		int[] arr= {2,3,5,1,1,5};
		int k=4;
		
		int ans=subarraypallindrom(arr,k);
		
		if(ans==-1) {
			System.out.print("no such subarray exists");
		}else {
			for(int i=ans;i<ans+k;i++) {
				System.out.print(arr[i] + " ");
			}
		}		
	}
}
