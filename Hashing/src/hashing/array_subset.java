package hashing;
import java.util.*;


//using hashmap
public class array_subset {
	
	public static boolean check(int a1[],int a2[],int n,int m) {
		
		HashSet<Integer>hm=new HashSet<>();
		
		for(int i=0;i<n;i++) {
			hm.add(a1[i]);
		}
		
		for(int i=0;i<m;i++){
			if(!hm.contains(a2[i])) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String args[]) {
		
		int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 5, 7, 1 };
 
        int n = arr1.length;
        int m = arr2.length;
        
        if(check(arr1,arr2,n,m)) {
        	System.out.print("array 2 is a subset of array 1");
        }else {
        	System.out.print("array 2 is  not a subset of array 1");
        }
	}
}
