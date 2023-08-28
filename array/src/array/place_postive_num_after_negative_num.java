package array;
import java.util.*;

public class place_postive_num_after_negative_num {
	public static void main(String args[]) {
		
		int arr[]= {-12,11,-13,-5,6,-7,5,-3,-6};
		int n=arr.length;
		
		int j=0,i=0;
		
		while(j<n) {
			
			if(arr[j]>=0) {
				j++;
			}else {
				for(int k=j;k>i;k--) {
					int temp=arr[k];
					arr[k]=arr[k-1];
					arr[k-1]=temp;
				}
				i++;j++;
			}
		}
		
		for(int a=0;a<n;a++) {
			System.out.print(arr[a]+" ");
		}
	}
}
