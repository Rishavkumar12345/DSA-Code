package extra;
import java.util.*;

public class k_largest_element {
	public static void main(String args[]) {
		
		int arr[]= {2,10,5,17,7,18,6,4};
		int n=arr.length;
		int k=3;
		
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		
		for(int i=0;i<n;i++) {
			
			if(i<k) {
				pq.add(arr[i]);
			}else {
				if(arr[i]>pq.peek()) {
					pq.poll();
					pq.add(arr[i]);
				}
			}
		}
		
		while(!pq.isEmpty()) {
			System.out.print(pq.peek()+" ");
			pq.poll();
		}
	}
}
