package stack;
import java.util.*;

public class largest_rectangle_in_histogram {
	public static void main(String args[]) {
		
		int arr[]= {2,3,3,2};
		int n=arr.length;
		
		int[] lb=new int[n];
		int[] rb=new int[n];
		
		//for right boundry;
		Stack<Integer>st=new Stack<>();
		st.push(arr.length-1);
		rb[n-1]=n;
		
		for(int i=n-2;i>=0;i--) {
			
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				st.pop();
			}
			
			if(st.isEmpty()) {
				rb[i]=n;
			}else {
				rb[i]=st.peek();
			}
			
			st.push(i);
		}
		
		//for left boundry
		st=new Stack<>();
		lb[0]=-1;
		st.push(0);
		
		for(int i=1;i<n;i++) {
			while(st.size()>0 && arr[i]<arr[st.peek()]) {
				st.pop();
			}
			
			if(!st.isEmpty()) {
				lb[i]=st.peek();
			}else {
				lb[i]=-1;
			}
			st.push(i);
		}
		
		
		int area=0,maxa=Integer.MIN_VALUE;
		//for area
		for(int i=0;i<n;i++) {
			int width=rb[i]-lb[i];
			area=width*arr[i];
			
			if(area>maxa) {
				maxa=area;
			}
		}
		
		System.out.println("Largest rectangle in histogram is "+maxa);
	}
}
