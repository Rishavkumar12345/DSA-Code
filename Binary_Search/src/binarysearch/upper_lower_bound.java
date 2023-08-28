package binarysearch;
import java.util.*;

public class upper_lower_bound {
	
	//lower_bound>=x
	public static int lower_bound(int arr[],int n,int x) {
		int ans=0,mid;
		int low=0;
		int high=n-1;
		
		while(low<=high) {
			mid=(low+high)/2;
			if(arr[mid]>=x) {
				ans=mid;
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return ans+1;
	}
	
	//upper_bound>x
	public static int upper_bound(int arr[],int n,int x) {
		int ans=0,mid;
		int low=0;
		int high=n-1;
		
		while(low<=high) {
			mid=(low+high)/2;
			
			if(arr[mid]<=x) {
				low=mid+1;
			}else {
				ans=mid;
				high=mid-1;
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
		
		System.out.print("\nwhich element upper bound you want ");
		int x=sc.nextInt();
		System.out.println("\nupper bound: "+upper_bound(arr,n,x));
		
		System.out.print("\nwhich element lower bound you want ");
		int y=sc.nextInt();
		System.out.println("\nlower bound: "+lower_bound(arr,n,y));
		
		//count occurance of nummber
		
	}
}
