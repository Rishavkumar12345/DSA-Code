package Greedy;
import java.util.*;

public class fractional_knapscak {
	public static void main(String args[]) {
		
		int value[]= {60,100,120};
		int weight[]= {10,20,30};
		
		int wt=50;
		int sum=0;
		int temp=0;
		
		for(int i=0;i<value.length;i++) {
			
			if(weight[i]<wt && wt!=0) {
				sum+=value[i];
				wt-=weight[i];
			}else if(weight[i]>wt && wt!=0) {
				temp=value[i]/weight[i];
				sum+=temp*(wt);
			}else if(wt==0) {
				break;
			}
		}
		
		System.out.print("Maximum value in knapscak is "+sum);
	}
}
