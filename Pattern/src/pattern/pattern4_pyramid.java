package pattern;
import java.util.*;

/*
 	   	*
	   ***
	  *****
	 *******
	*********
 */

public class pattern4_pyramid {
	public static void main(String args[]) {
		
		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			for(int a=1;a<i;a++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
