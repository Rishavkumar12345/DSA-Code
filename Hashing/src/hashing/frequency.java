package hashing;
import java.util.*;

public class frequency {
	
	public void count(int arr[],int n,int max) {
		int freq[]=new int[max+1];
		
		for(int i=0;i<n;i++) {
			freq[i]=0;
		}
		
		for(int i=0;i<n;i++) {
			freq[arr[i]]++;
		}
		
		System.out.println("value  freq");
		for(int i=0;i<max+1;i++) {
			if(freq[i]>0) {
				System.out.println(i +"       "+ freq[i]);
			}
		}
	}
	
	public static void main(String agrs[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number of element of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		int m=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			m=Math.max(m, arr[i]);
		}
		frequency s=new frequency();
		s.count(arr,n,m);
	}
}
