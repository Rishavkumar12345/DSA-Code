

package Dynamic_programming;
import java.util.*;

public class Fibonacci_sequence {
	
	static int dp[]=new int[(int) (1e5+9)];
	
	
	public static int fib(int n) {
		
		if(n==0 || n==1) {
			return n;
		}
		
		if(dp[n]!=-1) {
			return dp[n];
		}
		dp[n]=fib(n-1)+fib(n-2);
		return dp[n];
	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");
		int n=sc.nextInt();
		
		for(int i=0;i<n+1;i++) {
			dp[i]=-1;
		}
		
		int ans=fib(n);
		System.out.println(ans);
	}
}
