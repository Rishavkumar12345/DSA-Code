package graph;
import java.util.*;

public class factorial_of_large_number {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number: ");
		int n=sc.nextInt();
		
		ArrayList<Integer>l=new ArrayList<>();
		
		l.add(1);
		
		for(int i=2;i<=n;i++) {
			int carry=0;
			
			for(int j=l.size()-1;j>=0;j--) {
				int val=l.get(j)*i+carry;
				l.set(j,val%10);
				carry=val/10;
			}
			
			while(carry!=0) {
				l.add(carry%10);
				carry/=10;
			}
		}
		//Collections.reverse(l);
		System.out.println();
		for(int i=0;i<l.size();i++) {
			System.out.print(l.get(i));
		}
	}
}
