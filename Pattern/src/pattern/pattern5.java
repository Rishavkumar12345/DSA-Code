package pattern;
import java.util.*;

public class pattern5 {
//----------------------------------------------------	
	/*
		 * * * * *
		 * * * *
		 * * *
		 * *
		 * 
	*/
	
	public static void first() {
		
		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
//---------------------------------------------------	
	/*
			      *
			    * *
			  * * *
			* * * *
		  * * * * *
	*/
	
	public static void second() {
		
		int n=5;
		
		for(int i=1;i<=n;i++) {
			int j;
			for(j=n;j>i;j--) {
				System.out.print(" ");;
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
//---------------------------------------------------
	
		/*
				* * * * *
				  * * * *
				    * * *
				      * *
				        *      
		*/
		
		public static void third() {
			
			int n=5;
			
			for(int i=1;i<=n;i++) {
				int j;
				for(j=1;j<i;j++) {
					System.out.print(" ");;
				}
				for(int k=n;k>=i;k--) {
					System.out.print("*");
				}
				
				System.out.println();
			}
		}
//---------------------------------------------------
	
	public static void main(String args[]) {
		
		first();
		System.out.println("--------------------");
		second();
		System.out.println("--------------------");
		third();
		
	}
}
