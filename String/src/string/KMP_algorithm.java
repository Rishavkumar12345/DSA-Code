package string;
import java.util.*;

public class KMP_algorithm {
	
	public static void fillLps(String s,int lps[]) {
		int n=s.length();
		int len=0;
		int i=1;
		lps[0]=0;
		
		while(i<n) {
			
			if(s.charAt(i)==s.charAt(len)) {
				len++;
				lps[i]=len;
				i++;
			}else {
				if(len==0) {
					lps[i]=0;
					i++;
				}else {
					len=lps[len-1];
				}
			}
		}
	}
	
	public static void KMP(String txt,String pat) {
		int n=txt.length();
		int m=pat.length();
		
		int lps[]=new int[m];
		fillLps(pat,lps);
		
		int i=0,j=0;
		
		while(i<n) {
			
			if(txt.charAt(i)==pat.charAt(j)) {
				i++;
				j++;
			}
			
			if(j==m) {
				System.out.println("pattern present at index "+(i-j));
				j=lps[j-1];
				
			}else if(i<n && pat.charAt(j)!=txt.charAt(i)) {
				if(j==0) {
					i++;
				}else {
					j=lps[j-1];
				}
			}
		}
	}
	
	public static void main(String args[]) {
		
		String txt = "ababcababaad",pat="ababa";
		KMP(txt,pat);
	}
}
