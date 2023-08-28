package bit_manipulation;
import java.util.*;

public class swap_and_evenOdd {
	
	public static void odd_even(int a) {
		
		int ans=a&1;
		if(ans==0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}
	}
	
	public static void swap(int c,int d) {
		System.out.println("intial value of c is "+c);
		System.out.println("intial value of d is "+d);
		c=c^d;
		d=c^d;
		c=c^d;
		System.out.println("final value of c is "+c);
		System.out.println("final value of c is "+d);
	}
	
	public static void main(String args[]) {
		int a=12;
		int c=5,d=7;
		odd_even(a);
		swap(c,d);
	}
}
