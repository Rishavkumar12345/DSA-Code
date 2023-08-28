package hashing;
import java.util.*;

public class k_largest_element {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter value of k: ");		
		int k=sc.nextInt();
		System.out.println();
		
		System.out.print("Enter size of array: ");
		int n=sc.nextInt();
		System.out.println();
		
		int[] arr=new int[n];
		System.out.println("Enter array element: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		
		for(int i=0;i<n;i++) {
			if(i<k) {
				pq.add(arr[i]);
			}else if(arr[i]>pq.peek()) {
				pq.remove();
				pq.add(arr[i]);
			}
		}
		
		System.out.println("largest k element is: ");
		while(pq.size()>0) {
			System.out.println(pq.peek());
			pq.remove();
		}
	}
}
