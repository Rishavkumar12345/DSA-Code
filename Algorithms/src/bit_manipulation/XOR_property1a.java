//Find the two non-repeating elements in an array of repeating elements 
//or Unique Numbers 2

package bit_manipulation;
import java.util.*;

public class XOR_property1a {
	public static void main(String args[]) {
		int arr[]= {2, 3, 7, 9, 11, 2, 3, 11};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum^arr[i];
		}
		
		// Bitwise & the sum with it's 2's Complement
        // Bitwise & will give us the sum containing
        // only the rightmost set bit
		sum=(sum & (-sum));
		
		int sum1=0;
		int sum2=0;
		
		// Bitwise & the arr[i] with the sum
        // Two possibilities either result == 0
        // or result > 0
		for(int i=0;i<arr.length;i++) {
			

            // if result > 0 then arr[i] xored
            // with the sum1
			if((arr[i] & sum) >0) {
				sum1=sum1^arr[i];
			}else {
				

                // if result = 0 then arr[i] xored
                // with the sum2
				sum2=sum2^arr[i];
			}
		}
		System.out.println("first non repeating element is: "+sum1);
		System.out.println("second non repeating element is: "+sum2);
	}
}
