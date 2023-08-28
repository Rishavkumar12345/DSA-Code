package stack;
import java.util.*;

public class Trapping_rainwater {
	public static void man(String agrs[]) {
		
		int arr[]= {0, 1, 0, 2, 1, 0, 1,3, 2, 1, 2, 1};
		int n=arr.length;
		
		int l=0,r=n-1;
		int leftmax=0,rightmax=0;
		int res=0;
		
		while(l<=r) {
			
			if(arr[l]<arr[r]) {
				if(arr[l]>leftmax) {
					leftmax=arr[l];
				}else {
					res+=(leftmax-arr[l]);
				}
				l++;
			}else {
				if(arr[r]>rightmax){
					rightmax=arr[r];
				}else {
					res+=(rightmax-arr[r]);
				}
				r--;
			}
		}
		System.out.println("Maximum water can be accumulate is "+res);
	}
}
