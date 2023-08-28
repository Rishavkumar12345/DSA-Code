package heap;
import java.util.*;

public class kth_largest_element {
		public static void main(String args[]) {
			
			int arr[]= {5,15,10,20,8,25,28};
			int k=3;
			
			PriorityQueue<Integer>pq=new PriorityQueue<>();
			
			for(int i=0;i<k;i++) {
				pq.add(arr[i]);
			}
			
			for(int i=k;i<arr.length;i++) {
				if(arr[i]<pq.peek()) {
					continue;
				}else {
					pq.poll();
					pq.add(arr[i]);
				}
			}
			
			while(!pq.isEmpty()) {
				System.out.print(pq.poll()+" ");
			}
		}
}
