package string;
import java.util.*;

public class check_subsequence {
	public static void main(String args[]) {
		
		String s1="GEEKSFORGEEKS";
		String s2="GRGER";
		
		int i=0,j=0;
		int n=s1.length();
		int m=s2.length();
		
		while(i<n && j<m) {
			
			if(s1.charAt(i)==s2.charAt(j)) {
				j++;
			}
			i++;
		}
		
		if(i<n || j<m) {
			System.out.println("subsequence is not present");
		}else {
			System.out.println("subsequence is present");
		}
	}
}
