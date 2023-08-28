//without using space

package array;
import java.util.*;

public class merge_two_sorted_array {
	
	public static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
	}
	
	public static void main(String args[]) {
		
		int arr1[] = {1,4,8,10}; 
		int arr2[] = {2,3,9};
		
		int n=arr1.length;
		int m=arr2.length;
		
		int gap=(int)Math.ceil((double)(n+m)/2.0);

		
		while(gap>0) {
			int i=0,j=gap;
			
			while(j<(n+m)) {
				
				if(j<n && arr1[i]>arr1[j]) {
					swap(arr1[i],arr1[j]);
				}else if(j>=n && i<n && arr1[i]>arr2[j-n]) {
					swap(arr1[i],arr2[j-n]);
				}else if(j>=n && i>=n && arr2[i-n]>arr2[j-n]) {
					swap(arr2[i-n],arr2[j-n]);
				}
				i++;
				j++;
			}
			
			if(gap==1) {
				gap=0;
			}else {
				gap=(int)Math.ceil((float)(gap/2.0));
			}
			
		}
		System.out.print("arr1[]= ");
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i]+' ');
		}
		System.out.println();
		System.out.print("arr2[]= ");
		for(int j=0;j<m;j++) {
			System.out.print(arr2[j]+' ');
		}
	}
}
