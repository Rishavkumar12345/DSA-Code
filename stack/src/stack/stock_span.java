package stack;
import java.util.*;

public class stock_span {
	public static void main(String args[]) {
		
		int arr[]= {100,80,60,70,60,75,80};
		int n=arr.length;
		int ans[]=new int[n];
		Stack<Integer>st=new Stack<>();
		
		st.push(0);
		ans[0]=1;
		
		for(int i=1;i<n;i++) {
			
			while(!st.isEmpty() && arr[i]>=arr[st.peek()]) {
				st.pop();
			}
			
			if(st.empty()) {
				ans[i]=i+1;
			}else {
				ans[i]=i-st.peek();
			}
			st.push(i);
		}
		for(int i=0;i<n;i++) {
			System.out.print(ans[i]+ " ");
		}
	}
}
