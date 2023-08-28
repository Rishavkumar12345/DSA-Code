package array;
import java.util.*;

public class kadhan_algorithm {
	public static void main(String args[]) {
		
		int arr[]= {-2,-2,4,-1,-2,1,5,-3};
		
		int sum=0;
		int maxa=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			maxa=Math.max(maxa, sum);
			if(sum<0) {
				sum=0;
			}
			
		}
		
		System.out.print("sum of maximum subarray is "+ maxa);
	}
}
