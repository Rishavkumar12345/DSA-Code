package Recursion;
import java.util.*;

public class subset_sum {
	
	public static ArrayList<Integer> subsum(int arr[],int i,int sum,ArrayList<Integer>allsum){
		
		if(i==arr.length) {
			allsum.add(sum);
			return allsum;
		}
		
		subsum(arr,i+1,sum+arr[i],allsum);
		subsum(arr,i+1,sum,allsum);
		return allsum;
	}
	
	public static void main(String args[]) {
		
		int arr[]= {3,1,2};
		int n=arr.length;
		
		ArrayList<Integer>allsum=new ArrayList<>();
		
		ArrayList<Integer>ans=subsum(arr,0,0,allsum);
		
		Collections.sort(ans);
		for(Integer it:ans) {
			System.out.print(it + " ");
		}
	}
}
