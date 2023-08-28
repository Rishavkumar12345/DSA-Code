//ninja training

package Dynamic_programming;
import java.util.*;

public class Ninja_Training {
	
	public static int f(int p[][],int dp[][],int day,int last) {
		
		if(day==0) {
			int maxi=0;
			for(int i=0;i<3;i++) {				
				if(i!=last) {
					maxi=Math.max(maxi,p[day][i]);
				}				
			}
			return dp[day][last]=maxi;
		}
		
		int maxi=0;
		
		for(int i=0;i<3;i++) {
			if(i!=last) {
				int act=p[day][i]+f(p,dp,day-1,i);
				maxi=Math.max(maxi, act);
			}
		}
		return dp[day][last]=maxi;
	}
	
	public static void main(String args[]) {
		
		int point[][]={{10,40,70},
                {20,50,80},
                {30,60,90}};
		
		int n=point.length;
		int dp[][]=new int[n][4];
		
		for (int[] row: dp)
            Arrays.fill(row, -1);
		
		int result=f(point,dp,n-1,3);
		System.out.println(result);
	}
}
