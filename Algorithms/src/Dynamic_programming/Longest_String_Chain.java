//same as longest increasing subsequence

package Dynamic_programming;
import java.util.*;

class sizecomp implements Comparator<String>{
	 @Override
	 
	 public int compare(String s1,String s2) {
		 if(s1.length()>s2.length()) {
			 return 1;
		 }else if(s1.length()<s2.length()) {
			 return -1;
		 }else {
			 return 0;
		 }
	 }
}

	

public class Longest_String_Chain {
		
		
	public static boolean comp(String s1,String s2) {
			
		int first=0,second=0;
			
		if(s1.length()!=s2.length()+1) {
			return false;
		}
			
		while(first<s1.length()) {
				
		if(s2.length()>second && s1.charAt(first)==s2.charAt(second)) {
			first++;
			second++;
		}else {
			first++;
			}
			}
		
		if(s1.length()==first && s2.length()==second) {
			return true;
		}
		return false;
	}
		
	public static void amin(String args[]) {
			
		ArrayList<String>arr=new ArrayList<>();
		arr.add("a");
		arr.add("b");
		arr.add("ba");
		arr.add("bca");
		arr.add("bda");
		arr.add("bdca");
		//String arr[]= {"a","b","ba","bca","bda","bdca"};
		int n=arr.size();
			
		Collections.sort(arr, new sizecomp());
			
		int dp[]=new int[n];
		int maxi=Integer.MIN_VALUE;
			
		for(int i=1;i<n;i++) {
			for(int p=0;p<i;p++) {
				if(comp(arr.get(i),arr.get(p)) && dp[i]<dp[p]+1) {
					dp[i]=dp[p]+1;
				}
				maxi=Math.max(maxi, dp[i]);
			}
		}
		System.out.println("longest string chain length is "+maxi);
	}
}
