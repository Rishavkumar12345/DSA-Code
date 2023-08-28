package pattern;
import java.util.*;

public class pattern3 {
	public static void main(String args[]) {
		
		int n=5;
		
		for(int i=0;i<=n;i++) {
			for(int j=n-i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
