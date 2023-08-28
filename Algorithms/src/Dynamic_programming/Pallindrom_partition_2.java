package Dynamic_programming;
import java.util.*;

public class Pallindrom_partition_2 {
	
	public static boolean ispallindrom(String s) {
		
		int n=s.length();
		for(int i=0;i<n/2;i++) {
			if(s.charAt(i)!=s.charAt(n-i-1)) {
				return false;
			}
		}
		return true;
	}
	
	public static int count(String s,int i,int n) {
		
		if(i==n) {
			return 0;
		}
		
		int mini=Integer.MAX_VALUE;
		String temp="";
		for(int j=i;j<n;j++) {
			temp+=s.charAt(j);
			if(ispallindrom(temp)) {
				int cost=1+count(s,j+1,n);
				mini=Math.min(mini, cost);
			}
		}
		return mini;
	}
	
	public static void main(String args[]) {
		
		String s="BABABCBADCEDE";
		int n=s.length();
		
		int ans=count(s,0,n)-1;
		System.out.println(ans);
	}
}
