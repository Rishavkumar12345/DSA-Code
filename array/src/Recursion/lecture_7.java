//print subsequence whose sum is k;

package Recursion;
import java.util.*;

public class lecture_7 {
	
	public static void sum_k(int arr[],ArrayList<Integer>v,int i,int n,int sum,int k) {
		
		if(i==n) {
			if(sum==k) {
				for(Integer it:v) {
					System.out.print(it + " ");
				}
				System.out.println();
				
			}
			return;
		}
		
		
		
		v.add(arr[i]);
		sum+=arr[i];
		sum_k(arr,v,i+1,n,sum,k);
			
		sum-=v.get(v.size()-1);
		v.remove(v.size()-1);
		sum_k(arr,v,i+1,n,sum,k);
	}
	
	public static void main(String args[]) {
		
		int arr[]=  {10,1,2,7,6,1,5};
		int n=arr.length;
		ArrayList<Integer>v=new ArrayList<>();
		sum_k(arr,v,0,n,0,8);
	}
}
