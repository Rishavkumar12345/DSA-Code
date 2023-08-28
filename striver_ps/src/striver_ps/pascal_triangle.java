package striver_ps;
import java.util.*;

public class pascal_triangle {
	public static void main(String args[]) {
		
		int n=5;
		ArrayList<ArrayList<Integer>>a=new ArrayList<ArrayList<Integer>>(5);
		ArrayList<Integer>row,pre=null;
		
		for(int i=0;i<n;i++) {
			row=new ArrayList<>();
			for(int j=0;j<=i;j++) {
				if(j==0 || j==i) {
					row.add(1);
				}else {
					row.add(pre.get(j-1)+pre.get(j));
				}				
			}
			pre=row;
			a.add(row);
		}
		
		for(int i=0;i<n;i++) {
			for(int it:a.get(i)) {
				System.out.print(it);
			}
			System.out.println();
		}
	}
}
