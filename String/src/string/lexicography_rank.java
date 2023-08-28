package string;
import java.util.*;

public class lexicography_rank {
	
	public static int fact(int n) {
		
		if(n==1) {
			return 1;
		}
		
		return n*fact(n-1);
	}
	
	public static void main(String args[]) {
		
		String s="string";
		int n=s.length();
		
		int count[]=new int[256];
		
		//frequency count
		for(int i=0;i<n;i++) {
			count[s.charAt(i)]++;
		}
		int f=fact(n);
		
		//count of charater less than current char on left side
		for(int i=1;i<256;i++) {
			count[i]+=count[i-1];
		}
		int res=1;
		for(int i=0;i<n;i++) {
			f=f/(n-i);
			res=res+count[s.charAt(i)-1]*f;
			for(int j=s.charAt(i);j<256;j++) {
				count[j]--;
			}
		}
		
		System.out.print("lexicograpghy rank of string is "+res);
	}
}
