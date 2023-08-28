package stack;
import java.util.*;

public class prefix_to_postfix {
	public static void main(String args[]) {
		
		String s="/a+bc";
		Stack<String>st=new Stack<>();
		
		String s1,s2,temp;
		int n=s.length();
		
		for(int i=n-1;i>=0;i--) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				st.push(s.charAt(i)+"");
			}else {
				char ch=s.charAt(i);
				s1=st.pop();
				s2=st.pop();
				temp=s1+s2+ch;
				st.push(temp);
			}
		}
		System.out.println(st.peek());
	}
}
