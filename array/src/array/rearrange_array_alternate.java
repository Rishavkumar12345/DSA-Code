//first element will be largest second element will be smallest ,
//third element will be second largest,fourth element will be seond smallest element;
//example=15,1,14,2,13,3

package array;
import java.util.*;

public class rearrange_array_alternate {
	public static void main(String args[]) {
		
		int arr[]= {1,2,3,4,5,6};
		int n=arr.length;
		
		int me=arr[n-1]+1;
        int minidx=0,maxidx=n-1;
        
        for(int i=0;i<n;i++){
            
            if(i%2==0){
                arr[i]=arr[i]+arr[maxidx]%me*me;
                maxidx--;
            }else{
                arr[i]=arr[i]+arr[minidx]%me*me;
                minidx++;
            }
        }
        
        for(int i=0;i<n;i++){
            arr[i]=arr[i]/me;
            System.out.print(arr[i]+" ");
        }
	}
}
