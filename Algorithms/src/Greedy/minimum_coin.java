package Greedy;
import java.util.*;

public class minimum_coin {
	public static void main(String arg[]) {
		
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		
		int arr[]= {1,2,5,10,20,50,100,200,500,2000};
		
		int sum=v;
		int prev=2000;
		int count=0;
		ArrayList<Integer>list=new ArrayList<>();
		
		for(int i=arr.length-1;i>=0;i--) {
			
			if(sum==0) {
				break;
			}else if(arr[i]>sum) {
				continue;
			}else {
				while(arr[i]<=sum){
					sum=sum-arr[i];
					list.add(arr[i]);
					if(prev!=arr[i]) {
						count++;
						prev=arr[i];
					}
				}
			}				
		}
		System.out.println("Minimum no. of coin require is "+count);
		for(Integer it:list) {
			System.out.print(it + " ");
		}
		
	}
}
