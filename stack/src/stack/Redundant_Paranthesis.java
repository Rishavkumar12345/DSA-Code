package stack;
import java.util.*;

public class Redundant_Paranthesis {
	public static void main(String args[]) {
		String s="(a+(a+b))";
		int n=s.length();
		
		Stack<Character>st=new Stack<>();
		boolean flag=false;
		
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='+' || s.charAt(i)=='*' || s.charAt(i)=='/' || s.charAt(i)=='-') {
				st.push(s.charAt(i));
			}else if(s.charAt(i)=='(') {
				st.push(s.charAt(i));
			}else if(s.charAt(i)==')') {
				
				if(st.peek()=='(') {
					flag=true;
					break;
				}
				while((s.charAt(i)=='+' || s.charAt(i)=='*' || s.charAt(i)=='/' || s.charAt(i)=='-')) {
					st.pop();
				}
				st.pop();
			}
		}
		
		System.out.println(flag);
	}
}
