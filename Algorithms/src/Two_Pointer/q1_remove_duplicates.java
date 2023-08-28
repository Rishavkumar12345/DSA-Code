package Two_Pointer;
import java.util.*;
public class q1_remove_duplicates {
	public static void main(String args[]) {
		
		int arr[]= {1,1,1,2,2,3,3,4,5,6,6,8};
		int n=arr.length;
		
		int i=0;
		
		for(int j=1;j<n;j++) {
			if(arr[i]!=arr[j]) {
				i++;
				arr[i]=arr[j];
			}
		}
		
		for(int j=0;j<i+1;j++) {
			System.out.print(arr[j]+" ");
		}
	}
}
