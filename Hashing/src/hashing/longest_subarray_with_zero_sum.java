package hashing;
import java.util.*;

public class longest_subarray_with_zero_sum {
	public static void main(String args[]) {
		int arr[]= {1,-1,3,2,-2,-8,1,7,10,23};
		
		HashMap<Integer,Integer>hm=new HashMap<>();
		
		int sum=0;
		int maxa=Integer.MIN_VALUE;
		int j=0,k=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum==0) {
				maxa=i+1;
			}else {
				if(hm.get(sum)==null) {
					hm.put(sum, i);
				}else {
					maxa=Math.max(maxa, i-hm.get(sum));
					j=i;
					k=hm.get(sum);
				}
			}
		}
		
		System.out.println("longest subarray length with sum zero is "+maxa);
		for(int i=j;i<=k;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
