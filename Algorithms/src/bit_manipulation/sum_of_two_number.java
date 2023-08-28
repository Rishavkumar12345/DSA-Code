package bit_manipulation;
import java.util.*;

public class sum_of_two_number {
	public  static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first number: ");
		int a=sc.nextInt();
		System.out.println();
		System.out.print("enter second number: ");
		int b=sc.nextInt();
		
		while(b!=0) {
			
			//carry contain common set bit of x and y;
			int carry=a & b;
			
			// Sum of bits of x and
            // y where at least one
            // of the bits is not set			
			a=a ^ b;
			
			// Carry is shifted by
            // one so that adding it
            // to x gives the required sum
			b=carry << 1;
		}
		System.out.println("sum of two number is "+a);
	}
}
