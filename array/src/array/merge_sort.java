package array;

public class merge_sort {
	
	public static void merge(int arr[],int start,int mid,int end) {
		int a[]=new int[end-start+1];
		int idk1=start;
		int idk2=mid+1;
		int x=0;
		
		while(idk1<=mid && idk2<=end) {
			
			if(arr[idk1]<=arr[idk2]) {
				a[x]=arr[idk1];
				idk1++;
			}else {
				a[x]=arr[idk2];
				idk2++;
			}
			x++;
		}
		
		while(idk1<=mid) {
			a[x]=arr[idk1];
			idk1++;
			x++;
		}
		
		while(idk2<=end) {
			a[x]=arr[idk2];
			idk2++;
			x++;
		}
		
		for(int i=0,j=start;i<a.length;i++,j++) {
			arr[j]=a[i];
		}
		
	}
	
	public static void divide(int arr[],int start,int end) {
		
		
		if(start>=end) {
			return;
		}
		int mid=start+(end-start)/2;
		divide(arr,start,mid);
		divide(arr,mid+1,end);
		merge(arr,start,mid,end);
	}
	
	public static void main(String args[]) {
		int arr[]= {2,1,8,5,0,6};
		int n=arr.length;
		divide(arr,0,n-1);
		System.out.println("sorted array: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
