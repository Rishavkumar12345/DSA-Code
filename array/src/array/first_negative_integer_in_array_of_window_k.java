package array;
import java.util.*;

public class first_negative_integer_in_array_of_window_k {
	public static void main(String args[]) {
		
		int arr[]= {12, -1, -7, 8, -15, 30, 16, 28};
		int n=arr.length;
		int k=3;
		
		int ans[]=new int[n-k+1];
		int r=0;
		
		Deque<Integer>dq=new LinkedList<>();
		for(int i=0;i<n;i++) {
			
			if(!dq.isEmpty() && dq.peek()==i-k) {
				dq.poll();
			}
			
			if(arr[i]<0) {
				dq.add(i);
			}			
			
			if(i>=k-1 && !dq.isEmpty()) {
				ans[r++]=arr[dq.peek()];
			}else if(i>k-1 && dq.isEmpty()) {
				ans[r++]=0;
			}
		}
		
		for(int i=0;i<n-k+1;i++) {
			System.out.print(ans[i]+ " ");
		}
	}
}
