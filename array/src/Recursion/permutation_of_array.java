package Recursion;
import java.util.*;

public class permutation_of_array {
	
	public static void swap(int i,int j,int arr[]) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void printper2(int arr[],int idx,ArrayList<ArrayList<Integer>>ans) {
		
		if(idx==arr.length) {
			ArrayList<Integer>a=new ArrayList<>();
			for(int i=0;i<arr.length;i++) {
				a.add(arr[i]);
			}
			ans.add(new ArrayList<>(a));
			return;
		}
		
		for(int i=idx;i<arr.length;i++) {
			swap(i,idx,arr);
			printper2(arr,idx+1,ans);
			swap(i,idx,arr);	
		}
	}
	
	/*public static void printper1(int arr[],boolean vis[],ArrayList<Integer>ds,ArrayList<ArrayList<Integer>>ans) {
		
		if(ds.size()==arr.length) {
			ans.add(new ArrayList<>(ds));
			return;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(vis[i]==false) {
				vis[i]=true;
				ds.add(arr[i]);
				printper1(arr,vis,ds,ans);
				ds.remove(ds.size()-1);
				vis[i]=false;
			}
		}
	}*/
	
	public static void display(ArrayList<ArrayList<Integer>>ans) {
		for(int i=0;i<ans.size();i++) {
			for(int it:ans.get(i)) {
				System.out.print(it+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		
		int arr[]= {1,2,3};
		
		//approach 1==uses of extra space
		
		/*boolean vis[]=new boolean[arr.length];
		ArrayList<ArrayList<Integer>>ans=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer>ds=new ArrayList<>();
		printper1(arr,vis,ds,ans);
		
		display(ans);*/
		
		//approach 2=without using extra space(using swapping)
		ArrayList<ArrayList<Integer>>ans=new ArrayList<ArrayList<Integer>>();
		printper2(arr,0,ans);
		display(ans);
	}
}
