//sorted array element is upto k distance away from its orighnal place
//https://www.youtube.com/watch?v=1I2uRpdbiK0&list=PL-Jc9J83PIiHq5rMZasunIR19QG3E-PAA&index=13

package extra;
import java.util.*;

public class Sort_nearly_Sorted_Array {
	public static void main(String args[]) {
		
		int arr[]= {2,3,1,4,6,7,5,8,9};
		int n=arr.length;
		int k=2;
		
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		
		for(int i=0;i<=k;i++) {
			pq.add(arr[i]);
		}
		
		for(int i=k+1;i<n;i++) {
			System.out.print(pq.remove()+" ");
			pq.add(arr[i]);
		}
		
		while(!pq.isEmpty()) {
			System.out.print(pq.remove()+ " ");
		}
	}
}
