package tries;
import java.util.*;

class tri{
	tri[] bit=new tri[2];
	
	tri() {
	}
}

public class MAX_XOR_of_two_number_of_two_array {
	
	static tri root;
	
	public static void insert(int n) {
		
		tri temp=root;
		
		for(int i=31;i>=0;i--) {
			int index=(n>>i)&1;
			if(temp.bit[index]==null) {
				temp.bit[index]=new tri();
			}
			temp=temp.bit[index];
		}
	}
	
	public static int getmax(int n) {
		tri temp=root;
		
		int max=0;
		for(int i=31;i>=0;i--) {
			int index=(n>>i)&1;
			if(temp.bit[1-index]!=null) {
				max=max|(1<<i);
				temp=temp.bit[1-index];
			}else {
				temp=temp.bit[index];
			}
		}
		return max;
	}
	
	public static void main(String args[]) {
		
		int arr1[]= {6,8};
		int arr2[]= {7,8,2};
		
		root=new tri();
		
		for(int i=0;i<arr1.length;i++) {
			insert(arr1[i]);
		}
		
		int max=0;
		for(int i=0;i<arr2.length;i++) {
			max=Math.max(max, getmax(arr2[i]));
		}
		System.out.println("Maximum XOR of two number from two array is: "+max);
	}
}
