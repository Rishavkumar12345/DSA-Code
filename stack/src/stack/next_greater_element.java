package stack;
import java.util.*;

public class next_greater_element {
	public static void main(String arg[]) {
		
		int arr[]={2,5,9,3,1,12,6,8,7};
		int n=arr.length;
		
		int nsg[]=new int[n];
		nsg[n-1]=-1;
		
		Stack<Integer>st=new Stack<Integer>();
		st.push(arr[n-1]);
		
		for(int i=n-2;i>=0;i--) {
			
			while(!st.isEmpty() && arr[i]>=st.peek()) {
				st.pop();
			}
			
			if(st.isEmpty()) {
				nsg[i]=-1;
			}else {
				nsg[i]=st.peek();
			}
			
			st.push(arr[i]);
		}
		
		System.out.println("next greater element of array is ");
		for(int i=0;i<n;i++) {
			System.out.print(nsg[i]+" ");
		}
	}
}
