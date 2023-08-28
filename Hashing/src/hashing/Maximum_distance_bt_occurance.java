package hashing;
import java.util.*;

public class Maximum_distance_bt_occurance {
	public static void main(String args[]) {
		
		int arr[]={3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
		
		HashMap<Integer,Integer>hm=new HashMap<>();
		
		int maxa=0;
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				maxa=Math.max(maxa, i-hm.get(arr[i]));
			}else {
				hm.put(arr[i], i);
			}
		}
		
		System.out.print("Maximum distance between two occurrences of same element in array is "+ maxa);
	}
}
