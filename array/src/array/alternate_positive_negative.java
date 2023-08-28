package array;
import java.util.*;

public class alternate_positive_negative {
	public static void main(String args[]) {
		
		int arr[] = {-1,2,-3,4,5,6,-7,8,9};
		int n=arr.length;
		
		Arrays.sort(arr);
		
		int j;
		for(j=0;j<n;j++) {
			if(arr[j]>0) {
				break;
			}
		}
		int i=1;
		while(i<n && j<n) {
			if(arr[i]<0 && arr[j]>0 ) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			i+=2;
			j++;
		}
		
		
		for(int k=0;k<n;k++) {
			System.out.print(arr[k]+" ");
		}
	}
}
