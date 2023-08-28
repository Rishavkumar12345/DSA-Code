package hashing;
import java.util.*;

public class common_element {
	public static void main(String arg[]) {
		
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		int[] a1=new int[n1];
		for(int i=0;i<n1;i++) {
			a1[i]=sc.nextInt();
		}
		
		int n2=sc.nextInt();
		int[] a2=new int[n2];
		for(int i=0;i<n2;i++) {
			a2[i]=sc.nextInt();
		}
		
		HashMap<Integer,Integer>hm=new HashMap<>();
		
		for(int val: a1) {
			if(hm.containsKey(val)) {
				int of=hm.get(val);
				int nf=of+1;
				hm.put(val, nf);
			}else {
				hm.put(val, 1);
			}
		}
		
		System.out.println("common element are:");
		for(int key:a2) {
			if(hm.containsKey(key)) {
				System.out.println(key);
				hm.remove(key);
			}
		}
	}
}
