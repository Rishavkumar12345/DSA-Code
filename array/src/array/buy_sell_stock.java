//Best Time to BUY and SELL STOCK 

package array;
import java.util.*;

public class buy_sell_stock {
	public static void main(String args[]) {
		
		int arr[]= {7,1,5,3,6,4};
		int n=arr.length;
		int mini=Integer.MAX_VALUE;
		int profit=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]<mini) {
				mini=arr[i];
			}
			if((arr[i]-mini)>profit) {
				profit=arr[i]-mini ;
			}
		}
		System.out.println(profit);
	}
}
