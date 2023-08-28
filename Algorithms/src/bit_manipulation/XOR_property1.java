//find non-repeating element in array where every element appear twice;
//0^n=n and n^n=0;
package bit_manipulation;
import java.util.*;

public class XOR_property1 {
	public static void main(String args[]) {
		
		int arr[]= {5,4,3,4,5};
		int n=arr.length;
		int res=0;
		
		for(int i=0;i<n;i++) {
			res=res ^ arr[i];
		}
		System.out.println("Non repeating element of array is "+res);
	}
}
