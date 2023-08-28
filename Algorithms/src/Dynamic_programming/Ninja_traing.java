package Dynamic_programming;
import java.util.*;

public class Ninja_traing {
	
	public static int training(int points[][],int dp[][],int day,int last) {
		
		if(day==0) {
			int maxa=0;
			for(int i=0;i<3;i++) {
				if(i!=last) {
					maxa=Math.max(maxa, points[day][i]);
				}
			}
			return dp[day][last]=maxa;
		}
		
		if(dp[day][last]!=-1) {
			return dp[day][last];
		}
		
		int maxa=0;
		for(int i=0;i<3;i++) {
			if(i!=last) {
				int activity=points[day][i]+training(points,dp,day-1,i);
				maxa=Math.max(maxa, activity);
			}
		}
		return dp[day][last]=maxa;
	}
	
	public static void main(String args[]) {
		
		int[][] points = {{10,40,70},
                {20,50,80},
                {30,60,90}};
		
		int n=points.length;
		int dp[][]=new int[n+1][4];
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<4;j++) {
				dp[i][j]=-1;
			}
		}
		
		int ans=training(points,dp,n-1,3);
		System.out.println(ans);
	}
}
