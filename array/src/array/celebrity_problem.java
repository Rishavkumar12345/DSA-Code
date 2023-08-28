package array;
import java.util.*;

public class celebrity_problem {
	public static void main(String args[]) {
		
		int n=4;
		int mat[][]= {{0,0,1,0},{0,0,1,0},{0,0,0,0},{0,0,1,0}};
		
		
		
		Stack<Integer>st=new Stack<>();
		
		for(int i=0;i<n;i++) {
			st.push(i);
		}
		
		while(st.size()>1) {
			int i=st.peek();
			st.pop();
			int j=st.peek();
			st.pop();
			
			if(mat[i][j]==1) {
				st.push(j);
			}else {
				st.push(i);
			}
		}
		
		int a=st.pop();
		
		for(int i=0;i<n;i++) {
			if(mat[i][a]==1 && i!=a) {
				continue;
			}
			if(mat[a][i]==0) {
				continue;
			}else {
				System.out.println("no celebrity");
				return;
			}
		}
		System.out.println("celebrity id is "+a);
		
	}
}
