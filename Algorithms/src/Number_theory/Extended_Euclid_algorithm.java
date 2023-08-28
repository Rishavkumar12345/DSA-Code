package Number_theory;
import java.util.*;

class triplet{
	int x;
	int gcd;
	int y;
}

public class Extended_Euclid_algorithm {
	
	public static triplet extendeuclid(int a,int b) {
		
		if(b==0) {
			triplet ans = null;
			ans.x=1;
			ans.gcd=a;
			ans.y=0;
			return ans;
		}
		
		triplet small=extendeuclid(b,a%b);
		triplet ans=null;
		ans.gcd=small.gcd;
		ans.x=small.y;
		ans.y=small.x-(a/b)*small.y;
		return ans;
	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
	
		triplet ans=extendeuclid(a,b);
		System.out.println(ans.gcd+" "+ans.x+" "+ans.y);
	}
}
