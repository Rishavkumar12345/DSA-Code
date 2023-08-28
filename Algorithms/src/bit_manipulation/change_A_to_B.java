//find number of bits require to change A to B

package bit_manipulation;
import java.util.*;

public class change_A_to_B {
	public static void main(String args[]) {
		
		int a=22; //10110
		int b=27; //11011
		
		int n=a ^ b;
		int count=0;
		
		while(n>0) {
			
			if((n&1)!=0) {
				count++;
			}
			n=n>>1;
		}
		
		System.out.println("Number bits require to change A to B is "+count);
	}
}
