package stack;
import java.util.Stack;

public class infix_to_postfix {
	
	public static int prec(char ch) {
		
		
		if(ch=='^') {
			return 3;
		}else if(ch=='*' || ch=='/') {
			return 2;
		}else if(ch=='+' || ch=='-') {
			return 1;
		}
		
		return 0;
	}
	
	public static void main(String args[]) {
		
		String s="a+b*(c^d-e)^(f+g*h)-i";
		Stack<Character>st=new Stack<>();
		String res="";
		
		int n=s.length();
		
		for(int i=0;i<n;i++) {
			char ch=s.charAt(i);
			
			if(ch>='a' && ch<='z') {
				res+=ch;
			}else if(ch=='(') {
				st.push(ch);
			}else if(ch==')') {
				while(!st.isEmpty() && st.peek()!='(') {
					res+=st.pop();
				}
				st.pop();
			}else {
				while(!st.isEmpty() && prec(ch)<=prec(st.peek())) {
					res+=st.pop();
				}
				st.push(ch);
			}
		}
		
		while(!st.isEmpty()) {
			res+=st.pop();
		}
		System.out.println(res);
	}
}
