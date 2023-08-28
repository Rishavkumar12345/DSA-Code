package stack;

import java.util.*;

public class prefix_evalution {
	
	public int solve(String s) {
		
		Stack<Integer>st=new Stack<Integer>();
		
		for(int i=s.length()-1;i>=0;i--) {
			
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				st.push(s.charAt(i)-'0');
			}else {
				int p1=st.pop();
				int p2=st.pop();
				switch(s.charAt(i)) {
				
				case '+': st.push(p1+p2);
				break;
				
				case '-':st.push(p1-p2);
				break;
				
				case '*':st.push(p1*p2);
				break;
				
				case '/':st.push(p1/p2);
				break;
				}
			}
		}
		return st.peek();
	}
	
	public static void main(String arg[]) {
		/*Scanner sc=new Scanner(System.in);
		String s=sc.next();*/
		prefix_evalution ll=new prefix_evalution();
		int res=ll.solve("-+7*45+20");
		System.out.print(res);
	}
}
