package Recursion;
import java.util.*;

public class permutation_of_string {
	
	public static String swap(String s,int i,int j) {
		char a[]=s.toCharArray();
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		return String.valueOf(a);	
	}
	
	public static void permutation(String s,int l,int r) {
		
		if(l==r) {
			System.out.println(s);
			return;
		}
			
		for(int i=l;i<=r;i++) {
			s=swap(s,i,l);
			permutation(s,l+1,r);
			s=swap(s,i,l);
		}
		
	}
	
	public static void main(String args[]) {
		
		String s="ABC";
		int n=s.length();
		permutation(s,0,n-1);
	}
}
