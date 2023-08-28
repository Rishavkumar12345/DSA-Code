package Recursion;
import java.util.*;

public class generate_subsequence {
	
	public static void display(int arr[],ArrayList<Integer>v,int n,int i) {
		
		if(i==n) {
			for(Integer it:v) {
				System.out.print(it+" ");
			}
			System.out.println();
			return;
		}
		
		v.add(arr[i]);
		display(arr,v,n,i+1);
		v.remove(v.size()-1);
		display(arr,v,n,i+1);
	}
	
	public static void main(String args[]) {
		
		int arr[]= {3,1,2};
		int n=3;
		ArrayList<Integer>v=new ArrayList<>();
		display(arr,v,n,0);
	}
}
