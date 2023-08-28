package hashing;
import java.util.*;

public class four_sum {
	
	public static boolean search(int arr[],int s,int e,int key) {
		
		for(int i=s;i<=e;i++) {
			int mid=(s+e)/2;
			if(arr[mid]==key){
				return true;
			}else if(arr[i]>key){
				s=mid+1;
			}else if(arr[i]<key) {
				e=mid-1;
			}
		}
		return false;
	}
	
	public static void main(String arg[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter target element ");
		int target=sc.nextInt();
		
		int[] arr= {4,3,3,4,4,2,1,2,1,1};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			HashSet<Integer>hs=new HashSet<>();
			int curr_sum=target-arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(hs.contains(curr_sum-arr[j])) {
					System.out.printf("Triplet is %d %d %d",arr[i],arr[j],curr_sum-arr[j] );
					return;
				}
				hs.add(arr[j]);
			}
		}
		return;
	}
}
