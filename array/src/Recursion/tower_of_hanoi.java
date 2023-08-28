package Recursion;
import java.util.*;

public class tower_of_hanoi {
	
	public static void display(int n,String src,String help,String dest) {
		
		if(n==1) {
			System.out.println("transfer disk "+n+ " form "+src+" to "+dest);
			return;
		}
		
		display(n-1,src,dest,help);
		System.out.println("transfer disk "+n+ " form "+src+" to "+dest);
		display(n-1,help,src,dest);
		
	}
	
	public static void main(String args[]) {
		int n=3;
		display(n,"S","H","D");
	}
}
