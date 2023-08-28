package stack;
import java.util.*;

public class check_balance_para {
	public static void main(String args[]) {
		
		String s="[()]{}{[()()]()}";
		Stack<Character>st=new Stack<>();
		boolean ans=true;
		
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			
			if(ch=='[' || ch=='{' || ch=='(') {
				st.push(ch);
			}else if(ch==')') {
				if(!st.isEmpty() && st.peek()=='(') {
					st.pop();
				}else {
					ans=false;
					break;
				}
			}else if(ch=='}') {
				if(!st.isEmpty() && st.peek()=='{') {
					st.pop();
				}else {
					ans=false;
					break;
				}
			}else if(ch==']') {
				if(!st.isEmpty() && st.peek()=='[') {
					st.pop();
				}else {
					ans=false;
					break;
				}
			}
		}
		
		if(!st.isEmpty()) {
			ans=false;
		}
		
		if(ans==false) {
			System.out.println("paranthesis is not balance");
		}else {
			System.out.println("paranthesis is  balance");
		}
	}
}
