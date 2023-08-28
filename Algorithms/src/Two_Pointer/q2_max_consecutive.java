package Two_Pointer;
import java.util.*;

public class q2_max_consecutive {
	public static void main(String args[]) {
		
		int arr[]= {1,1,1,0,0,1,1,0};
		int n=arr.length;
		
		int count=1;
		int maxa=0;
		int val=-1;
		
		for(int i=0;i<n-1;i++) {
			
			if(arr[i]==arr[i+1]) {
				count++;
			}else {
				if(count>maxa) {
					maxa=count;
					val=arr[i];
				}
				count=1;
			}
		}
		
		System.out.print("value repeated: " + val + " = "+maxa);
	}
}
