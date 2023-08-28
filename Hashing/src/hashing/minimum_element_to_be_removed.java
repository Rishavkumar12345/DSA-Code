package hashing;
import java.util.*;

public class minimum_element_to_be_removed {
	public static void main(String arg[]) {
		
		int arr[]= {4, 3, 2, 1, 0, 5};
		
		HashMap<Integer,Integer>hm=new HashMap<>();
		
		for(int it:arr) {
			if(hm.containsKey(it)) {
				int of=hm.get(it);
				int nf=of+1;
				hm.put(it, nf);
			}else {
				hm.put(it, 1);
			}
		}
		
		int maxa=0;
		for(int it:arr) {
			if(hm.containsKey(it)) {
				maxa=Math.max(maxa, hm.get(it));
			}
		}
		
		System.out.print("Minimum number of need to remove is "+(arr.length-maxa));
	}
}
