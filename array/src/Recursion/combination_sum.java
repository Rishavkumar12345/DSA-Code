//print all combination whose sum equal to given target,
//one element can be taken any nuber of time

package Recursion;
import java.util.*;

public class combination_sum {
	
	public static List<List<Integer>> findcombination(int i,int arr[],int target,List<List<Integer>>ans,List<Integer>ds){
		
		if(i==arr.length) {
			if(target==0) {
				ans.add(new ArrayList<>(ds));
			}
			return ans;
		}
		
		if(arr[i]<=target) {
			ds.add(arr[i]);
			findcombination(i,arr,target-arr[i],ans,ds);
			ds.remove(ds.size()-1);
		}
		findcombination(i+1, arr, target, ans, ds);
		return ans;
	}
	
	public static void main(String args[]) {
		
		int arr[]={2,3,6,7};
		int target=7;
		
		List<List<Integer>>ans=new ArrayList<>();
		List<List<Integer>>ls=findcombination(0,arr,target,ans,new ArrayList<>());
		
		System.out.println("combination are: ");
		
		for(int i=0;i<ls.size();i++) {
			for(int j=0;j<ls.get(i).size();j++) {
				System.out.print(ls.get(i).get(j));
			}
			System.out.println();
		}
	}
}
