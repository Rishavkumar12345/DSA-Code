package hashing;
import java.util.*;

public class longest_subsquence {
	public static void main(String arg[]) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		HashMap<Integer,Boolean>hm=new HashMap<>();
		
		for(int val:arr) {
			hm.put(val, true);
		}
		
		for(int val:arr) {
			if(hm.containsKey(val-1)) {
				hm.put(val, false);
			}
		}
		
		int ml=0,msp=0;
		for(int key:arr) {
			if(hm.containsKey(key)==true) {
				int t=1;
				int tsp=key;
				
				while(hm.containsKey(tsp+t)) {
					t++;
				}
				
				if(t>ml) {
					ml=t;
					msp=tsp;
				}
			}
		}
		
		System.out.println("longest subsquence of array is: ");
		for(int i=0;i<ml;i++) {
			System.out.println(msp+i);      //if msp=2 then msp+i=2+1,2+2,.....
		}
	}
}
