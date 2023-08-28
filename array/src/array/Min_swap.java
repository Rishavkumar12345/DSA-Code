//minimum number of swaps required to sort the array java

package array;
import java.util.*;

public class Min_swap {
	
	public static void swap(int a,int b,int arr[]) {
		int temp=arr[b];
		arr[b]=arr[a];
		arr[a]=temp;
	}
	
	public static int minswap(int arr[],int temp[],int n,int cnt) {
		HashMap<Integer,Integer>hm=new HashMap<>();
		
		for(int i=0;i<n;i++) {
			hm.put(arr[i],i);
		}
		
		for(int i=0;i<n;i++) {
			if(arr[i]==temp[i]) {
				continue;
			}else {
				int ind=hm.get(temp[i]);
				hm.put(arr[i],ind);
				swap(ind,i,arr);
				cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String args[]) {
		
		int arr[]= {6,4,2,14,8,10,12,16};
		int n=arr.length;
		
		int temp[]=new int[n];
		for(int i=0;i<n;i++) {
			temp[i]=arr[i];
		}
		Arrays.sort(temp);
		
		
		int cnt=0;
		int ans=minswap(arr,temp,n,cnt);
		System.out.println("minimum number of swaps required to sort the array "+ans);
	}
}
