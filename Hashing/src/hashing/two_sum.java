package hashing;
import java.util.*;

public class two_sum {
	public static void main(String arg[]) {
		
		int[] arr= {1,5,6,8,10};
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter target element: ");
		int target=sc.nextInt();
		
		HashMap<Integer,Integer>hm=new HashMap<>();
		
		int first = 0,second=0;
		
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(target-arr[i])) {
				first=arr[i];
				second=target-arr[i];
				break;
			}
				hm.put(arr[i],i);
			
		}
		
		System.out.println(first + " " + second);
		
	}
}
