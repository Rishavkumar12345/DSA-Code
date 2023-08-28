package Dynamic_programming;
import java.util.*;

public class LCS_of_3_string {
	
	public static int LCS(String x,String y,String z,int i,int j,int k) {
		
		if(i<0 || j<0 || k<0) {
			return 0;
		}
		
		if(x.charAt(i)==y.charAt(j) && y.charAt(j)==z.charAt(k)) {
			return 1+LCS(x,y,z,i-1,j-1,k-1);
		}
		int a=LCS(x,y,z,i-1,j,k);
		int b=LCS(x,y,z,i,j-1,k);
		int c=LCS(x,y,z,i,j,k-1);
		
		return Math.max(a, Math.max(b, c));
	}
	
	public static void main(String args[]) {
		
		String X = "AGGT12";
        String Y = "12TXAYB";
        String Z = "12XBA";
      
        int m = X.length();
        int n = Y.length();
        int o = Z.length();
        
        int ans=LCS(X,Y,Z,m-1,n-1,o-1);
        System.out.println("longest common subsequence length is "+ans);
	}
}
