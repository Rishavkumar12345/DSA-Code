package array;
import java.util.*;

public class quick_sort {
	
	public static void Swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
	}
	
	public static int partation(int arr[],int l,int h) {
		
		int pivot=arr[h];
		int i=l-1;
		
		for(int j=l;j<=h-1;j++) {
			if(arr[j]<pivot) {
				i++;
				Swap(arr[i],arr[j]);
			}
		}
		Swap(arr[i+1],pivot);
		return i+1;
	}
	
	public static void Quick_Sort(int arr[],int l,int h) {
		
		if(l<h) {
			int pi=partation(arr,l,h);
			
			Quick_Sort(arr,l,pi-1);
			Quick_Sort(arr,pi+1,h);
		}	
	}
	
	public static void main(String args[]) {
		int arr[]= {5,2,9,10,3,8};
		int h=arr.length;
		Quick_Sort(arr,0,h-1);
		
		for(int i=0;i<h;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
