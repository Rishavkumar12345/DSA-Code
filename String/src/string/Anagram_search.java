//Given a text and a pattern, 
//the task is to find if there is anagram of pattern present in text.
//s1=geeksforgeeks s2=frog  yes beacuse frog is premutation of forg
//s1=geeksforgeeks s2=rseeks no.

package string;
import java.util.*;

public class Anagram_search {
	
	public static boolean issame(int ct[],int cp[]) {
		
		for(int i=0;i<256;i++) {
			if(cp[i]!=ct[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean check(String s1,String s2) {
		
		int n=s1.length();
		int m=s2.length();
		
		int ct[]=new int[256];
		int cp[]=new int[256];
		
		for(int i=0;i<m;i++) {
			ct[s1.charAt(i)]++;
			cp[s2.charAt(i)]++;
		}
		
		for(int i=m;i<=n-m;i++) {
			if(issame(ct,cp)) {
				return true;
			}
			ct[s1.charAt(i)]++;
			ct[s1.charAt(i-m)]--;
		}
		return false;
	}
	
	public static void main(String args[]) {
		
		String s1="geeksforgeeks";
		String s2="rseek";
		
		boolean ans=check(s1,s2);
		if(ans==true) {
			System.out.println("anagram is present");
		}else {
			System.out.println("anagram is not present");
		}
	}
}
