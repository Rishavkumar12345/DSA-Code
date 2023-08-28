package Dynamic_programming;
import java.util.*;

public class Minimum_number_of_square {
	
	static int N=(int)1e5+9;
	static int dp[]=new int[N];
	static int mod=(int)1e9+1;
	
	public static int num(int n) {
		
		if(n==0 || n==1 || n==2 || n==3) {
			return n;
		}
		
		if(dp[n]!=mod) {
			return dp[n];
		}
		
		for(int i=1;i*1<=n;i++) {
			dp[n]=Math.min(dp[n],num(n-i*i)+1);
		}
		return dp[n];
	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number: ");
		
		int n=sc.nextInt();
		
		for(int i=0;i<=N+1;i++) {
			dp[i]=mod;
		}
		System.out.println(num(n));
	}
}
