package array;
import java.uitl.*;

public class maximum_product_Subset {
	
	public static int maxproductsubset(int arr[],int n) {
		
		int count_neg=0,count_zero=0,prod=1;
		int min=Integer.MIN_VALUE;
		
		
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				count_neg++;
				min=Math.max(min,arr[i]);
			}else if(arr[i]==0) {
				count_zero++;
				continue;
			}
			
			prod*=arr[i];
		}
		
		if(count_zero==n) {
			return 0;
		}
		
		if(count_neg%2==1) {
			
			if(count_neg+count_zero==n && count_zero>0 && count_neg==1) {
				return 0;
			}
			prod=prod/min;
		}
		return prod;
	}
	
	public static void main(String args[]) {
		
		int a[] = {-1, -1, -2, 4, 3};
        int n = a.length;
        System.out.println(maxproductsubset(a, n));
	}
}
