package string;
import java.util.*;

public class pattern_searching {
	public static void main(String args[]) {
		
		String s1="ABCABCD";
		String s2="ABCD";
		
		int n=s1.length();
		int m=s2.length();
		
		for(int i=0;i<=n-m;) {
			int j;
			for(j=0;j<m;j++) {
				
				if(s1.charAt(i+j)!=s2.charAt(j)) {
					break;
				}
			}			
			if(j==m) {
				System.out.println(i+" ");
			}
			if(j==0) {
				i++;
			}else {
				i=i+j;
			}
		}
	}
}
