package Greedy;
import java.util.*;

class activity{
	int start;
	int finish;
	
	activity(int a,int b){
		start=a;
		finish=b;
	}
}

class compare{
	
	public static void compareit(activity arr[],int n) {
		
		Arrays.sort(arr,new Comparator<activity>() {
			
			@Override
			public int compare(activity o1, activity o2) {
				// TODO Auto-generated method stub
				return o1.finish-o2.finish;
			}
		});
	}
}

public class pratice {
	
	public static void findactivity(activity arr[],int n) {
		
		compare obj=new compare();
		obj.compareit(arr, n);
		
		System.out.println("( "+arr[0].start + ","+arr[0].finish+" )");
		int j=0;
		for(int i=1;i<n;i++) {
			if(arr[i].start>=arr[j].finish) {
				System.out.println("( "+arr[i].start + ","+arr[i].finish+" )");
				j=i;
			}
		}
	}
	
	public static void main(String args[]) {
		
		activity arr[]=new activity[6];
		arr[0]=new activity(5,9);
		arr[1]=new activity(1,2);
		arr[2]=new activity(3,4);
		arr[3]=new activity(0,6);
		arr[4]=new activity(5,7);
		arr[5]=new activity(8,9);
		
		findactivity(arr,6);
	}
}
