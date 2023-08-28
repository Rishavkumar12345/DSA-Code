package Dynamic_programming;
import java.util.*;

public class wildcard_entry {
	
	//memoiazation
	/*public static int check(String s1,String s2,int i,int j,int dp[][]) {
		
		if(i<0 && j<0) {
			return 1;  //both string exhust;
		}
		
		if(i<0 && j>=0) {
			return 0;  //first string exhust and second string is still remaining
		}
		
		if(i>=0 && j<0) {				//second string exhust and fisrt still remaining
			for(int k=0;k<=i;k++) {
				if(s1.charAt(k)!='*') {
					return 0;
				}
			}
			return 1;
		}
		
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		
		if((s1.charAt(i)==s2.charAt(j)) || s1.charAt(i)=='?') {
			return dp[i][j]=check(s1,s2,i-1,j-1,dp);
		}else {
			return dp[i][j]=(check(s1,s2,i-1,j,dp)|| (check(s1,s2,i,j-1,dp)))?1:0;
		}
	}*/
	
	//recursion
	public static boolean check(String s1,String s2,int i,int j) {
		
		if(i<0 && j<0) {
			return true;  //both string exhust;
		}
		
		if(i<0 && j>=0) {
			return false;  //first string exhust and second string is still remaining
		}
		
		if(i>=0 && j<0) {				//second string exhust and fisrt still remaining
			for(int k=0;k<=i;k++) {
				if(s1.charAt(k)!='*') {
					return false;
				}
			}
			return true;
		}
		
		if((s1.charAt(i)==s2.charAt(j)) || s1.charAt(i)=='?') {
			return check(s1,s2,i-1,j-1);
		}else {
			return check(s1,s2,i-1,j)||check(s1,s2,i,j-1);
		}
	}
	
	public static void main(String args[]) {
		
		  String s1 = "ab*cd";
		  String s2 = "abdefcd";
		  
		  int n=s1.length();
		  int m=s2.length();
		  
		  /*int dp[][]=new int[n][m];
		  for(int[] row:dp) {
			  Arrays.fill(row,-1);
		  }*/
		  
		  boolean ans=check(s1,s2,n-1,m-1);
		  System.out.println("string s1 matches with s2: "+ans);
	}
}
