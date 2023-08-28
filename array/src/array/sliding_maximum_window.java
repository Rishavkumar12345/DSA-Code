package array;
import java.util.*;

public class sliding_maximum_window {
	public static void main(String arg[]) {
		
		int arr[]= {4,2,1,4,4};
		int n=arr.length;
		int k=2;
		
		int ans[]=new int[n-k+1];
		int r=0;
		
		Deque<Integer>q=new ArrayDeque<>();
		
		for(int i=0;i<n;i++) {
			
			//to remove out of bound index from dequeue(check from front)
			if(!q.isEmpty() && q.peek()==i-k) {
				q.poll();
			}
			
			while(!q.isEmpty() && arr[q.peekLast()]<arr[i]) {
				q.pollLast();
			}
			q.offer(i);
			
			//if index is greater than window(k) then add element to ans
			if(i>=k-1) {
				ans[r++]=arr[q.peek()];
			}
		}
		
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+ " ");
		}
	}
}
