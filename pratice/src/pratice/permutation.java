package pratice;
import java.util.*;

public class permutation {
	
	public static void printper(int arr[],boolean vis[],ArrayList<Integer>ds,ArrayList<ArrayList<Integer>>ans){
		
		if(ds.size()==arr.length) {
			ans.add(new ArrayList<>(ds));
			return;
		}
		
		for(int i=0;i<arr.length;i++) {
			
			if(vis[i]==false) {
				vis[i]=true;
				ds.add(arr[i]);
				printper(arr,vis,ds,ans);
				ds.remove(ds.size()-1);
				vis[i]=false;
			}
		}
	}
	
	public static void main(String args[]) {
		
		int arr[]= {1,2,3};
		
		boolean vis[]=new boolean[arr.length];
		
		ArrayList<ArrayList<Integer>>ans=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer>ds=new ArrayList<>();
		
		printper(arr,vis,ds,ans);
		
		for(int i=0;i<ans.size();i++) {
			for(int it:ans.get(i)) {
				System.out.print(it+" ");
			}
			System.out.println();
		}
	}
}
