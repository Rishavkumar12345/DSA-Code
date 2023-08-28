package Dynamic_programming;
import java.util.*;

public class Buy_and_sell_stock1 {
	public static void main(String args[]) {
		
		int arr[]= {17,20,11,9,12,6};
		int n=arr.length;
		
		int mini=arr[0];
		int profit=0;
		
		for(int i=1;i<n;i++) {
			
			profit=Math.max(profit, arr[i]-mini);
			mini=Math.min(mini, arr[i]);
		}
		System.out.println(profit);
	}
}
