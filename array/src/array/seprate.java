//place positive number after negative number

package array;

public class seprate {
	    public static void main(String args[]){
	        int arr[]= {0,-10,1,3,-20};
	        
	        int n=arr.length;
	        
	        int i=-1;
	        for(int j=0;j<n;j++) {
	        	if(arr[j]<=0) {
	        		i++;
	        		int temp=arr[i];
	        		arr[i]=arr[j];
	        		arr[j]=temp;
	        	}
	        }
	        
	        for(int k=0;k<n;k++){
	            System.out.print(arr[k]+' ');
	        }
	    }
}
