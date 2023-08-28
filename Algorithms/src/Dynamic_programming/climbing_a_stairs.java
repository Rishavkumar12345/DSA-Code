package Dynamic_programming;
import java.util.*;

public class climbing_a_stairs {
	
	static int dp[]=new int[6];
	
	public static Integer find(int index) {
		
		if(index==0) {
			return 1;
		}
		if(index==1) {
			return 1;
		}
		
		int left=find(index-1);
		int right=find(index-2);
		
		return left+right;
	}
	
	//time complexity=O(N) space complexity=O(N)
	public static int find2() {
		
		dp[0]=1;
		dp[1]=1;
		
		for(int i=2;i<=5;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[5];
	}
	
	//time complexity=O(N) space complexity=O(1)
	public static int find3() {
		
		int prev=1;
		int prev1=1;
		
		for(int i=2;i<=5;i++) {
			int curr=prev+prev1;
			prev1=prev;
			prev=curr;
		}
		return prev;
	}
	
	public static void main(String args[]) {
		
		int ans=find(5);
		
		System.out.println("total ways are: "+ ans);
		System.out.println("total ways are: "+ find2());
		System.out.println("total ways are: "+ find3());
	}
}
