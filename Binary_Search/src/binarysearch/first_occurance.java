package binarysearch;
import java.util.*;

public class first_occurance {
	
	public static int find(int arr[],int n,int x) {
		int low=0,ans=0;
		int high=n-1;
		int mid;
		
		while(low<=high) {
			mid=(low+high)/2;
			if(arr[mid]==x) {
				ans=mid;
				high=mid-1;
			}else if(arr[mid]>x) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return ans+1;
	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number element: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.print("\nenter elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("\nwhich element first occurance you want ");
		int x=sc.nextInt();
		int result=find(arr,n,x);
		System.out.print("\nelement "+x+" first occur at position "+result);
	}
}
