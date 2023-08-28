//Checking for ith Set Bit

package bit_manipulation;
import java.util.*;

public class check_for_set_bit {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter index no.: ");
		int i=sc.nextInt();
		int a=12;
		
		int mask=1<<i;
		int res=mask & a;
		
		if(res!=0) {
			System.out.println("ith bit is set");
		}else {
			System.out.println("ith bit is not set");
		}
	}
}
