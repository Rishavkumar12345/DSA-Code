package Dynamic_programming;
import java.util.*;

public class print_Longest_Increasing_Subsequence2 {
	public static void main(String args[]) {
		
		int arr[]= {1,2,1,3,4};
		int n=arr.length;
		
		int dp[]=new int[n];
		int bt[]=new int[n];
		
		for(int i=0;i<n;i++) {
			bt[i]=i;
			for(int p=0;p<=i-1;p++) {
				if(arr[i]>arr[p] && dp[i]<1+dp[p]) {
					dp[i]= 1+dp[p];
					bt[i]=p;
				}
			}
		}
		
		int ans=-1;        //to store longest increaing subsequence length
		int lastindex=0;  //to store index which consist of index of last element
		
		for(int i=0;i<n;i++) {
			if(arr[i]>ans) {
				ans=arr[i];
				lastindex=i;
			}
		}
		
		ArrayList<Integer>l=new ArrayList<>();
		l.add(arr[lastindex]);
		
		while(bt[lastindex]!=lastindex) {
			lastindex=bt[lastindex];
			l.add(arr[lastindex]);
		}
		
		System.out.print("The subsequence elements are ");
	    
	    for(int i=l.size()-1; i>=0; i--){
	        System.out.print(l.get(i)+" ");
	    }
	    System.out.println();
	}
}
