package heap;
import java.util.*;

public class sort_k_sorted_array {
	
	public static void solve(int arr[],int k) {
		int n=arr.length;
		
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		
		for(int i=0;i<=k;i++) {
			pq.add(arr[i]);
		}
		int idx=0;
		
		for(int i=k+1;i<n;i++) {
			arr[idx++]=pq.poll();
			pq.add(arr[i]);
		}
		
		while(!pq.isEmpty()) {
			arr[idx++]=pq.poll();
		}
	}
	
	public static void main(String args[]) {
		
		int arr[]= {9,7,8,19,18};
		int k=2;
		
		solve(arr,k);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
