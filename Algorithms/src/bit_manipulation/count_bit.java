//Counting Number Of Set Bits 

package bit_manipulation;
import java.util.*;

public class count_bit {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number : ");
		int n=sc.nextInt();
		int count=0;
				
		while(n>0) {
			if((n&1)!=0) {
				count++;
			}
			n=n>>1;
		}
		System.out.println("Number Of Set Bits is "+count);
	}
}
